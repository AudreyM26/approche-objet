package sets;


/***
 * Créez une classe Pays possédant 3 attributs : nom, nb d’habitants, PIB/habitant.
 * Créez un HashSet de pays contenant les pays suivants avec les informations correctes de nombre d’habitants et de PIB/Hab:
 * Recherchez le pays avec le PIB/habitant le plus important
 * Recherchez le pays avec le PIB total le plus important
 * Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le plus petit
 * Supprimez le pays dont le PIB total est le plus petit
 * Affichez l’ensemble des pays ainsi modifiés avec leur nom, nombre d’habitants et PIB total
 * @author audrey
 *
 */
public class Pays {

	private String nom;
	private int nbreHab;
	private Double PibParHab;
	
	
	public Pays(String nom, Integer nbHab, Double PibParHab) {
		this.nom =nom;
		this.nbreHab =nbHab;
		this.PibParHab = PibParHab;
	}

	public double totalPIB(){
		
		return this.PibParHab*this.nbreHab;
	}

	
	public String toString(){
		String texte = this.getNom()+" - hab : "+this.getNbreHab()+" - PIB total : "+this.totalPIB();
		return texte;
	}

	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNbreHab() {
		return nbreHab;
	}


	public void setNbreHab(int nbreHab) {
		this.nbreHab = nbreHab;
	}


	public Double getPibParHab() {
		return PibParHab;
	}


	public void setPibParHab(Double pibParHab) {
		PibParHab = pibParHab;
	}
	
}
