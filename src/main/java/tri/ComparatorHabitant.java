package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorHabitant implements Comparator<Pays> {

	//tri par habitant
	public int compare(Pays p1, Pays p2) {
		
		
		if (p1.getNbreHab()> p2.getNbreHab()){
			return 1;
		}
		else if (p1.getNbreHab() < p2.getNbreHab()){
			return -1;
		}
		return 0;
	}
}
