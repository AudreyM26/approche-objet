package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;


public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte c1 = new Compte(14785212,1500.23F);
		c1.setSoldeCompte(1625.23F);
		
		System.out.println("Numero de compte : "+c1.getNumCompte());
		System.out.println("Solde de compte : "+c1.getSoldeCompte());
		
		System.out.println(c1);
	}

}