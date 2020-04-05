package mart2;

import java.util.Scanner;

public class Zadatak_2_0305 {

	public static void main(String[] args) {

		/*
		 * Na tabli stoje beli pion i crni skakac. Beli pion pocinje sa dna table a crni
		 * skakac sa vrha. Korisnik prvo unosi poziciju piona kao dva cela broja, a
		 * zatim poziciju skakaca, gde prvi broj predstavlja red, a drugi kolonu.
		 * Program treba da ispise da li se figure nalaze u poziciji da je skakac
		 * napadnut. Primeri: 6 4 7 4 ---> skakac nije napadnut 6 4 5 5 ---> skakac
		 * jeste napadnut 2 2 1 1 ---> skakac jeste napadnut 9 1 6 8 ---> greska u unosu
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite poziciju piona, tako sto cete prvo uneti red, a potom kolonu, gde se on nalazi:");
		int redPion = sc.nextInt();
		int kolonaPion = sc.nextInt();

		System.out.println("Unesite poziciju skakaca, tako sto cete prvo uneti red, a potom kolonu, gde se on nalazi:");
		int redSkakac = sc.nextInt();
		int kolonaSkakac = sc.nextInt();

		if (redPion > 8 || kolonaPion > 8 || redSkakac > 8 || kolonaSkakac > 8 || redPion < 1 || kolonaPion < 1
				|| redSkakac < 1 || kolonaSkakac < 1) {
			System.out.println("Nazalost, vas unos nije ispravan.");
			return;
		}

		if (redPion == 1) {
			System.out.println("Skakac nije napadnut.");
			return;
		}
		if (kolonaPion == 1) {
			if (redSkakac == redPion - 1 && kolonaSkakac == kolonaPion + 1) {
				System.out.println("Skakac je napadnut.");
				return;
			} else
				System.out.println("Skakac nije napadnut.");
			return;
		}
		if (kolonaPion == 8) {
			if (redSkakac == redPion - 1 && kolonaSkakac == kolonaPion - 1) {
				System.out.println("Skakac je napadnut.");
				return;
			} else
				System.out.println("Skakac nije napadnut");
			return;
		}
		if (redSkakac == redPion - 1 && (kolonaSkakac == kolonaPion + 1 || kolonaSkakac == kolonaPion - 1)) {
			System.out.println("Skakac je napadnut.");
			return;
		} else
			System.out.println("Skakac nije napadnut.");
		return;

	}

}
