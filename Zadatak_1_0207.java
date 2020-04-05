package cetvrto;

import java.util.Scanner;

public class Zadatak_1_0207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * U zgradi se nalazi lift nosivosti 680kg. Napisati program koji proverava da
		 * li ce lift bezbedno krenuti u zavisnostii od tezine koju treba da ponese.
		 * Podrazumevane 3 opcije: Lift je preopterecen; Na granici je; Lift je
		 * pokrenut.
		 */

		Scanner s = new Scanner(System.in);

		int suma = 0;
		System.out.println("Unesite tezinu osobe ili tereta koje planirate da "
				+ "prevezete liftom i kada ne zelite vise da dodajete, pritisnite 0");
		int kilaza = s.nextInt();

		while (kilaza > 0) {
			suma = suma + kilaza;
			System.out.println("Unesite tezinu sledece osobe ili tereta ");
			kilaza = s.nextInt();
		}

		if (suma > 680)
			System.out.println("U liftu je trenutno " + suma + " kg i lift je preopterecen");
		else if (suma == 680) {
			System.out.println("U liftu je trenutno " + suma + " kg i njegova opterecenost je na granici");
		} else {
			System.out.println("U lift je je trenutno " + suma + " kg i lift moze biti pokrenut");
		}
	}

}
