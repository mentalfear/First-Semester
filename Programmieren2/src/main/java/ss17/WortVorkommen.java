package ss17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class WortVorkommen {
	
	HashMap<Wort, ArrayList<Position>> map;
	
	public WortVorkommen() {
		map = new HashMap<>();
	}
	
	public void einfuegen(Wort wort, Position pos) {
		if(map.keySet().contains(wort)) {
			map.get(wort).add(pos);	
		}else {
			ArrayList<Position> arr = new ArrayList<>();
			arr.add(pos);
			map.put(wort, arr);
		}
		
	}
	
	public Collection<Position> holeAlle(Wort wort) {
		return map.get(wort);
	}
	
	public Position holeLetzte(Wort wort) {
		
		return map.get(wort).get(map.get(wort).size() -1); 
	}
	
	public int anzahlVorkommen(Wort wort) {
		Collection<Position> col = holeAlle(wort);
		return col.size();
	}
	
	
	

}
