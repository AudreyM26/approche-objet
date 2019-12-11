package fr.diginamic.dates;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		//affichage date
		
		Date date = new Date();
		date.setHours(23);
		date.setMinutes(30);
		date.setSeconds(59);
		
		SimpleDateFormat formattage = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Date du jour format jour/mois/année\n"+formattage.format(date)+"\n");
	
	    SimpleDateFormat formattageYearHour = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
		System.out.println("Date du jour format année/mois/jour heure:minute:seconde\n"+formattageYearHour.format(date)+"\n");
		
		SimpleDateFormat formattageHeure = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println("Date du jour format jj-mm-aaaa hh:mm:ss\n"+formattageHeure.format(date)+"\n");
	}
}
