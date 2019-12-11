package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Saison[] saison = Saison.values();
		
		for (Saison s : saison) { 
		    System.out.println(s); 
		}
		
		Saison ete = Saison.ETE;
		
		System.out.println(ete);
		
		System.out.println(Saison.getSaison("Hiver"));
	
	}

}
