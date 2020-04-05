package mart;

import java.util.Scanner;

public class Zadatak_1_0302 {

	public static void main(String[] args) {

		
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Koliko zelite da niz ima elemenata");

		int n = sc.nextInt();
		int[] niz = new int[n];
		int proizvod = 1;
		
		boolean palindrom = true;
		
		System.out.println("Unesite elemente niza: ");
		for (int i = 0; i < niz.length; i++) {
			
			niz[i] = sc.nextInt();
		}
		
		
		for (int i = 0; i < n/2; i++){
			if(niz[i] != niz[n - 1 - i]){
			palindrom = false;
				break;
			}
		}
 
		if(palindrom == true){
			System.out.println("Niz jeste palindrom");
		} else {
			System.out.println("Niz nije palindrom");
		}
		
		
	}

}