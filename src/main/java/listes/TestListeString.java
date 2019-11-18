package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/***
 * Dans le package listes, créez une classe TestListeString exécutable. Dans cette classe instanciez une ArrayList de String contenant les éléments suivants : 
 	o Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes
 * Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
 * Modifiez le contenu de la liste de manière à mettre tous les noms de villes en majuscules. 
 * Supprimez de la liste les villes dont le nom commence par la lettre N. 
 * Affichez la liste résultante
 * 
 * @author audrey
 *
 */

public class TestListeString {

	public static void main(String[] args) {

		// instancier une ArrayList avec les villes
		List<String> initialeVille = Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau","Marseille", "Tarbes");

		List<String> listVilles = new ArrayList<String>();
		listVilles.addAll(initialeVille);

		int wordMax = 0;

		// trouver le mot le plus long
		for (String ville : listVilles) {
			// System.out.println(ville);

			if (ville.length() > wordMax) {
				wordMax = ville.length();
			}
		}

		System.out.println("Mot le plus long : " + wordMax);

		//Mettre les villes en majuscule
		for (int i = 0; i < listVilles.size(); i++) {
			listVilles.set(i, listVilles.get(i).toUpperCase());
		}

		//Affichage de la liste
		System.out.println("\nListe des villes");
		for (String ville : listVilles) {
			System.out.println(ville);
		}

		//supprimer les villes commencant par N
		Iterator<String> iter = listVilles.iterator();

		while (iter.hasNext()) {
			String ville = iter.next();

			if(ville.substring(0,1).equals("N")){
				iter.remove();
			}
		}
		
		//Affichage de la liste des villes
		System.out.println("\nNouvelle liste des villes");
		for (String ville : listVilles) {
			System.out.println(ville);
		}
	}

}
