package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique[] objet = new ObjetGeometrique[2];
		
		objet[0] = new Cercle(5.0);
		objet[1] = new Rectangle(8,4);
		
		for (int i=0;i<objet.length;i++){
			
			System.out.println(objet[i]);
			
		}
	}
}
