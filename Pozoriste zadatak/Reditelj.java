package pozoriste;

public class Reditelj extends Zaposleni {
//Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. 
//Tekstualni oblik je nadimak_ime[naziv_pozorista].

	public Reditelj(String imePrezime, Pozoriste pozoristeZaposlenog, String nadimak) {
		super(imePrezime, pozoristeZaposlenog);
		this.nadimak = nadimak;
	}

	private String nadimak;

	@Override
	public String toString() {

		return nadimak + " " + getPozoristeZaposlenog().getNaziv();

	}
}
