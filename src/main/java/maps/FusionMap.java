package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/***
 * Soit la classe exécutable suivante : 
 * 	Dans cette classe, on a constitué 2 maps différentes, nommées map1 et map2 
 * 	Ces maps contiennent des couleurs stockées en fonction d'un index
 * 	Créer une map appelée map3 et qui contient l'ensemble des données des 2 maps précédentes avec les mêmes clés et les mêmes valeurs
 * @author audrey
 *
 */

public class FusionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		//map3 contient les 2 maps
		map3.putAll(map1);
		map3.putAll(map2);
		
		//affichage des clés et valeurs de map 3
		Set<Integer> keySet = map3.keySet();
		
		for(Integer key : keySet){
			System.out.println("Key : "+key+"  Value : "+map3.get(key));
		}
		
	}

}
