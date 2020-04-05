package mart;

import java.util.Scanner;

public class Zadatak_2_0302 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata
		 * niza koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Koliko zelite da niz ima elemenata");

		int n = sc.nextInt();
		int[] niz = new int[n];
		int proizvod = 1;
		
		System.out.println("Unesite elemente niza: ");
		for (int i = 0; i < niz.length; i++) {
			
			niz[i] = sc.nextInt();
		
			if (niz[i]>i) {
				proizvod *=niz[i];
			}
		}
		
		System.out.println("Proizvod elemenata niza koji su veci od svog indeksa je:" + proizvod);
		
	}

}
