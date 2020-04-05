package domaci3;

public class Klub {

//Klub poseduje naziv, sediste (grad), godinu osnivanja i niz sportista tipa Sportista.
//Sva polja mogu da se dohvate, a naziv kluba moze i da se postavi.
//Napisati metodu koja ce ispisati ceo objekat klase klub.

	private String naziv;
	private String grad;
	private int godOsn;
	private Sportista[] sportista;
//ovde treba sa nizom Sportista
	public Klub(String naziv, String grad, int godOsn, Sportista[] sportista) {

		this.naziv = naziv;
		this.grad = grad;
		this.godOsn = godOsn;
		this.sportista = sportista;
	}
	
	
	public String toString() {
		String ss = "";
		for (int i = 0; i < sportista.length; i++) {
			ss += sportista[i].toString();
			if (i != sportista.length-1) {
				ss +=", ";
			}
			
		}
		return "("+ ss + ")" + "\n" + naziv + "\n" + grad + "\n" + godOsn;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getGrad() {
		return grad;
	}

	public int getGodOsn() {
		return godOsn;
	}

	public Sportista[] getSportista() {
		return sportista;
	}
}
