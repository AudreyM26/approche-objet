package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;
import java.text.DecimalFormat;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte c1 = new Compte(14785212,1500.23F);
		c1.setSoldeCompte(1625.23F);
		
		//System.out.println("Numero de compte : "+c1.getNumCompte());
		//System.out.println("Solde de compte : "+c1.getSoldeCompte());
		//System.out.println(c1);
		
		CompteTaux f1 = new CompteTaux(4874552,1410.23F,1.20);
		f1.setSoldeCompte(520.36f);
		//System.out.println(f1);
				
		Compte[] tabComptes = new Compte [2];
		
		tabComptes[0] = c1;
		tabComptes[1] = f1;
		
		float soldeGlobal=0f;
		
		for(int i=0;i<tabComptes.length;i++){
			System.out.println("Compte "+(i+1)+"\n"+tabComptes[i]);
			soldeGlobal = soldeGlobal+tabComptes[i].getSoldeCompte();
		}
		
		DecimalFormat df = new DecimalFormat("0000.00");
		
		System.out.println("\nSolde global : "+df.format(soldeGlobal));
		
	}
}