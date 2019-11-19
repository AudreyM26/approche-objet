package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparateurDepartement  implements Comparator<Departement> {

	public int compare(Departement d1, Departement d2) {
		
		if (d1.getNbreHab() < d2.getNbreHab()){
			return 1;
		}
		else if (d1.getNbreHab() > d2.getNbreHab()){
			return -1;
		}
		return 0;
	}
}
