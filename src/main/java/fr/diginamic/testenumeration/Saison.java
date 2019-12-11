package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("Printemps",1),
	ETE("Ete",2),
	AUTOMNE("Automne",3),
	HIVER("Hiver",4);

	private String libelle;
	private int numero;
	
	
	private Saison(String libelle, int numero) {
		this.libelle = libelle;
		this.numero = numero;
	}

	public static Saison getSaison(String libelle){
		
		Saison[] saisons = Saison.values();
		
		for (Saison s : saisons){
			
			if(s.getLibelle() == libelle){
				return s;
			}
		}
		return null;
		
		
	}
	
	
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
