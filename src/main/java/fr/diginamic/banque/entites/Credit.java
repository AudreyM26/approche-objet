package fr.diginamic.banque.entites;

public class Credit extends Operation {

	
	public Credit (String dateOpe, double montant) {
		super(dateOpe,montant);
	}

	//afficher le type : Credit
	public void AfficherType() {
		System.out.println("Credit");
	}

	//recuperer le type : Credit
	public String getType() {
		// TODO Auto-generated method stub
		return "Credit";
	}
	
}
