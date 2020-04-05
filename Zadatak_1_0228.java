package domaci;

import java.util.Scanner;

public class Zadatak_1_0228 {

	public static void main(String[] args) {
		/*
		 * Korisnik ucitava niz od n elemenata niza, kao i neki broj br. Program
		 * ispisuje elemente niza deljive brojem br.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Koliko zelite da niz ima elemenata");
		int n = sc.nextInt();
		System.out.println("Sa kojim brojem zelite da delite elemente niza");
		int broj = sc.nextInt();

		int niz[] = new int[n];

		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite elemente niza");
			int elemNiza = sc.nextInt();
			niz[i] = elemNiza;
		}
		System.out.print("Elementi niza deljivi sa " + broj + " su" + " ");
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % broj == 0) {
				System.out.print(niz[i]+ " ");
				

			}

			}
		}

	}

