package Lektion22_A3_ServerThread;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.Serializable;

public class Primzahlen implements Serializable{
	private static final long serialVersionUID = 1L;
	static final int maxZahl = 100;
	
	ArrayList<Integer> arr = new ArrayList<>();
	HashMap<Integer, Boolean> map;
	
	
	public Primzahlen() {
		arr = erzeugeArray(10);
		map = new HashMap<>();
	}
	
	private ArrayList<Integer> erzeugeArray(int anzahlZahlen) {

		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < anzahlZahlen; i++) {
			arr.add((int) (Math.random() * maxZahl));
		}

		return arr;
	}

	@Override
	public String toString() {
		String ret = "";
		for (Integer num : arr) {
			ret += num + " -> " + map.get(num) + "\n";
		}
		return ret;
	}
	
	
}
