package interfejsMenjacnica;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface interfejsMenjacnica {
	public void dodajKurs(GregorianCalendar datum ,String naziv, String skraceniNaziv, double prodajniKurs, double srednjiKurs, double kupovniKurs);
	public void obrisiKurs (GregorianCalendar datum, String naziv);
    public Valuta pronadjiKurs (GregorianCalendar datum, String naziv);
}
