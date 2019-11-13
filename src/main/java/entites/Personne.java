package entites;

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adresse;

	public Personne(String pNom,String pPrenom){
		
		this.nom = pNom;
		this.prenom = pPrenom;
	}
	
	

	public Personne(String pNom,String pPrenom,AdressePostale pAdresse){
		
		this.nom = pNom;
		this.prenom = pPrenom;
		this.adresse = pAdresse;
	}
}
