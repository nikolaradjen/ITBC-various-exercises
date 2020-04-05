package domaci;

import java.util.Scanner;

public class Zadatak_1_0221 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		 * potrosace sadrzi sledece opcije:
		 * 
		 * 0 - Izlaz iz programa 1 - dodavanje cene proizvoda na racun (ubacivanje u
		 * potrosacku korpu) 2 - naplata racuna
		 * 
		 * Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese
		 * opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje
		 * na racun u prodavnici. Ukoliko korisnik unese opciju 2 program pita korisnika
		 * da unese kolicinu novca za naplatu racuna. Ukoliko korisnik unese vrednost
		 * manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja
		 * racuna i da se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili
		 * jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu.
		 * Zatim se ponovo ispisuje meni.
		 */

		Scanner sc = new Scanner(System.in);

		int n;
		int suma = 0;
		int cenaProizvoda;
		int uplacenNovac;
		int kusur = 0;
		do {
			System.out.println("Unesite opciju:");
			System.out.println("1) Dodaj Cenu Proizvoda;");
			System.out.println("2) Naplati;");
			System.out.println("0) Zavrsi kupovinu;");
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("Unesite Cenu");
				cenaProizvoda = sc.nextInt();
				suma = suma + cenaProizvoda;
				break;
			case 2:
				System.out.println("Unesite sumu kojom planirate da platite ");
				uplacenNovac = sc.nextInt();
				if (uplacenNovac >= suma) {
					kusur = uplacenNovac - suma;
					System.out.println("Placeno. Vas kusur iznosi " + kusur);
				} else {
					System.out.println("Greska! Vas racun je veci od sume planirane za placanje. ");
				}
				break;
			default:
				System.out.println("Nepostojeca opcija, izaberite jednu od opcija ponudjenih u meniju");
			}

		} while (n != 0);
		System.out.println("Hvala sto ste kupovali kod nas");

	}

}
