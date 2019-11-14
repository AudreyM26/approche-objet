package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;



public class TestOperationBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operation[] tabOpe = new Operation[4];
		
		tabOpe[0] = new Credit("01/02/2019",120);
		tabOpe[1] = new Debit("03/02/2019",56.20);
		tabOpe[2] = new Credit("01/04/2019",652.23);
		tabOpe[3] = new Debit("03/05/2019",186.70);
		
		String typeOpe = "";
		double montantGlobal =0;
		
		for(int i=0;i<tabOpe.length;i++){
			
			typeOpe = tabOpe[i].getType();
			
			System.out.println(tabOpe[i]);
			//tabOpe[i].AfficherType();
			//System.out.println("date d opération : "+tabOpe[i].getDateOpe()+" montant : "+tabOpe[i].getMontant()+"\n");
			
			if(typeOpe.equals("Credit")){
				montantGlobal = montantGlobal+tabOpe[i].getMontant();
			}else{
				montantGlobal = montantGlobal-tabOpe[i].getMontant();
			}
			
		}
	
		//afficher montant global
		montantGlobal = Math.round(montantGlobal*100.00)/100.00;
		System.out.println("\nMontant global : "+montantGlobal+"€");
		
	}
}
