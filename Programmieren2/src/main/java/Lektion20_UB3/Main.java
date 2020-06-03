package Lektion20_UB3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Vokabeltrainer vok = new Vokabeltrainer();
		ArrayList<String> german = new ArrayList<>();
		german.add("reinigen");
		german.add("säubern");
		german.add("putzen");
		
		vok.put("to clean", german);
		
		ArrayList<String> test = (ArrayList<String>) vok.getUbersetzung("to clean");
		System.out.println(test);
	
	}
	
}
