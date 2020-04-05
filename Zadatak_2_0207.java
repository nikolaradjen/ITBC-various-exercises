package cetvrto;

import java.util.Scanner;

public class Zadatak_2_0207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji na osnovu unetog naziva meseca ispisuje kolikoima
		 * meseci u godini koji pocinju na to slovo(na taj glas) - za resavanje ovog
		 * zadatka koristiti switch
		 */

		Scanner s = new Scanner(System.in);

		System.out.println("Unesi mesec");
		String mesec = s.next();

		switch (mesec) {

		case "januar":
		case "jul":
		case "jun":

			System.out.println("Broj meseci cije je pocetno slovo j je 3");
			break;

		case "februar":
			System.out.println("Broj meseci cije je pocetno slovo f je 1 ");
			break;
		case "mart":
		case "maj":
			System.out.println("Broj meseci cije je pocetno slovo m je 2");
			break;

		case "april":
		case "avgust":
			System.out.println("Broj meseci cije je pocetno slovo a je 2");
			break;
		case "septembar":
			System.out.println("Broj meseci cije je pocetno slovo s je 1");
			break;

		case "oktobar":
			System.out.println("Broj meseci cije je pocetno slovo o je 1");
			break;
		case "novembar":
			System.out.println("Broj meseci cije je pocetno slovo n je 1");
			break;
		case "decembar":
			System.out.println("Broj meseci cije je pocetno slovo d je 1");
		}

	}

}
