package ucionica;

import java.util.ArrayList;


//Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju prilikom kreiranja.
//Marka moze samo da se dohvati. 
//Lista polaznika koji koriste laptop moze da se prosiri i da se smanji. 
//Moze da se ispise u obliku (koristiti metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}

public class Laptop {

	private ArrayList<Polaznik> polaznici;
	private String marka;

	public String getMarka() {
		return marka;
	}

	public Laptop(String marka, ArrayList polaznici) {
		this.marka = marka;
		this.polaznici = polaznici;
	}

	public void dodajPolaznika(Polaznik p) {
		polaznici.add(p);
	}

	public void izbaciPolaznika(Polaznik p) {
		polaznici.remove(p);
	}
	
	
	public String toString () {
		String imena="";
		for (int i=0;i<polaznici.size(); i++) {
			imena +=polaznici.get(i).toString();
			if (i!=polaznici.size()-1) {
				imena += ", ";
			}
			
			
		}
		return marka.toUpperCase()+ "{" + imena + "}";
		
	}

}
