package menjacnica;

public class Valuta {

	String naziv;
	String skraceniNaziv;
	double prodajniKurs;
	double srednjiKurs;
	double kupovniKurs;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv.length()==0) throw new RuntimeException("Morate uneti naziv valute!");
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv.length()>3 || skraceniNaziv.length()==0) throw new RuntimeException("Unesite ispravan skraceni naziv valute!");
		this.skraceniNaziv = skraceniNaziv;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs<0) throw new RuntimeException ("Morate uneti prodajni kurs!");
		this.prodajniKurs = prodajniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs<0) throw new RuntimeException ("Morate uneti srednji kurs!");
		this.srednjiKurs = srednjiKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs<0) throw new RuntimeException ("Morate uneti kupovni kurs!");
		this.kupovniKurs = kupovniKurs;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Valuta){
		Valuta v = (Valuta) (obj);
		if(skraceniNaziv.equals(v.getSkraceniNaziv())) return true;
		}
		return false;
	}
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv
				+ ", prodajniKurs=" + prodajniKurs + ", srednjiKurs="
				+ srednjiKurs + ", kupovniKurs=" + kupovniKurs + "]";
	}
	
	
	
	
}
