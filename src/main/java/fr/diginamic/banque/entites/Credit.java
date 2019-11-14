package fr.diginamic.banque.entites;

public class Credit extends Operation {

	
	public Credit (String dateOpe, double montant) {
		super(dateOpe,montant);
	}

	@Override
	public String AfficherType() {
		//System.out.println("Credit");
		
		return "Credit";
	}
	
}
