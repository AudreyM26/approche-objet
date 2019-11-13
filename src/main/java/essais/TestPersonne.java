package essais;

import entites.*;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale a = new AdressePostale(5,"des Maréchaux",44100,"Nantes");
		Personne p1 = new Personne("Lopez","Elodie",a);

		AdressePostale b = new AdressePostale(85,"d'Antrain",35700,"Rennes");
		Personne p2 = new Personne("Martinez","Julien",b);

		System.out.println(p1.nom+" "+p1.prenom);
		System.out.println(p1.adresse.numeroRue+" "+p1.adresse.libelleVoie);
		System.out.println(p1.adresse.codePostal+" "+p1.adresse.ville);		
	}

}
