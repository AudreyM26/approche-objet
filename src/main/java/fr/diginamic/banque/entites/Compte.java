package fr.diginamic.banque.entites;

public class Compte {

	//protected int numCompte =0;
	//protected float soldeCompte=0.0F;
	
	private int numCompte =0;
	private float soldeCompte=0.0F;
	
	public Compte(int pNumCompte, float pSoldeCompte) {
		this.numCompte = pNumCompte;
		this.soldeCompte = pSoldeCompte;
	}
	
	public String toString(){
		return "Numero de compte "+getNumCompte()+"\nSolde de compte : "+getSoldeCompte()+"�\n";	
	}
	
	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}


	public float getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(float soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

}
