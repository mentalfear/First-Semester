package KlausurAufgaben;

import java.util.ArrayList;
import java.util.Iterator;

public class RouletteZahlenExtern implements Iterable<Integer>{
	
	
	@Override
	public Iterator<Integer> iterator() {
		return new RouletteZahlenIterator();
	}

}
