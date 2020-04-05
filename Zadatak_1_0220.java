package domaci;

import java.util.Scanner;

public class Zadatak_1_0220 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		 * od 0 do n - za resavanje ovog zadatka koristiti samo jednu petlju (ne jednu
		 * vrstu petlje, vec samo jednu petlju).
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj:");
		int broj = sc.nextInt();
		int suma = 0;
		int proizvod = 1;
// u slucaju da je broj negativan uvodimo ovaj ovaj if ispod
		if (broj < 0) {
			broj = broj * -1;
		}

		for (int i = 0; i <= broj; i++) {
			if (i % 2 == 0) {
				suma = suma + i;
			}

			else {
				proizvod = proizvod * i;
			}

		}

		System.out.println("Suma je " + suma + "," + " a proizvod je " + proizvod + ".");

	}

}
