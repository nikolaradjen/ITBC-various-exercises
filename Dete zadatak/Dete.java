package klikeri;

public class Dete {

	/*
	 * Dete ima ime, prezime, broj godina i broj klikera. Napraviti mogucnost da se
	 * kreira vise objekata klase Dete. Ako se pozove metoda dodajKlikere ili metoda
	 * oduzmiKlikere, broj klikera se azurira. Napraviti metodu koja ce ispisivati
	 * broj klikera i metodu koja ispisuje prosecan broj decjih godina (ako imamo
	 * troje dece, broj prosecnih godina za njih troje; ako imamo dvoje racunamo
	 * prosecne godine za to dvoje) .
	 * 
	 */

	private String ime;
	private String prezime;
	private int godine;
	private int brKlikera;

	public Dete(String ime, String prezime, int godine, int brKlikera) {
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
		this.brKlikera = brKlikera;
	}

	public int getBrKlikera() {
		return brKlikera;
	}

	public int getGodine() {
		return godine;
	}

	public void dodajKlikere(int brKlik) {
		brKlikera += brKlik;

	}

	public void oduzmiKlikere(int brKlik) {
		brKlikera -= brKlik;
	}

}
