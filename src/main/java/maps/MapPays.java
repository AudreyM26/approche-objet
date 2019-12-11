package maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import sets.Pays;

/***
 * Creez une classe exécutable MapPays
 * Dans ce TP nous allons retravailler avec la classe Pays et les informations des TPs précédent.
 * Dans cette classe, creez une map permettant de stocker les instances de pays (valeur) en fonction de leur nom (clé).
 * Recherchez et supprimez le pays qui a le moins d'habitants
 * Affichez l'ensemble des pays restants
 * @author audrey
 *
 */
public class MapPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instancier la map avec classe pays(nom,nbre hab,pib/ hab)
		List<String> listPays = Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon","Chine", "Russie","Inde");
		List<Integer> listHabitants = Arrays.asList(327000, 67000, 82720, 66440, 60480, 126800, 1386000000, 144500, 1339000000);
		List<Double> listPibParHabitants = Arrays.asList(59531.60,38476.66,44469.91, 39720.44, 31952.98, 38428.10, 8826.99, 10743.10, 1939.61);

		HashMap<String, Pays> mapPays = new HashMap<>();
		
		for (int i=0;i<listPays.size();i++){
			mapPays.put(listPays.get(i),new Pays(listPays.get(i),listHabitants.get(i),listPibParHabitants.get(i)));
		}
		
		int minNbrHab = 0;
		String paysMoinsHab ="";
		
		Set<String> keySet = mapPays.keySet();
		
		for(String key : keySet){
			//System.out.println("Key : "+key+"  Value : "+mapPays.get(key));
			
			//recuperer pays qui a le moins d habitants
			if(minNbrHab == 0 || mapPays.get(key).getNbreHab() < minNbrHab ){
				minNbrHab =  mapPays.get(key).getNbreHab();				
				paysMoinsHab = key;
			}
			
		}
		
		System.out.println("Pays qui a le moins d habitants : "+paysMoinsHab+"\n");
		mapPays.remove(paysMoinsHab);
		
		//affichage de la map apres suppression du pays avec le moins d habitants
		for(String key : keySet){
			System.out.println(mapPays.get(key));
			
			if(minNbrHab == 0 || mapPays.get(key).getNbreHab() < minNbrHab ){
				minNbrHab =  mapPays.get(key).getNbreHab();
				
				paysMoinsHab = key;
			}
			
		}

	}

}
