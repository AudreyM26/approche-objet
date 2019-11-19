package tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

import sets.Pays;

/***
 * Creez un package tri.
 * Reprenez la classe Pays du TP pr�c�dent et impl�mentez l�interface Comparable<Pays>.
 * Impl�mentez la m�thode compareTo de mani�re � ce que le tri se fasse sur le nom du pays (par ordre alphab�tique)
 * Creez une ArrayList et remplissez l� avec l�ensemble des pays du TP pr�c�dent
 * Triez la liste
 * Affichez le r�sultat afin de v�rifier que les pays sont bien tri�s dans l�ordre alphab�tique
 * @author audrey
 *
 */

public class TestTriPays {

	public static void main(String[] args) {
	
		
		List<String> listPays = Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon","Chine", "Russie","Inde");
		List<Integer> listHabitants = Arrays.asList(327000, 67000, 82720, 66440, 60480, 126800, 1386000000, 144500, 1339000000);
		List<Double> listPibParHabitants = Arrays.asList(59531.60,38476.66,44469.91, 39720.44, 31952.98, 38428.10, 8826.99, 10743.10, 1939.61);

		
		//instancier la liste avec classe pays(nom,nbre hab,pib/hab)
		List<Pays> list = new ArrayList<>();
		
		for (int i=0;i<listPays.size();i++){
			list.add(new Pays(listPays.get(i),listHabitants.get(i),listPibParHabitants.get(i)));
		}
	
		//tri avec Comparable dans classe pays
		System.out.println("Tri par nom");
		Collections.sort(list);
		for (Pays p : list) {
			System.out.println(p.toString());
        }
		
		//tri comparator avec appel classe ComparatorHabitant
		System.out.println("\nTri par hab");
		Collections.sort(list, new ComparatorHabitant());
				
		for (Pays p : list) {
			System.out.println(p.toString());
        }
		
		//tri comparator avec appel classe ComparatorPibHabitant
		System.out.println("\nTri par pib/hab");
		Collections.sort(list, new ComparatorPibHabitant());
		for (Pays p : list) {
			System.out.println(p.toString());
        }
	}
	
}
