package maps;

import java.util.HashMap;
import java.util.Map;

/***
 * Voici une liste d�employ�s avec leur salaire respectifs :
	� Paul � 1750 �
	� Hicham � 1825 �
	� Yu � 2250 �
	� Ingrid � 2015 �
	� Chantal � 2418 �
 * T�ches � r�aliser :
 * Creez une classe ex�cutable appel�e CreationMap :
	o Cr�ez une map nomm�e mapSalaires et qui permet de stocker les informations de salaire (valeur) en fonction du pr�nom de la personne (cl�).
	o Une fois la map cr��e, affichez sa taille
 * @author audrey
 *
 */
public class CreationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Double> mapSalaires = new HashMap<>();
		
		// association d'une cl� � chaque �l�ment
		mapSalaires.put("Paul",(double)1750);
		mapSalaires.put("Hicham",(double)1825);
		mapSalaires.put("Yu",(double)2250);
		mapSalaires.put("Ingrid",(double)2015);
		mapSalaires.put("Chantal",(double)2418);
		
		System.out.println("Taille de la map : "+mapSalaires.size());	
	}

}
