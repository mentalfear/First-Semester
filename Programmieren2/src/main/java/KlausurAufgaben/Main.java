package KlausurAufgaben;

import java.util.Iterator;

public class Main {

	public static class RouletteZahlen implements Iterable<Integer>{
		
		
		@Override
		public Iterator<Integer> iterator() {
			return new RouletteZahlenIterator();
		}

	}
	
	public static void main(String[] args) {
		RouletteZahlen rz = new RouletteZahlen();
		for(int i : rz) {
			System.out.println(i);
		}
	}
	
}
