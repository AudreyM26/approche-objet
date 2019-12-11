package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


/***
 * Créez une classe Pays possédant 3 attributs : nom, nb d'habitants, PIB/habitant.
 * Créez un HashSet de pays contenant les pays suivants avec les informations correctes de nombre d'habitants et de PIB/Hab:
 * Recherchez le pays avec le PIB/habitant le plus important
 * Recherchez le pays avec le PIB total le plus important
 * Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le plus petit
 * Supprimez le pays dont le PIB total est le plus petit
 * Affichez l'ensemble des pays ainsi modifiés avec leur nom, nombre d'habitants et PIB total
 * @author audrey
 *
 */


public class TestPaysPib {

	public static void main(String[] args) {
		
		//instancier la liste avec classe ville(nom,nbre hab)
		List<String> listPays = Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon","Chine", "Russie","Inde");
		List<Integer> listHabitants = Arrays.asList(327000, 67000, 82720, 66440, 60480, 126800, 1386000000, 144500, 1339000000);
		List<Double> listPibParHabitants = Arrays.asList(59531.60,38476.66,44469.91, 39720.44, 31952.98, 38428.10, 8826.99, 10743.10, 1939.61);

		
		//instancier le HashSet avec les liste pays, habitants et PIB par habitant
		Set<Pays> pays = new HashSet<>();
		
		
		for (int i=0;i<listPays.size();i++){
			
			pays.add(new Pays(listPays.get(i),listHabitants.get(i),listPibParHabitants.get(i)));
		}
		
		double maxPIB = 0;
		String PaysPIBHabMax = "";
		
		double totalPIB =0;
		String PaysPIBTotal ="";
		
		double minTotalPIB =0;
		
		//recuperer les elements dans le set
		Iterator<Pays> iterPays = pays.iterator();
	
		while (iterPays.hasNext()){
			Pays p = iterPays.next();
			//System.out.println(p);
			
			//recuperer pays avec pib/habitants plus important
			if(p.getPibParHab() > maxPIB){
				maxPIB = p.getPibParHab();
				PaysPIBHabMax = p.getNom();
			}
			
			//recuperer pays avec pib total plus eleve
			if(p.totalPIB() > totalPIB){
				totalPIB = p.totalPIB();
				PaysPIBTotal = p.getNom();
			}
			
			//recuperer pays avec pib total plus petit
			if(minTotalPIB == 0 || p.totalPIB() < minTotalPIB){
				minTotalPIB = p.totalPIB();
				
			}
			
		}
		
		
		System.out.println("Pays avec PIB/habitants plus élevé : "+PaysPIBHabMax);
		System.out.println("Pays avec PIB total plus élevé : "+PaysPIBTotal);
		
		
		Iterator<Pays> iterPaysMaj = pays.iterator();
		
		while (iterPaysMaj.hasNext()){
			
			Pays pMaj = iterPaysMaj.next();
			
			if(pMaj.totalPIB() == minTotalPIB){
				String nomMaj = pMaj.getNom().toUpperCase();
				pMaj.setNom(nomMaj);
				System.out.println("Pays avec PIB total moins elevé : "+pMaj.getNom()+"\n");
				
				//supprimer le pays qui a le pib total plus petit 
				pays.remove(pMaj);
		
			}
		}
	
		Iterator<Pays> iterPaysModif = pays.iterator();
		
	    while (iterPaysModif.hasNext()) {
	    	Pays p = iterPaysModif.next();
	    	System.out.println(p);
	    }
		
		
		
	}

}
