package Lektion22;

import java.util.ArrayList;
import java.util.HashMap;

public class A2_PrimzahlThread extends Thread{
	
	ArrayList<Integer> primzahlen = new ArrayList<>(); 
	HashMap<Integer,Boolean> map = new HashMap<>();
	
	public A2_PrimzahlThread(ArrayList<Integer> primzahlen) {
		this.primzahlen = primzahlen;
	}
	
	private boolean testeObPrimzahl(int num) {
		if (num < 2) return false;
		for(int divisor = 2; divisor < num; divisor++) {
			if(num % divisor == 0) return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		String erg = "";
		for(Integer num : primzahlen) {
			erg += num + " -> ";
			erg += map.get(num) + "\n"; 
		}
		return erg;
	}
	
	@Override
	public void run() {
		for(Integer num : primzahlen) {
			boolean isPrim = testeObPrimzahl(num);
			map.put(num, isPrim);
		}
	}

}
