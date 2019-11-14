package fr.diginamic.banque.entites;

public class Debit extends Operation {

	
	public Debit (String dateOpe, double montant) {
		super(dateOpe,montant);
	}
	
	//afficher le type Debit
	public void AfficherType() {
		System.out.println("Debit");
	}
	
	//recuperer le type : Debit
	public String getType() {
		// TODO Auto-generated method stub
		return "Debit";
	}
}
