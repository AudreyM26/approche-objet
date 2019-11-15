package fr.diginamic.banque.entites;

public class Cercle implements ObjetGeometrique {

	private double rayon;
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	//retourne calcul du perimetre d un cercle
	public double perimetre() {

		return Math.round((2*Math.PI*rayon)*100.00)/100.00;
	}

	//retourne calcul de la surface d un cercle
	public double surface() {
		
		return Math.round((Math.PI*Math.pow(rayon,2))*100.00)/100.00;
	}
	
	//redefinir toString pour afficher le perimetre et surface du cercle
	public String toString(){
		String texte = "Cercle de rayon:"+rayon+" \nPérimètre = "+perimetre()+"\nSurface = "+surface()+"\n";
		return texte;
	}
}
