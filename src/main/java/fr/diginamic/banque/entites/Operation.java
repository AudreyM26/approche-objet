package fr.diginamic.banque.entites;

public abstract class Operation {

	
	private String dateOpe = "";
	private double montant=0;
	
	//afficher le type credit ou debit : a definir dans les classes debit et credit
	public abstract void AfficherType();
	
	//recuperer le type credit ou debit : a definir dans les classes debit et credit
	public abstract String getType();
	
	public Operation(String dateOpe, double montant) {
		super();
		this.dateOpe = dateOpe;
		this.montant = montant;
	}

	public String getDateOpe() {
		return dateOpe;
	}

	public String toString(){
		return getType()+" : "+getDateOpe()+" "+getMontant()+"€";
		
	}
	
	
	public void setDateOpe(String dateOpe) {
		this.dateOpe = dateOpe;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
	
}
