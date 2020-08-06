package Morse;

import java.util.HashMap;

public class Morse {
	HashMap<String,String> map;
	public static String[][] tabelle = {
			{ "A", ".−"},
			{ "B", "−..."},
			{ "C", "−.-."},
			{ "D", "-.."},
			{ "E", "."},
			{ "F", "..-."},
			{ "G", "--."},
			{ "H", "...."},
			{ "I", ".."},
			{ "J", ".---"},
			{ "K", "_._"},
			{ "L", ".-.."},
			{ "M", "--"},
			{ "N", "-."},
			{ "O", "---"},
			{ "P", ".--."},
			{ "Q", "--.-"},
			{ "R", ".-."},
			{ "S", "..."},
			{ "T", "-"},
			{ "U", "..-"},
			{ "V", "...-"},
			{ "W", ".--"},
			{ "X", "-..-"},
			{ "Y", "-.--"},
			{ "Z", "--.."}
			}; // end tabelle
	

	public Morse() {
		map = getMorseCodeMap(tabelle);
	}
	
	public HashMap<String, String> getMorseCodeMap(String[][] table) {
		HashMap<String, String> temp = new HashMap<>();
		
		for(int i = 0; i < table.length; i++ ) {
			temp.put(table[i][0], table[i][1]);
		}

		return temp;
	}
	
	public String zeichneketteToMorse(String s) {
		String kette = "";
		for(Character c : s.toCharArray()) {
			kette += map.get(String.valueOf(c).toUpperCase());
			kette += " ";
		}
		
		return kette;
		
	}
}

