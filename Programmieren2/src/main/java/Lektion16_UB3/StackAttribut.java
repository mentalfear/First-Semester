package Lektion16_UB3;

import java.util.ArrayList;

public class StackAttribut implements StackInterface {

	ArrayList<Object> a;

	public StackAttribut() {
		a = new ArrayList<Object>();
	}

	public void push(Object o) {
		a.add(o);
	}

	public Object pop() {
		Object o = a.get(a.size() - 1);
		a.remove(a.size() - 1);
		return o;
	}

	@Override
	public String toString() {
		String out = "";
		for (int i = 0; i < a.size(); i++) {
			out += a.get(i) + ", ";
		}
		return out;
	}

}
