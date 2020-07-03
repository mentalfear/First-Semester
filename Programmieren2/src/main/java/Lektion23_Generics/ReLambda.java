package Lektion23_Generics;

import java.util.*;
import java.util.function.Consumer;

public class ReLambda {
	
	public static void main(String[] args) {
		List<String> bBrothers = Arrays.asList("Bert","Bronski","Peter");
		
		//Allgemein mit Wiederholung des LAMBDA ausdrückes
		bBrothers.stream().filter(name -> name.startsWith("B"))
		.forEach(name -> System.out.println(name));
		
		bBrothers.stream().filter(name -> name.startsWith("P"))
		.forEach(name -> System.out.println(name));
		
		//Variable für Lambda-Ausdruck
		Consumer printOut = name -> System.out.println(name);
		bBrothers.stream().filter(name -> name.startsWith("B"))
		.forEach(printOut);
		
		bBrothers.stream().filter(name -> name.startsWith("P"))
		.forEach(printOut);
		
		//
		
		
	}

}
