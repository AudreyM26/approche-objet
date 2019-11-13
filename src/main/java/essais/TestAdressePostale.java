package essais;

import entites.*;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale a = new AdressePostale();
		a.numeroRue = 5;
		a.libelleVoie = "des Maréchaux";
		a.codePostal = 44100;
		a.ville = "Nantes";


		AdressePostale b = new AdressePostale();
		b.numeroRue = 85;
		b.libelleVoie = "d'Antrain";
		b.codePostal = 35700;
		b.ville = "Rennes";
		
	}

}
