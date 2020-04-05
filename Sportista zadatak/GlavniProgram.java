package domaci3;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sportista s1 = new Sportista("Nikola", "Radjen", 1988);
		Sportista s2 = new Sportista("Marko", "Markovic", 1988);
		Sportista s3 = new Sportista("Pera", "Peric", 1988);
		
		Sportista[] niz = new Sportista[3];
		niz[0] = s1;
		niz[1] = s2;
		niz[2] = s3;
				
		Klub k1 = new Klub("Crvena Zvezda", "Beograd", 1945, niz );

		//System.out.println(s1);

		k1.setNaziv("KK Crvena Zvezda");
		System.out.println(k1);
	}

}
