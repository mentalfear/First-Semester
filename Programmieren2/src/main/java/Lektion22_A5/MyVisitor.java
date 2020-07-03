package Lektion22_A5;

import Lektion22_A5.Baum.Knoten;

public class MyVisitor<E> implements Visitor<E>{

	public int anzahlKnoten = 0;
	
	@Override
	public void visit(Knoten<E> current) {
		anzahlKnoten++;
		
	}

}
