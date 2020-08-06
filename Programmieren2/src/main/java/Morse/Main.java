package Morse;

public class Main {
	
	public static void main(String[] args) {
		Morse m = new Morse();
		for(String str : m.map.keySet()) {
			System.out.println(str);
		}
		
		System.out.println(m.zeichneketteToMorse("Klausur"));
	}

}
