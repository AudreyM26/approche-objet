package fr.diginamic.banque;

import java.util.Scanner;

import fr.diginamic.banque.entites.*;
import java.util.InputMismatchException;

public class TestApplicationBancaire {

	public static Scanner saisieChoix = new Scanner(System.in);
	public static CompteDao daoCompte = new CompteDaoMem();
	
	public static void main(String[] args) {
		
		int choix = 0;	
		//Afficher le menu
		AfficheMenuChoix();
		boolean erreur;
		
		while(choix != 99){
			//Bloc d'essai pour s'assurer qu'on récupère bien un entier
			do {
				try {
					
	        		System.out.println("Veuillez saisir votre choix : ");
	        		choix = saisieChoix.nextInt();
	                erreur = false;
	                
	                //afficher choix utilisateur
	                AfficheChoixUtilisateur(choix);
	                //afficher le menu principal
	                if(choix !=99){
	                	 AfficheMenuChoix();
	                }
	               
	                
			} catch (InputMismatchException e) {
	            	System.out.println("\nCe n'est pas une valeur prise en charge, veuillez réessayer.");
	                erreur = true;
	                saisieChoix.next();
	            }
	        } while (erreur);
		}
		
		saisieChoix.close();
	}
	
	
	private static void AfficheChoixUtilisateur(int pChoix){

		switch(pChoix){
		
			case 1:
				System.out.println("Liste des comptes");
				
				//lister les comptes utilisation de toString Compte et CompteTaux
				Compte[] comptes = daoCompte.lister();
				
				for (int i=0; i<comptes.length; i++){
					System.out.println(comptes[i]+"\n");
				}
				
				break;
				
			case 2:
				System.out.println("Ajout d’un nouveau compte\n");
				saisieNouveauCompte();
				break;
				
			case 3:
				System.out.println("Ajout d’une opération à un compte\n");
				saisieOperationCompte();
				break;
				
			case 4:
				System.out.println("Suppression d’un compte\n");
				suppOperationCompte();
				break;
			
			case 99 :
				System.out.println("Au revoir\n");
				break;
				
			default:
				System.out.println("La demande n'est pas conforme\n");
				break;
		}
	}

	//affiche le menu principal
	public static void AfficheMenuChoix(){
		
		System.out.println("***** Administration des comptes *****");	
		System.out.println("1. Lister les comptes");	
		System.out.println("2. Ajouter un nouveau compte");	
		System.out.println("3. Ajouter une opération à un compte");	
		System.out.println("4. Supprimer un compte");
		System.out.println("99. Sortir\n");
	}

	//ajouter un nouveau compte
	public static void saisieNouveauCompte(){
		
		System.out.println("Veuillez saisir le numéro : ");
		int numero = saisieChoix.nextInt();
		
		System.out.println("Veuillez saisir le solde initial : ");	
		double soldeInit = saisieChoix.nextDouble();
		
		System.out.println("Veuillez saisir le type de compte (1:NORMAL, 2:REMUNERE)");
		int typeChoix = saisieChoix.nextInt();
		Compte newCompte=null;
		
		switch(typeChoix){
		
			case 1:
				newCompte = new Compte(numero,soldeInit);
				daoCompte.sauvegarder(newCompte);
				break;
				
			case 2:
				
				System.out.println("Veuillez saisir le taux : ");
				double tauxCompte = saisieChoix.nextDouble();
				
				newCompte = new CompteTaux(numero,soldeInit,tauxCompte);
				daoCompte.sauvegarder(newCompte);
				break;
		
			default:
				System.out.println("Veuillez saisir le type de compte (1:NORMAL, 2:REMUNERE)");
				typeChoix = saisieChoix.nextInt();
				break;
		}
	
	}
	
	//ajouter une opération a un compte
	public static void saisieOperationCompte(){
		
		//pour tester directement la fonction ajouter un compte dans le tableau
		//daoCompte.sauvegarder(new CompteTaux(1,1522.23,1.25));
		
		System.out.println("Veuillez saisir le numéro : ");
		int numeroOpe = saisieChoix.nextInt();
		
		if(daoCompte.existe(numeroOpe)){
			
			System.out.println("Veuillez saisir le type d’opération (1 : CREDIT, 2 : DEBIT) :");
			int typeOpe = saisieChoix.nextInt();
			
			System.out.println("Veuillez saisir la date :");
			String dateOpe = saisieChoix.next();

			System.out.println("Veuillez saisir le montant :");
			double montant = saisieChoix.nextDouble();
			
			Operation ajoutOpe = null;
			
			if(typeOpe == 1){
				ajoutOpe = new Credit(dateOpe,montant);
			}else{
				ajoutOpe = new Debit(dateOpe,montant);
			}
			
			daoCompte.getCompte(numeroOpe).ajouterOperation(ajoutOpe);
			
		}

	}
	
	//supprimer un compte
	public static void suppOperationCompte(){
		
		//pour tester directement la fonction ajouter deux comptes dans le tableau
		/*daoCompte.sauvegarder(new Compte(1,1522.23));
		daoCompte.sauvegarder( new CompteTaux(2,541.23,1.25));*/
				
		System.out.println("Veuillez saisir le numéro : ");
		int numeroOpe = saisieChoix.nextInt();
		boolean suppValid =false;
		
		if(daoCompte.existe(numeroOpe)){
			suppValid = daoCompte.supprimer(numeroOpe);
		}else{
			System.out.println("Le numéro de compte saisi n'existe pas\n");
		}
		
		if(suppValid){
			System.out.println("Le compte "+numeroOpe+" a été supprimé");
		}
	}
}
