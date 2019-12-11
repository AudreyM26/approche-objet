package maps;

import java.util.HashMap;
import java.util.Map;

/***
 * Voici une liste d'employés avec leur salaire respectifs :
	 Paul à 1750 
	 Hicham à 1825
	 Yu à 2250 
	 Ingrid à 2015 
	 Chantal à 2418 
 * Taches à réaliser :
 * Creez une classe ex�cutable appel�e CreationMap :
	o Créez une map nommée mapSalaires et qui permet de stocker les informations de salaire (valeur) en fonction du prénom de la personne (clé).
	o Une fois la map créée, affichez sa taille
 * @author audrey
 *
 */
public class CreationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Double> mapSalaires = new HashMap<>();
		
		// association d'une clé à chaque élément
		mapSalaires.put("Paul",(double)1750);
		mapSalaires.put("Hicham",(double)1825);
		mapSalaires.put("Yu",(double)2250);
		mapSalaires.put("Ingrid",(double)2015);
		mapSalaires.put("Chantal",(double)2418);
		
		System.out.println("Taille de la map : "+mapSalaires.size());	
	}

}
