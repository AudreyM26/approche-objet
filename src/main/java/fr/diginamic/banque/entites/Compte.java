package fr.diginamic.banque.entites;

import java.util.Arrays;

public class Compte {

	//protected int numCompte =0;
	//protected double soldeCompte=0.0F;
	
	private int numCompte =0;
	private double soldeInitial=0.0;
	private Operation[] tabOpeCompte = new Operation[2];
	
	int nbreOpe =0;

	public Compte(int pNumCompte, double pSoldeCompte) {
		this.numCompte = pNumCompte;
		this.soldeInitial = pSoldeCompte;
	}
	
	//ajouter une operation a un compte
	public void ajouterOperation(Operation ope){
	
		if(nbreOpe < tabOpeCompte.length){
			tabOpeCompte[nbreOpe] = ope;
			nbreOpe += 1;
			
		}else{
			
			nbreOpe += 1;
			Operation[] tabOpeCopie = new Operation[nbreOpe];
	
			for (int i=0;i<tabOpeCompte.length;i++){
				tabOpeCopie[i] = tabOpeCompte[i];
			}
			
			//ajouter l operation dans le tableau copie tabOpeCopie
			tabOpeCopie[tabOpeCopie.length-1] = ope;
			//mettre a jour le tableau tabOpe a partir de la copie
			tabOpeCompte = Arrays.copyOf(tabOpeCopie, nbreOpe);
		}

	}
	
	//retourne le solde final : solde initial + operation
	public double getSolde(){
		
		double totalSolde = getSoldeInitial();
		Operation[] tabOp = getTabOpe();
		
		for(int i=0;i<nbreOpe;i++){
			if (nbreOpe > 0){
				if(tabOp[i].getType().equals("Credit")){
					totalSolde = totalSolde+tabOp[i].getMontant();
				}else{
					totalSolde = totalSolde-tabOp[i].getMontant();
				}
			}
		}
		
		totalSolde = Math.round(totalSolde*100.00)/100.00;
	
		return totalSolde;
	}
	
	//retourne solde selon type d operations credit ou debit
	public double getSolde(String type){
		
		double soldeType = 0;
		Operation[] tabOp = getTabOpe();
		
		for(int i=0;i<nbreOpe;i++){
			if(tabOp[i].getType().equals(type)){
				soldeType = soldeType+tabOp[i].getMontant();
			}
			
		}
		
		soldeType = Math.round(soldeType*100.00)/100.00;
		
		return soldeType;
	}
	
	//afficher les elements du compte : numero, solde initial, solde, nbre ope, montant selon type d operations
	public String toString(){
		String texte = "Numero de compte : "+getNumCompte()+"\nSolde initial : "+getSoldeInitial()+" €\nSolde de compte : "+getSolde()+" €\nOperations : "+nbreOpe+"\n";
		
		if(nbreOpe > 0){
			if(getSolde("Credit") > 0){
				texte = texte+"Total crédit : "+getSolde("Credit")+" €\n";
			}
		
			if(getSolde("Debit") > 0){
				texte = texte+"Total débit : "+getSolde("Debit")+"€\n";
			}
		}
		return 	texte;
	}
	
	
	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}


	public double getSoldeInitial() {
		return soldeInitial;
	}

	public void setSoldeInitial(double soldeInitial) {
		this.soldeInitial = soldeInitial;
	}

	public Operation[] getTabOpe() {
		return tabOpeCompte;
	}

	public void setTabOpe(Operation[] tabOpe) {
		this.tabOpeCompte = tabOpe;
	}

}
