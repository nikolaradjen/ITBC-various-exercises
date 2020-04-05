package klikeri;

import java.util.ArrayList;
import java.util.List;

/*
 * Napraviti metodu koja ce ispisivati broj klikera i metodu koja ispisuje
 * prosecan broj decjih godina (ako imamo troje dece, broj prosecnih godina za
 * njih troje; ako imamo dvoje racunamo prosecne godine za to dvoje) .
 */
public class GlavniProgramDete {

	public static void main(String[] args) {

		Dete d1 = new Dete("Pera", "Peric", 10, 5);
		Dete d2 = new Dete("Miki", "Mikic", 11, 9);
		Dete d3 = new Dete("Ivan", "Ivanovic", 9, 15);

		List<Dete> listaDece = new ArrayList<Dete>();
		listaDece.add(d1);
		listaDece.add(d2);
		listaDece.add(d3);

		double rezultat = prosekGodina(listaDece);
		System.out.println(rezultat);
	}

	
	public static double prosekGodina(List<Dete> listaDece) {
		int brDece = listaDece.size();
		int zbirGodina = 0;
		for (int i = 0; i < listaDece.size(); i++) {
			zbirGodina = zbirGodina + listaDece.get(i).getGodine();

		}
		return zbirGodina / brDece;
	}
}