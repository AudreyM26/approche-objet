package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorRegion implements Comparator<Region> {

	public int compare(Region r1, Region r2) {
		
		if (r1.getNbreHab() < r2.getNbreHab()){
			return 1;
		}
		else if (r1.getNbreHab() > r2.getNbreHab()){
			return -1;
		}
		return 0;
	}
}
