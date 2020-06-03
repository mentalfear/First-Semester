package Lektion20_UB3;

import java.util.HashMap;
import java.util.List;

public class Vokabeltrainer {
		
	HashMap<String, List<String>> english2german = new HashMap<>();

	public Vokabeltrainer() {
		
	}
	
	public void put(String eng, List<String> arr) {
		english2german.put(eng, arr);
	}
	
	public List<String> getUbersetzung(String key) {
		
		return english2german.get(key);
		
	}
}
