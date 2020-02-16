package fr.diginamic.testexceptions;

public class Operation {
	
	static double diviser(double a,double b) throws DivException {

		
		if(b == 0){
			throw new DivException("Il est interdit de diviser par zéro ");
		}
		
		return a/b;
	}
	
	static double diviserRuntime(double a,double b)  {

		
		if(b == 0){
			throw new DivRunTimeException("Il est interdit de diviser par zéro Runtime");
		}
		
		return a/b;
	}
	
}
