package entites;



public class AdressePostale {
	public int numeroRue;
	public String libelleVoie;
	public int codePostal;
	public String ville;
	
	public static int nbDepartement = 101;
	
	public AdressePostale(int pNum,String pLibellevoie,int pCodePostal,String pVille){
	
		this.numeroRue = pNum;
		this.libelleVoie = pLibellevoie;
		this.codePostal = pCodePostal;
		this.ville = pVille;
	}

}