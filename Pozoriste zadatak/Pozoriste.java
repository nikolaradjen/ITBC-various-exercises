package pozoriste;

public class Pozoriste {

	private static int id = 0;
	private String naziv;

	public Pozoriste(String naziv) {
		this.naziv = naziv;
		id++;
	}

	public static int getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	@Override
	public String toString() {
		return naziv + " " + "[" + id + "]";
	}
}
