package Lektion23_Generics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class GenericsFilter {

	public static void main(String[] args) {
		List<String> bBrothers = Arrays.asList("Bert","Bronski","Peter");
	
		//Filter-Anonyme Klasse-Anzahl echter Brüder
		long numberOfRealBrothers = bBrothers.stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String name) {
				return name.startsWith("B");
			}
		}).count();
		System.out.println(numberOfRealBrothers);
		
		//Filter-LAMBDA-Anzahl echter Brüder
		numberOfRealBrothers = bBrothers.stream().filter(name -> name.startsWith("B")).count();
		System.out.println(numberOfRealBrothers);
		
		
	}
}
