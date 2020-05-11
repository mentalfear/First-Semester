package Lektion16_UB3;

import java.util.ArrayList;

//Klasse zum Upload ins e-learning
@SuppressWarnings("all")
public class StackVererbung extends ArrayList implements StackInterface {

	public void push(Object o) {
		this.add(o);
	}

	public Object pop() {
		Object e = this.get(this.size() - 1);
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
