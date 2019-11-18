package listes;

import java.util.*;

/***
 * Dans cette classe, on a constitué 2 listes différentes, nommées liste1 et liste2
 * Ces listes contiennent des couleurs
 * Créer en utilisant des boucles une liste appelée liste3 et qui contient 
 * l’ensemble des données des 2 listes précédentes.
 * @author audrey
 *
 */
public class FusionListe {

	public static void main(String args[]) {
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		
		List<String> liste3 = new ArrayList<String>();
		
		liste3.addAll(liste1);
		liste3.addAll(liste2);
		
		for (String color3: liste3) {
			
			System.out.println(color3);
			
		}
		
	}

}
