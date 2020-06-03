package Lektion19_UB2;

import java.util.ArrayList;

public class GenericStack<E> extends ArrayList<E>{

	public void push(E e) {
		this.add(e);
	}
	
	public E pop() {
		E e = this.get(this.size() - 1);
		this.remove(this.size() - 1);
		
		return e;
	}

	@Override
	public String toString() {
		String out = "";
		for (int i = 0; i < this.size(); i++) {
			out += this.get(i) + ", ";
		}

		return out;
	}
	
	
}
