package domaci;

import java.util.Scanner;

public class Zadatak_2_0228 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		 * redosledom. Primer niza: 32 54 123 18 Ispis: 18 123 54 32
		 * 
		 */
		
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Koliko zelite da niz ima elemenata");
		int n = sc.nextInt();
		
		int niz [] = new int [n];
		
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite elemente niza");
			int elemNiza = sc.nextInt();
			niz[i] = elemNiza;
		}
		System.out.print("Inverzni redosled niza je: ");
		for (int i = n-1; i >= 0; i--) {
			
			System.out.print(niz [i]+ " ");
		}
		
		
	}

}
