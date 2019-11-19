package fr.diginamic.recensement;

public class Ville {

	private String codeRegion;
	private String nomRegion;

	private String codeDepartement;
	private String codeCommune;
	private String nomCommune;
	
	private int population;
	
	public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune, int population) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.population = population;
	}
	
	public String toString(){
		String texte = "R�gion : "+this.getCodeRegion()+" "+this.getNomRegion()+" - D�partement : "+this.getCodeDepartement()+" - Commune : "+this.getCodeCommune()+" "+this.getNomCommune()+" - Population : "+this.getPopulation()+" hab";
		return texte;
	}


	public String getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	
	
	
	
}
