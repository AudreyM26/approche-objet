package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Ville> listeVille = new ArrayList<Ville>();

		List<Ville> listeVilleDpt = new ArrayList<Ville>();

		List<Ville> listeVilleRegion = new ArrayList<Ville>();

		listeVille = initVille();
		int populationDpt = 0;
		int minComm = 0;
		String petiteCommune = "";
		int populationTotaleRegion = 0;

		for (Ville v : listeVille) {

			// afficher les informations de la ville de Montpellier
			if (v.getNomCommune().equals("Montpellier")) {
				System.out.println(v + "\n");
			}

			// afficher la population totale du departement 34
			if (v.getCodeDepartement().equals("34")) {

				populationDpt = populationDpt + v.getPopulation();

				// afficher la plus petite ville du departement 34
				if (minComm == 0 || v.getPopulation() < minComm) {
					minComm = v.getPopulation();
					petiteCommune = v.getNomCommune();
				}

				// remplir la liste avec les informations du departement 34
				listeVilleDpt.add(v);
			}

			// afficher la population totale du la region occitanie
			if (v.getNomRegion().equals("Occitanie")) {

				populationTotaleRegion = populationTotaleRegion + v.getPopulation();

				// remplir la liste des regions d occitanie pour le tri
				listeVilleRegion.add(v);
			}
		}

		System.out.println("La population de l'Hérault est : " + populationDpt + " hab\n");
		System.out.println("La plus petite commune de l'Hérault est : " + petiteCommune + "\n");

		// afficher les 10 plus grandes villes du departement 34
		System.out.println("\nAfficher les 10 plus grandes villes de l'Hérault : ");
		Collections.sort(listeVilleDpt, new ComparatorPlusGrandeVille());

		for (int i = 0; i < 10; i++) {
			System.out.println(listeVilleDpt.get(i));
		}

		// afficher les 10 plus petites villes du departement 34
		System.out.println("\nAfficher les 10 plus petites villes de l'Hérault : ");
		Collections.sort(listeVilleDpt, new ComparatorPlusPetiteVille());

		for (int i = 0; i < 10; i++) {
			System.out.println(listeVilleDpt.get(i));
		}

		System.out.println("\nLa population totale de la région Occitanie : " + populationTotaleRegion + " hab.");

		// afficher les 10 villes plus importantes de l Occitanie
		System.out.println("\nAfficher les 10 plus grandes villes de l'Occitanie : ");
		Collections.sort(listeVilleRegion, new ComparatorPlusGrandeVille());

		for (int i = 0; i < 10; i++) {
			System.out.println(listeVilleRegion.get(i));
		}

		
		// afficher le departement le plus peuplé de l Occitanie
		HashMap<String, Departement> mapDept = new HashMap<>();
		
		//recuperer les autres departements dans une map
		HashMap<String, Departement> mapDeptTotal = new HashMap<>();
		
		for (Ville villeDept : listeVille) {
			String keyDept = villeDept.getCodeDepartement();
			
			if(villeDept.getNomRegion().equals("Occitanie")){
				
				Departement existDept = mapDept.get(keyDept);

				if (existDept == null) {
					Departement ajoutDept = new Departement(keyDept);
					ajoutDept.setNbreHab(villeDept.getPopulation());
					mapDept.put(keyDept, ajoutDept);
				} else {
					int calculHab = mapDept.get(keyDept).getNbreHab();
					mapDept.get(keyDept).setNbreHab(calculHab + villeDept.getPopulation());
				}
			}else{
				Departement existDeptTotal = mapDeptTotal.get(keyDept);

				if (existDeptTotal == null) {
					Departement ajoutDeptTotal = new Departement(keyDept);
					ajoutDeptTotal.setNbreHab(villeDept.getPopulation());
					mapDeptTotal.put(keyDept, ajoutDeptTotal);
				} else {
					int calculHab = mapDeptTotal.get(keyDept).getNbreHab();
					mapDeptTotal.get(keyDept).setNbreHab(calculHab + villeDept.getPopulation());
				}	
			}
			
		}
		
		//ajouter les departements occitanie dans mapDeptTotal
		mapDeptTotal.putAll(mapDept);
		
		Set<String> keySet = mapDept.keySet();
		int maxDeptHab = 0;
		String maxDept = "";

		for (String key : keySet) {

			if (mapDept.get(key).getNbreHab() > maxDeptHab) {
				maxDeptHab = mapDept.get(key).getNbreHab();
				maxDept = key;
			}	
			// System.out.println(mapDept.get(key).getCodeDepartement()+" "+mapDept.get(key).getNbreHab());
		}

		System.out.println("\nLe département le plus peuplé de l' Occitanie : " + maxDept);

		// afficher les 10 régions les plus peuplées de France
		System.out.println("\nAfficher les 10 régions les plus peuplées de France ");
		HashMap<String, Region> mapRegion = new HashMap<>();

		for (Ville villeRegion : listeVille) {
			String keyReg = villeRegion.getCodeRegion();
			Region existReg = mapRegion.get(keyReg);

			if (existReg == null) {
				Region ajoutReg = new Region(keyReg,villeRegion.getNomRegion());
				ajoutReg.setNbreHab(villeRegion.getPopulation());
				mapRegion.put(keyReg, ajoutReg);
			} else {
				int calculHab = mapRegion.get(keyReg).getNbreHab();
				mapRegion.get(keyReg).setNbreHab(calculHab + villeRegion.getPopulation());
			}
		}

		//creation liste region avec la population par region
		List<Region> listeRegion = new ArrayList<Region>();
		
		listeRegion.addAll(mapRegion.values());
	
		//tri population plus éleve par region
		Collections.sort(listeRegion, new ComparatorRegion());
		
		for (int i = 0; i < 10; i++) {
			System.out.println(listeRegion.get(i));
		}
		
		// afficher les 10 départements les plus peuplées de France
		System.out.println("\nAfficher les 10 départements les plus peuplés de France ");
		//creation liste departement avec la population par departement
		List<Departement> listeDeptTotal = new ArrayList<Departement>();
		
		listeDeptTotal.addAll(mapDeptTotal.values());
		
	
		//tri population plus eleve par departement
		Collections.sort(listeDeptTotal, new ComparatorDepartement());
		
		for (int i = 0; i < 10; i++) {
			System.out.println(listeDeptTotal.get(i));
		}
				
		
		System.out.println("\nAfficher les 10 villes les plus peuplées de France ");
		Collections.sort(listeVille, new ComparatorPlusGrandeVille());
		for (int i = 0; i < 10; i++) {
			System.out.println(listeVille.get(i).getNomCommune()+" - "+listeVille.get(i).getPopulation()+" hab");
		}
	
	}

	
	//initialiser la liste des villes
	public static List<Ville> initVille() {

		List<Ville> liste = new ArrayList<Ville>();

		try {
			File file = new File("C:/Users/audrey/Documents/Developpement/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");

			lignes.remove(0);

			for (String ligne : lignes) {
				// System.out.println(ligne);

				String[] content = ligne.split(";");

				String codeRegion = content[0];
				String nomRegion = content[1];
				String codeDepartement = content[2];
				String codeCommune = content[3];
				String nomCommune = content[5];

				int population = Integer.parseInt(content[6].replace(" ", ""));

				liste.add(new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, population));

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return liste;
	}

}
