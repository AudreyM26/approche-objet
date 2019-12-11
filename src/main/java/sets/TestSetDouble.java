package sets;

import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/***
 * Créer un nouveau package sets. Dans le package sets, créez une classe
 * TestSetDouble exécutable. Dans cette classe instanciez un HashSet de doubles et placez y les éléments suivants :
 *  o 1.5, 8.25, -7.32, 13.3, -12.45, 48.5,0.01 
 * Affichez tous les éléments de la collection 
 * Recherchez le plus grand élément de la collection 
 * Supprimez le plus petit élément de la collection
 * Affichez enfin le contenu de la collection ainsi modifiée
 * 
 * @author audrey
 *
 */

public class TestSetDouble {

	public static void main(String[] args) {

		// instancier le set
		Set<Double> set = new HashSet<Double>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);

		// afichage des elements de la collection
		Iterator<Double> iter = set.iterator();

		while (iter.hasNext()) {

			System.out.println(iter.next());
		}

		// Retourner la plus grande valeur
		Object valMax = Collections.max(set);
		System.out.println("Valeur max du set : " + valMax);

		// Retourne la plus petite valeur
		Object valMin = Collections.min(set);
		System.out.println("Valeur min du set : " + valMin);

		//supprimer valeur min
		set.remove(valMin);
		
		System.out.println("\nAffichage des éléments du set modifié : ");
		Iterator<Double> iter2 = set.iterator();
		while (iter2.hasNext()) {

			System.out.println(iter2.next());
		}
	}

}
