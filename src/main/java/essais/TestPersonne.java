package essais;

import entites.*;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne p1 = new Personne();
		p1.nom = "Lopez";
		p1.prenom = "Elodie";
		p1.adresse = new AdressePostale();
		p1.adresse.numeroRue = 5;
		p1.adresse.libelleVoie = "des Maréchaux";
		p1.adresse.codePostal = 44100;
		p1.adresse.ville = "Nantes";


		Personne p2 = new Personne();
		p2.nom = "Martinez";
		p2.prenom = "Julien";
		p2.adresse = new AdressePostale();
		p2.adresse.numeroRue = 85;
		p2.adresse.libelleVoie = "d'Antrain";
		p2.adresse.codePostal = 35700;
		p2.adresse.ville = "Rennes";
		
	}

}
