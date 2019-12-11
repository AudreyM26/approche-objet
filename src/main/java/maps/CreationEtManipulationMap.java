package maps;

import java.util.HashMap;
import java.util.Iterator;

/***
 * Soit la classe exécutable suivante : 
 	o Dans cette classe, la map nommée mapVilles contient les noms des préféctures stockés par numéro de département. 
 * Taches  à  réaliser : 
 * Ajouter dans mapVilles les informations pour Lille,Lyon et Bordeaux
 * Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
 * Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
 * Afficher la taille de la map
 * 
 * @author audrey
 *
 */

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille"); 
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes"); 
		mapVilles.put(75, "Paris"); 
		mapVilles.put(31, "Toulouse"); 
		
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon"); 
		mapVilles.put(33, "Bordeaux");
		
		//afficher toutes les clés de la map
		System.out.println("Clés de la map :");
		Iterator<Integer> keyVille = mapVilles.keySet().iterator();
		while (keyVille.hasNext()){
			System.out.println(keyVille.next());
		}
		
		//afficher toutes les valeurs de la map
		System.out.println("\nValeurs de la map :");
		Iterator<String> valeurVille = mapVilles.values().iterator();
		while (valeurVille.hasNext()){
			System.out.println(valeurVille.next());
		}
		
		System.out.println("\nTaille de la map : "+mapVilles.size());

	}

}
