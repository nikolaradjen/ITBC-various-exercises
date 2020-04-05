package domaci;

import java.util.Scanner;

public class Zadatak_2_0220 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako korisnik
		 * unese 1 2 5 3 -1, program treba da ispise 11
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Unesite broj koji zelite da saberete i kada zelite da zavrsite unos, unesite negativan broj: ");
		int broj = sc.nextInt();
		int zbir = 0;

		while (broj > 0) {
			zbir = zbir + broj;
			broj = sc.nextInt();
		}
		if (broj < 0) {
			System.out.println("Zbir brojeva je " + zbir);
		}

	}

}
