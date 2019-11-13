package essais;

import entites.*;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale a = new AdressePostale(5,"des Maréchaux",44100,"Nantes");
	
		AdressePostale b = new AdressePostale(85,"d'Antrain",35700,"Rennes");
		
		a.nbDepartement =102;
		
		//System.out.println(a.nbDepartement);
		System.out.println(AdressePostale.nbDepartement);
	}

}
