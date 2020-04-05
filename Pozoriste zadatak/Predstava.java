package pozoriste;

import java.util.ArrayList;

/*
 * Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene 
 * koji ucestvuju u realizaciji predstave. 
 * Zaposleni za realizaciju predstave mogu da se dodaju i izbace. 
 * Moze da se dohvati broj zaposlenih na predstavi.
Sastavlja se tekstualni opis predstave navodeci naziv predstave 
i naziv pozorista u kojem se predstava odrzava razdvojene zarezom,
 a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).


 */
public class Predstava {

	protected String naziv;
	protected Pozoriste pozoristePredstave;
	protected ArrayList<Zaposleni> listaZaposlenih = new ArrayList<Zaposleni>();

	public void dodajZaposlenog(Zaposleni zaposleni) {
		listaZaposlenih.add(zaposleni);
	}

	public void izbaciZaposlenog(Zaposleni zaposleni) {
		listaZaposlenih.remove(zaposleni);
	}

	public int brZaposlenih() {
		return listaZaposlenih.size();
	}

	public Predstava(String naziv, Pozoriste pozoristePredstave) {
		this.naziv = naziv;
		this.pozoristePredstave = pozoristePredstave;
	}

	@Override
	public String toString() {

		String zaIspis = naziv + ", " + pozoristePredstave.getNaziv() + ", Zaposleni";
		String zaIspis2 = "";
		for (int i = 0; i < listaZaposlenih.size(); i++) {
			zaIspis2 = zaIspis2 + listaZaposlenih.get(i).getImePrezime() + "\n";
		}
		return zaIspis + " " + zaIspis2;
	}
}
