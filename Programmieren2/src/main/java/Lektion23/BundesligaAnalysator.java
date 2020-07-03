package Lektion23;

import java.util.*;
import java.util.function.Predicate;

public class BundesligaAnalysator {
	
	public static void main(String[] args) {
		//a)
		List<Mannschaft> tabelle = Mannschaft.createTabelle();
		
		//b) Mannschaften über 50 Punkten
		print("b");
		tabelle.stream().filter(new Predicate<Mannschaft>() {
			@Override
			public boolean test(Mannschaft mannschaft) {
				return mannschaft.punkte>50;
			}
		}).forEach(mannschaft -> System.out.println(mannschaft));
		//b) mit Lambda
		tabelle.stream().filter(mannschaft -> mannschaft.punkte>50)
		.forEach(mannschaft -> System.out.println(mannschaft.name));
		
		//c) Alle Mannschaftnamen
		print("c");
		tabelle.stream().forEach(mannschaft -> System.out.println(mannschaft));
		
		//d) Alle Mannschaften mit F, aber sortiert nach Alphabet
		print("d");
		tabelle.stream().filter(mannschaft -> mannschaft.name.startsWith("F"))
		.sorted((m1,m2) -> m1.name.compareTo(m2.name))
		.forEach(mannschaft -> System.out.println(mannschaft.name));
		
		//e) Mannschaft mit den meisten Gegentoren
		print("e");
		Mannschaft m3 = tabelle.stream().max( (m1,m2) -> m1.gegentore-m2.gegentore).get();
		System.out.println(m3);
		//e) Comparator ausgeschrieben
		Mannschaft m4 = tabelle.stream().max( (m1,m2) -> {
			if(m1.gegentore<m2.gegentore)return -1;
			if(m1.gegentore>m2.gegentore)return 1;
			return 1;
			
			}).get();
		
		System.out.println(m4);
		
	}
	
	public static void print(String aufgabe) {
		System.out.println("---Aufgabe " + aufgabe+"):---");
	}

}
