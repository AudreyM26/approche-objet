package listes;

import java.util.*;

public class CreationListe {

	public static void main(String[] args) {
		//creer une liste d entiers de 0 à 100

		
		List<Integer> liste = new ArrayList<Integer>();
		
		for (int i=0;i<100;i++){
			liste.add(i+1);
		}
		
		/*for (Integer entier: liste) {
			System.out.println(entier);
		}*/
		
		System.out.println("Taille de la liste : "+liste.size());
	}

}
