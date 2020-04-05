package pozoriste;

public class Glumac extends Zaposleni {
	
	//Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].


	
	public Glumac(String imePrezime, Pozoriste pozoristeZaposlenog, String nazivUloge) {
		super(imePrezime, pozoristeZaposlenog);
		this.nazivUloge=nazivUloge;
		
	}

	protected String nazivUloge;
	
	@Override
	public String toString() {
		return nazivUloge + "[" + pozoristeZaposlenog.getNaziv() + "]";
	}
	
}
