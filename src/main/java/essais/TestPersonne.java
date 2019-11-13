package essais;

import entites.*;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale a = new AdressePostale(5,"des Maréchaux",44100,"Nantes");
		Personne p1 = new Personne("Lopez","Elodie",a);

		AdressePostale b = new AdressePostale(85,"d'Antrain",35700,"Rennes");
		Personne p2 = new Personne("Martinez","Julien",b);

		/*System.out.println(p1.nom+" "+p1.prenom);
		System.out.println(p1.adresse.numeroRue+" "+p1.adresse.libelleVoie);
		System.out.println(p1.adresse.codePostal+" "+p1.adresse.ville);		
		*/
		System.out.println(p1.nom+" "+p1.prenom);
		System.out.println(p2.nom+" "+p2.prenom);
		
		p1.ModifNom("Lustucru");
		p1.ModifPrenom("Chloe");
		
		p1.AfficheNomPrenom();
		
		
		p2.ModifNom("Javasun");
		p2.ModifPrenom("Laurent");
		AdressePostale b2 = new AdressePostale(41,"rue des étoiles",34500,"Béziers");
		p2.ModifAdresse(b2);
		
		System.out.println(p2.adresse.numeroRue+" "+p2.adresse.libelleVoie);
		System.out.println(p2.adresse.codePostal+" "+p2.adresse.ville);	
		
		
		p2.AfficheNomPrenom();
		
		//String nom1 = p1.getNom("uuuu");
		//System.out.println(nom1);
		
	}

}
