package listes;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/***
 * Créez une classe Ville possédant 2 attributs : nom, nb d'habitants.
 * Créez une ArrayList de villes contenant les villes suivantes :
	o Nice, 343 000 hab.
	o Carcassonne, 47 800 hab.
	o Narbonne, 53 400 hab.
	o Lyon, 484 000 hab.
	o Foix, 9 700 hab.
	o Pau, 77 200 hab.
	o Marseille, 850 700 hab.
	o Tarbes, 40 600 hab.
 * Recherchez et affichez la ville la plus peuplée
 * Supprimez la ville la moins peuplée
 * Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
 * Affichez enfin la liste résultante
 * @author audrey
 *
 */

public class TestVille {

	public static void main(String[] args) {
		
		//instancier la liste avec classe ville(nom,nbre hab)
		List<Ville> list = new ArrayList<>();
		List<String> listVille = Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau","Marseille", "Tarbes");
		List<String> listHabitants = Arrays.asList("343 000 hab", "47 800 hab", "53 400 hab", "484 000 hab", "9 700 hab", "77 200 hab","850 700 hab", "40 600 hab");

		
		for (int i=0;i<listVille.size();i++){
			list.add(new Ville(listVille.get(i),listHabitants.get(i)));
			
		}
		
		//parcourir la liste pour recuperer ville plus peuplée, mettre en majuscule les villes hab > 100 0000 et recupere ville moins peuplée
		int maxHab = 0;
		int minHab = 0;
		int indexVillePeuplee = 0;
		int indexVilleMoinsPeuplee=0;
		
		for (int i=0;i<list.size();i++){
					
			String nb = list.get(i).getNbHab().replace("hab", "");
			nb = nb.replaceAll(" ","");
			int convertNb = Integer.parseInt(nb);
			
			//recuperer index ville la plus peuplée
			if(convertNb > maxHab){
				maxHab = convertNb;
				indexVillePeuplee = i;
			}
			
			//mettre en majuscule ville avec hab > 100 000
			if(convertNb > 100000){
				list.get(i).setNom(list.get(i).getNom().toUpperCase());
			}
			
			//recuperer index ville la moins peuplée pour la supprimer
			if(i==0 || convertNb < minHab){
				minHab = convertNb;
				indexVilleMoinsPeuplee = i;
			}
			
		}
		
		//affichage de la ville la plus peuplée
		System.out.println("La ville la plus peuplée : "+list.get(indexVillePeuplee));
		
		//supprimer la ville la moins peuplée
		//ps : attention mettre la suppression apres l affichage de la ville peuplee car sinon index n affiche pas la bonne ville
		
		//affichage de la ville supprimée de la liste (moins peuplée)
		System.out.println("La ville la moins peuplée : "+list.get(indexVilleMoinsPeuplee)+"\n");
		list.remove(indexVilleMoinsPeuplee);
				
		//affichage la liste des villes et habitants
		for (Ville ville : list) {
			System.out.println(ville);
		}
	}

}
