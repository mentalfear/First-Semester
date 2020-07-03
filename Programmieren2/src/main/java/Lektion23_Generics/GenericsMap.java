package Lektion23_Generics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class GenericsMap {

	public static void main(String[] args) {
		List<String> bBrothers = Arrays.asList("Burt","Bronski","Peter");
		
		//MAP-ANONYME KLASSE-NAME
		bBrothers.stream().map(new Function<String,String>() {
			@Override
			public String apply(String name) {
				return name.toUpperCase();
			}
			
		}).forEach(name -> System.out.println(name));
		
		//MAP-LAMBDA AUSDRUCK-NAME
		bBrothers.stream().map(name -> name.toUpperCase())
		.forEach(name -> System.out.println(name));
		
		//MAP-ANONYME KLASSE-LÄNGE
		bBrothers.stream().map(new Function<String,Integer>() {
			@Override
			public Integer apply(String name) {
				return name.length();
			}
		}).forEach(name -> System.out.println(name));
		
		//MAP-LAMBDA AUSDRUCK-LÄNGE
		bBrothers.stream().map(name -> name.length())
		.forEach(count -> System.out.println(count));
		
		
	}
	
}
