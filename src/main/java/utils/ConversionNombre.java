package utils;
import java.lang.*;
import java.util.Scanner;

public class ConversionNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String number = "10";
		
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Entrez votre le nombre 1: ");
		int a = saisie.nextInt();
	
		System.out.println("Entrez le nombre 2: ");
		int b = saisie.nextInt();
		
		int stringNumber = Integer.parseInt(number);

		int result = maxNombres(a,b);
		
		System.out.println("convertir chaine en int : "+stringNumber);
		System.out.println("resultat du max entre deux nombres "+result);
	}
	
	public static int maxNombres(int pA, int pB) {
		
		int pResult = Integer.max(pA,pB);
		return pResult;
	}
}
