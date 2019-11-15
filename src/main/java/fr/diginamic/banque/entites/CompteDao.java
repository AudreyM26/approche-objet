package fr.diginamic.banque.entites;

/**
 * Liste les méthodes obligatoires pour la persistence des comptes
 * 
 * @author DIGINAMIC
 */
public interface CompteDao {
	/**
	 * Retourne la liste de tous les comptes
	 * @return
	 */
	Compte[] lister();

	/**
	 * Permet de sauvegarder un nouveau compte
	 * @param nvCompte nouveau compte à sauvegarder
	 */
	void sauvegarder(Compte nvCompte);

	/**
	 * Supprime un compte Retourne true si la suppression a été réalisée avec
	 * succès, false sinon.
	 * @param numero numéro du compte à supprimer
	 */
	boolean supprimer(int numero);

	/**
	 * Retourne true si le numéro du compte passé en paramètre existe, false
	 * dans le cas contraire
	 * @param numero numéro du compte
	 * @return boolean
	 */

	boolean existe(int numero);

	/**
	 * Retourne le compte dont le numéro est passé en paramètre
	 * @param numero numéro du compte
	 * @return Compte
	 */
	Compte getCompte(int numero);
}
