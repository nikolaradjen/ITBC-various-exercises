package ucionica;

public class Polaznik {

	// Polaznik ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
	// Ime i prezime polaznika se moze dohvatiti ali ne i postaviti.
	// Polaznik se ispisuje u obliku: IME_PREZIME.

	private String ime;
	private String prezime;

	public Polaznik(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}
	
	public String toString() {
		return ime.toUpperCase() + "_" + prezime.toUpperCase();
	}
}
