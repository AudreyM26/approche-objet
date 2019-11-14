package fr.diginamic.banque;


import java.text.DecimalFormat;

import fr.diginamic.banque.entites.*;
import java.text.DecimalFormat;


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
			
			typeOpe = tabOpe[i].AfficherType();
			
			System.out.println(typeOpe+"\ndate d opération : "+tabOpe[i].getDateOpe()+" montant : "+tabOpe[i].getMontant()+"\n");
			
			if(typeOpe == "Credit"){
				montantGlobal = montantGlobal+tabOpe[i].getMontant();
			}else{
				montantGlobal = montantGlobal-tabOpe[i].getMontant();
			}
			
		}
		
		DecimalFormat df = new DecimalFormat("000.00");
		
		System.out.println("\nMontant global : "+df.format(montantGlobal)+"€");
		
		//System.out.println(montantGlobal);
		
	}
}
