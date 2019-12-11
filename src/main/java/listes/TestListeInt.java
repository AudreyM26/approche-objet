package listes;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/***
 * Créer un nouveau package listes. Dans le package listes, créez une classe
 * TestListeInt exécutable. Dans cette classe instanciez une ArrayList d'entiers
 * et placez y les éléments suivants : -1, 5, 7, 3, -2, 4, 8, 5 
 * Affichez tous les éléments de la liste 
 * Affichez la taille de la liste 
 * Recherchez et affichez le plus grand élément de la liste 
 * Supprimez le plus petit élément de la liste et affichez le résultat 
 * Recherchez tous les éléments négatifs et modifiez les de manière à ce qu'ils deviennent positifs. 
 * Affichez enfin la liste résultante
 * 
 * @author audrey
 *
 */

public class TestListeInt {

	public static void main(String[] args) {

		//creation de la liste d entiers
		List<Integer> liste = new ArrayList<Integer>();
	
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		
		//afficher les elements de la liste
		for (Integer entier: liste) {
			System.out.println(entier);
		}

		System.out.println("Taille de la liste : "+liste.size());
		
		// Retourner la plus grande valeur
		Object valMax = Collections.max(liste);
		System.out.println("Valeur max de la liste : "+valMax);
	 
	    //Retourne la plus petite valeur
	    Object valMin = Collections.min(liste);
	    System.out.println("Valeur min de la liste : "+valMin);

	    //supprimer la plus petite valeur
	    liste.remove(valMin);
	    
	    //changer nombres negatifs en positifs
	    for (int i=0;i<liste.size();i++){
	    	if(liste.get(i) < 0){
	    		liste.set(i,Math.abs(liste.get(i)));
	    	}
		}
	   
	    System.out.println("Tableau modifié");
	    for (Integer entier: liste) {
			System.out.println(entier);
		}
	    
	    System.out.println("Taille de la liste : "+liste.size());
		
	}

}
