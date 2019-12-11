package fr.diginamic.banque.entites;

public class Rectangle implements ObjetGeometrique{
	
	private double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	//retourne calcul du perimetre d un cercle
	public double perimetre() {

		return Math.round(((longueur+largeur)*2)*100.00)/100.00;
	}

	//retourne calcul de la surface d un cercle
	public double surface() {
		
		return Math.round((longueur*largeur)*100.00)/100.00;
	}

	//redefinir toString pour afficher le perimetre et surface du rectangle
	public String toString(){
		String texte = "Rectangle de "+longueur+" x "+largeur+"\nPérimètre = "+perimetre()+"\nSurface = "+surface()+"\n";
		return texte;
	}
}
