package fr.diginamic.testexceptions;

public class TestRuntimeException {

	public static void main(String[] args) {
		
		
		System.out.println(Operation.diviserRuntime(10,2)+"\n");
		
		//avec runtimeexception erreur apres execution, pas de souci lors de la compilation
		//ajouter le try catch pour resoudre le probleme comme pour exception
		try{
			System.out.println(Operation.diviserRuntime(10,0));
		}catch(DivRunTimeException e){
		
			System.out.println(e.getMessage());
		}

	}

}
