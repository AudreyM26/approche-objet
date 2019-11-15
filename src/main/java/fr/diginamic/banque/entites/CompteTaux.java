package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	private double tauxRemuneration = 0;
	
	public CompteTaux(int pNumCompte,double pSoldeCompte, double pTaux ){

		super(pNumCompte,pSoldeCompte);
		this.tauxRemuneration = pTaux;
	}
	
	
	public String toString(){
		String compte = super.toString();
		return compte+" - Taux : "+getTauxRemuneration()+"%";	
	}


	public double getTauxRemuneration() {
		return tauxRemuneration;
	}


	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
