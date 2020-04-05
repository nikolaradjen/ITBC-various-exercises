package pozoriste;

public class Zaposleni {

	// Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i
	// pozoristem u kojem je zaposlen.
	// Svi podaci mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku
	// ime[naziv_pozorista].

	protected String imePrezime;
	protected Pozoriste pozoristeZaposlenog;

	public Zaposleni(String imePrezime, Pozoriste pozoristeZaposlenog) {
		this.imePrezime = imePrezime;
		this.pozoristeZaposlenog = pozoristeZaposlenog;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public Pozoriste getPozoristeZaposlenog() {
		return pozoristeZaposlenog;
	}

	@Override
	public String toString() {
		return imePrezime + "[" + pozoristeZaposlenog.getNaziv() + "]";
	}
}
