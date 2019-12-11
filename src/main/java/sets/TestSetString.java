package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/***
 * Dans le package sets, créez une classe TestSetString exécutable. Dans cette classe instanciez un HashSet de String contenant les éléments suivants : 
	o USA, France, Allemagne, UK, Italie, Japon, Chine, Russie, Inde 
 * Recherchez le pays dans cette liste qui a le plus grand nombre de lettres
 * Supprimez ce pays
 * Affichez enfin le contenu de la collection ainsi modifiée
 * 
 * @author audrey
 *
 */

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<>();

		set.add("USA");
		set.add("France");
		set.add("Alemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");

		int wordMax = 0;
		String paysWordMax ="";
		
		//recuperer l element qui a le plus de lettres dans le set
		Iterator<String> iterator = set.iterator();
	
		while (iterator.hasNext()){
			String p = iterator.next();
			//System.out.println(p+" "+p.length());
			
			if(p.length() > wordMax){
				wordMax = p.length();
				paysWordMax= p;
			}
		}
		
		//affichage du pays qui a le plus de lettres
		System.out.println("Pays qui a le plus de lettres : "+paysWordMax+"\n");
		
		//supprimer le pays qui a le plus de lettres 
		set.remove(paysWordMax);
		
		// afichage des elements de la collection
		Iterator<String> iterator2 = set.iterator();
		
		while (iterator2.hasNext()){
			String p = iterator2.next();
			System.out.println(p+" "+p.length());			
			
		}

	}

}
