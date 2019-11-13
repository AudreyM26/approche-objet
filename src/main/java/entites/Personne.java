package entites;

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adresse;

	public Personne(String pNom,String pPrenom){
		
		this.nom = pNom;
		this.prenom = pPrenom;
	}
	
	public Personne (String pNom,String pPrenom,AdressePostale pAdresse){
		this.nom = pNom;
		this.prenom = pPrenom;
		this.adresse = pAdresse;
	}
	
	public void AfficheNomPrenom() {
		System.out.println(this.nom.toUpperCase()+" "+this.prenom);
	
	}
	
	public void ModifNom(String newNom) {
		this.nom = newNom;
	}
	
	public void ModifPrenom(String newPrenom) {
		this.prenom = newPrenom;
	}
	
	public void ModifAdresse(AdressePostale newAdresse) {
		this.adresse = newAdresse;
	}
	
	
	public String getNom (String pNom) {
		return pNom;
	}
	
	public String getPrenom (String pPrenom) {
		return pPrenom;
	}
	
	public AdressePostale getAdresse (AdressePostale pAdresse) {
		return pAdresse;
	}
	
	
	
}
