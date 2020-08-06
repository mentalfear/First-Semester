package KlausurAufgaben;

import java.util.ArrayList;
import java.util.Iterator;

public class RouletteZahlenIterator implements Iterator<Integer>{
	
	private int currentPos = 0;
	
		
	@Override
	public boolean hasNext() {
		return currentPos < 3;
	}
	
	@Override
	public Integer next() {
		int zahl = (int) (Math.random() * 37 -1);
		if(zahl == 0) currentPos++;
		return zahl;
	}
	

}
