package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		// affichage date calendar
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR,cal.get(Calendar.YEAR ));
		cal.set(Calendar.MONTH, cal.get(Calendar.MONTH ));
		cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH ));
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 59);
		
		Date date = cal.getTime();
				
		SimpleDateFormat formattage = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Date du jour format jour/mois/année\n"+formattage.format(date)+"\n");
		
		SimpleDateFormat formattageYearHour = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
		System.out.println("Date du jour format année/mois/jour heure:minute:seconde\n"+formattageYearHour.format(date)+"\n");
		
		SimpleDateFormat formattageHeure = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println("Date du jour format jj-mm-aaaa hh:mm:ss\n"+formattageHeure.format(date)+"\n");
		
		
	}

}
