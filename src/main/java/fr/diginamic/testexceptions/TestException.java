package fr.diginamic.testexceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TestException {

	public static void main(String[] args)  {
	
		//avec exception impossible a executer si pas de try catch
		try {
			System.out.println(Operation.diviser(5,3)+"\n");
		} catch (DivException e) {
			System.out.println(e.getMessage());
		}
		
		try{
			System.out.println(Operation.diviser(10,2)+"\n");
		}catch(DivException e){
		
			System.out.println(e.getMessage());
		}
		
		try{
			System.out.println(Operation.diviser(10,0));
		}catch(DivException e){
		
			System.out.println(e.getMessage());
		}
		
	}

}
