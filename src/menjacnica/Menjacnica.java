package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejsMenjacnica.interfejsMenjacnica;

public class Menjacnica implements interfejsMenjacnica {
	
	private LinkedList<Valuta> valute;

	public void dodajKurs(GregorianCalendar datum, String naziv,
			String skraceniNaziv, double prodajniKurs, double srednjiKurs,
			double kupovniKurs) {

		Valuta v=new Valuta();
		v.setDatum(datum);
		v.setKupovniKurs(kupovniKurs);
		v.setProdajniKurs(prodajniKurs);
		v.setSrednjiKurs(srednjiKurs);
		if (!(valute.contains(v))) {
			valute.add(v);
		}
		else {
			try {
				throw new Exception("Zadata valuta je vec u bazi!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void obrisiKurs(GregorianCalendar datum, String naziv) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i)!=null){
				Valuta v=valute.get(i);
					if (v.getNaziv().equals(naziv) && v.getDatum().equals(datum)) {
						valute.remove(i);
					}
			 }
		}
	}


	public Valuta pronadjiKurs(GregorianCalendar datum, String naziv) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i)!=null){
				Valuta v=valute.get(i);
					if(v.getNaziv().equals(naziv) && v.getDatum().equals(datum)) {
					return valute.get(i);
				}
			}
		}
		System.out.println("Razlika u kodu koja sprecava merge");
	return null;
	}
}
