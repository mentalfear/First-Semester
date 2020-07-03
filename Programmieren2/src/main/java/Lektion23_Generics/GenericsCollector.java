package Lektion23_Generics;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class GenericsCollector {

	public static void main(String[] args) {
		List<String> bBrothers = Arrays.asList("Bernd", "Bronski", "Peter");

		// eine Neue Liste erstellen anch dem Filtern
		List<String> nList = bBrothers.stream().filter(name -> name.startsWith("B")).collect(
				// Gibt an in was es gespeichert werden soll
				// Supplier, der angibt, wie der Container (die Liste) zu Beginn erstellt wird.
				new Supplier<ArrayList<String>>() {
					public ArrayList<String> get() {
						return new ArrayList<>();
					}
				},
				// Gibt an wie die einzelnen Elemente in die neue Liste eingetragen werden
				// sollen
				// Accumulator, der angibt, wie die Liste befüllt wird (Elemente werden der Liste hinzugefügt).
				new BiConsumer<ArrayList<String>, String>() {
					public void accept(ArrayList<String> l, String name) {
						l.add(name);
					}
				},
				// Gibt an wie die Listen untereinander verbunden werden sollen
				// Combiner, der angibt, wie Teillisten zusammengefügt werden.
				new BiConsumer<ArrayList<String>, ArrayList<String>>() {
					public void accept(ArrayList<String> l1, ArrayList<String> l2) {
						l1.addAll(l2);
					}
				});
		
		// mit LAMBDA-Ausdrücken
		List<String> nList2 = bBrothers.stream().filter(name -> name.startsWith("B"))
				.collect(
						() -> new ArrayList<>(),
						(l,name) -> l.add(name),
						(l1,l2) -> l1.addAll(l2)
						);
		
		//Vorgefertigte Collectors
		List<String> nList3 = bBrothers.parallelStream().filter(name -> name.startsWith("B"))
				.collect(Collectors.toList());
		
		nList.stream().forEach(name -> System.out.println(name));
		nList2.stream().forEach(name -> System.out.println(name));
		nList3.stream().forEach(name -> System.out.println(name));
	}

}
