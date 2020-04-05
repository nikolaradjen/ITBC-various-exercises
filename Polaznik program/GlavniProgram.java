package ucionica;

import java.util.ArrayList;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Polaznik p1 = new Polaznik("Nikola", "Radjen");
	Polaznik p2 = new Polaznik("Marko", "Markovic");
	Polaznik p3 = new Polaznik("Pera", "Petrovic");
	
	
	ArrayList<Polaznik> lista = new ArrayList<Polaznik>();
	
	lista.add(p1);
	lista.add(p2);
	lista.add(p3);
	
	Laptop dell = new Laptop ("Dell", lista);
	
	
	System.out.println(dell.toString());
	
	dell.izbaciPolaznika(p2);
		
	System.out.println(dell.toString());
	}

}
