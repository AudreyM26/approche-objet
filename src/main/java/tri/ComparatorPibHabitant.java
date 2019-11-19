package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorPibHabitant implements Comparator<Pays> {

	//tri par PIB/hab
	public int compare(Pays p1, Pays p2) {
		
		
		if (p1.getPibParHab()> p2.getPibParHab()){
			return 1;
		}
		else if (p1.getPibParHab() < p2.getPibParHab()){
			return -1;
		}
		return 0;
	}
}