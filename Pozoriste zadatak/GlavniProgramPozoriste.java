package pozoriste;

public class GlavniProgramPozoriste {

	public static void main(String[] args) {

		Pozoriste zvezdara = new Pozoriste("Zvezdara Teatar");

		Glumac g1 = new Glumac("Dragan Jovanovic", zvezdara, "Lokalni solista");
		Glumac g2 = new Glumac("Bogdan Diklic", zvezdara, "Bubnjolog");
		Reditelj r1 = new Reditelj("Nikola Pejakovic", zvezdara, "Kolja");

		Predstava pr1 = new Predstava("Smesna Strana Muzike", zvezdara);

		pr1.dodajZaposlenog(g1);
		pr1.dodajZaposlenog(g2);
		pr1.dodajZaposlenog(r1);

		System.out.println("Pozoriste: " + zvezdara);
		System.out.println("Glumac: " + g1);
		System.out.println("Glumac: " + g2);
		System.out.println("Reditelj: " + r1);
		System.out.println("Broj Zaposlenih na predstavi je: " + pr1.brZaposlenih());
		pr1.izbaciZaposlenog(g2);
		System.out.println(pr1);
	}

}
