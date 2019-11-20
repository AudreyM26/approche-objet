package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Compte c1 = new Compte(14785212,1500.23);
		c1.setSoldeInitial(1625.23);
		
		//System.out.println("Numero de compte : "+c1.getNumCompte());
		//System.out.println("Solde de compte : "+c1.getSoldeCompte());
		//System.out.println(c1);
		
		CompteTaux f1 = new CompteTaux(4874552,1410.23,1.20);
		f1.setSoldeInitial(520.36);
		//System.out.println(f1);
		
		//ajouter des operations au compte f1
		f1.ajouterOperation(new Credit("01/02/2019",120));
		f1.ajouterOperation(new Debit("15/03/2019",25.33));
		f1.ajouterOperation(new Debit("28/08/2019",56.90));
		
		
		//afficher les comptes
		Compte[] tabComptes = new Compte [2];
		
		tabComptes[0] = c1;
		tabComptes[1] = f1;
		
		double soldeGlobal=0;
		
		for(int i=0;i<tabComptes.length;i++){
			System.out.println(tabComptes[i]);
	
			//calcul solde global
			soldeGlobal = soldeGlobal+tabComptes[i].getSolde();
		}
		
		//arrondir et afficher solde global
		soldeGlobal = Math.round(soldeGlobal*100.00)/100.00;
		System.out.println("\nSolde global : "+soldeGlobal);
		
		
		Compte compte1 = new Compte(14587,1500.23);
		Compte compte2 = new Compte(14587,1500.23);
		
		System.out.println("compare compte1 et compte2 "+compte1.equals(compte2));
	
		Compte compte3 = compte2;
		
		System.out.println("compare compte2 et compte3 "+compte3.equals(compte2));
		
		System.out.println("\nPS:compare compte1 et compte2 retour false car pointe vers 2 zones mémoires différentes si equals non redéfinie dans Compte");
		System.out.println("PS:compare compte2 et compte3 retour true car pointe vers la meme zone memoire si equals non redéfinie dans Compte");
		
	}
}