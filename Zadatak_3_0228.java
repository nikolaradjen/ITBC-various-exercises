package domaci;

import java.util.Scanner;

public class Zadatak_3_0228 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		 * rastuci. Primer1 niza: 3 54 123 18 Ispis: Niz nije rastuci. Primer2 niza: 71
		 * 422 1001 5054 Ispis: Niz je rastuci.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Koliko zelite da niz ima elemenata");
		int n = sc.nextInt();
		boolean rastuci = true;
		int niz[] = new int[n];

		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite elemente niza");
			int elemNiza = sc.nextInt();
			niz[i] = elemNiza;
		}
		for (int i = 0; i < niz.length; i++) {
			if (i != 0 && niz[i] < niz[i - 1]) {
				rastuci = false;
				break;
			}
		}
		if (rastuci) {
			System.out.println("Niz je rastuci ");
		} else {
			System.out.println("Niz nije rastuci");
		}
	}

}
