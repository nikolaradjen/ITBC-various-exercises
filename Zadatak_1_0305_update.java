package mart2;

import java.util.Scanner;

public class Zadatak_1_0305_update {

	// Domaci zadatak od utorka “da li je niz celih brojeva
	// palindrom ili nije” uradi koristeci metode.

	public static int[] upisiNiz(int brojElem) {
		Scanner sc = new Scanner(System.in);
		int[] niz = new int[brojElem];
		for (int i = 0; i < brojElem; i++) {
			niz[i] = sc.nextInt();
		}

		return niz;
	}


	public static boolean proveraPalindrom(int[] niz) {
	
		boolean palindrom;

		for (int i = 0; i < niz.length / 2; i++) {

			if (niz[i] != niz[niz.length - 1 - i]) {
				return palindrom = false;
				}

		}

		return palindrom = true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Koliko zelite da niz ima elemenata:");
		int brojElem = sc.nextInt();
			if (brojElem<0) {
				System.out.println("Pogresan unos, broj elemenata mora da bude pozitivan!");
				return;
			}
		System.out.println("Unesite elemente niza");
		int[] niz = upisiNiz(brojElem);

		if (proveraPalindrom(niz) == false) {
			System.out.println("Niz nije Palindrom");
		}
		else 
			System.out.println("Niz je palindrom");



	}

}
