package domaci3;

/*Sportista poseduje ime, prezime i godinu rodjenja. Ime, prezime i godina rodjenja se 
 * zadaju prilikom kreiranja i ne mogu da se promene. 
 * Sportistu ispisati u obliku: IME_PREZIME: godinaRodjenja
*/

public class Sportista {

	private String ime;
	private String prezime;
	private int godiste;

	public Sportista(String ime, String prezime, int godiste) {
		this.ime = ime;
		this.prezime = prezime;
		this.godiste = godiste;
	}

	public String toString() {

		return ime.toUpperCase() + "_" + prezime.toUpperCase() + ": " + godiste;
	}
}
