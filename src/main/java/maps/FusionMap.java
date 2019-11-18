package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/***
 * Soit la classe ex�cutable suivante : 
 * 	Dans cette classe, on a constitu� 2 maps diff�rentes, nomm�es map1 et map2 
 * 	Ces maps contiennent des couleurs stock�es en fonction d�un index
 * 	Cr�er une map appel�e map3 et qui contient l�ensemble des donn�es des 2 maps pr�c�dentes avec les m�mes cl�s et les m�mes valeurs
 * @author audrey
 *
 */

public class FusionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cr�ation map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Cr�ation map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		//map3 contient les 2 maps
		map3.putAll(map1);
		map3.putAll(map2);
		
		//affichage des cl�s et valeurs de map 3
		Set<Integer> keySet = map3.keySet();
		
		for(Integer key : keySet){
			System.out.println("Key : "+key+"  Value : "+map3.get(key));
		}
		
	}

}
