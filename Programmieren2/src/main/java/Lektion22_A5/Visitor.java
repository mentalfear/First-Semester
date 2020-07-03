package Lektion22_A5;

import Lektion22_A5.Baum.Knoten;

public interface Visitor<T> {

	public void visit(Knoten<T> current);
}
