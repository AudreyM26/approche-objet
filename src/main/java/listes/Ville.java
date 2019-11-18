package listes;

public class Ville {

	private String nom;
	private String nbHab;
	
	public Ville(String nom, String nbHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
	}
	
	public String toString(){
		String texte = this.getNom()+" - "+this.getNbHab();
		return texte;
	}

	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNbHab() {
		return nbHab;
	}
	
	
	public void setNbHab(String nbHab) {
		this.nbHab = nbHab;
	}
}
