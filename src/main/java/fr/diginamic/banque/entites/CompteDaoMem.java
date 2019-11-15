package fr.diginamic.banque.entites;

import java.util.Arrays;

public class CompteDaoMem implements CompteDao {

	private Compte[] comptes = new Compte[0];
	
	//lister les comptes
	public Compte[] lister() {
	
		return comptes;
	}

	/**
	 * Constructeur	
	 */
	public CompteDaoMem() {
		
	}
	
	
	//sauvegarder nouveau compte
	public void sauvegarder(Compte nvCompte) {
	
		Compte[] copieComptes = new Compte[comptes.length+1];

		for (int i=0;i<comptes.length;i++){
			copieComptes[i] = comptes[i];
		}

		//ajouter l operation dans le tableau copie copieCompte
		copieComptes[copieComptes.length-1] = nvCompte;
		//mettre a jour le tableau comptes a partir de la copie
		comptes = Arrays.copyOf(copieComptes, copieComptes.length);
		
		
	}

	//supprimer un compte
	public boolean supprimer(int numero) {
		
		boolean supp=false;
		
		if(existe(numero)){
			
			int indexSupp=-1;
			for (int i=0;i<comptes.length;i++){
				if(comptes[i].getNumCompte() == numero){
					indexSupp = i;
				}
			}
			
			if(indexSupp != -1){
				Compte[] copieComptes = new Compte[comptes.length-1];
				for (int i=0; i<indexSupp; i++){
					copieComptes[i]=comptes[i];
				}
				
				for (int i=indexSupp+1; i<comptes.length; i++){
					copieComptes[i-1]=comptes[i];
				}
				//mettre a jour le tableau comptes a partir de la copie
				comptes = Arrays.copyOf(copieComptes, copieComptes.length);
				supp=true;
			}
		}
		return supp;
	}

	//verifier si le compte existe
	public boolean existe(int numero) {
		// TODO Auto-generated method stub
		boolean exist = false;
		
		for (int i=0;i<comptes.length;i++){
			if(comptes[i].getNumCompte() == numero){
				exist = true;
			}
		}
		
		return exist;
	}

	//afficher un compte selon le numero
	public Compte getCompte(int numero) {
		
		Compte compteNum = null;
		
		if(existe(numero)){
			
			for (int i=0;i<comptes.length;i++){
				if(comptes[i].getNumCompte() == numero){
					compteNum = comptes[i];
				}
			}
			
		}
		return compteNum;
	}

}
