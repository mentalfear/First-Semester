package Musik;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


public class MusikStueckSammlung {
	
	HashMap<String, MusikStueck> map;
	
	public MusikStueckSammlung() {
		map = new HashMap<>();
	}
	
	public void musikStueckEinfuegen(MusikStueck neu) {
		
		if(map.containsKey(neu.getTitel())) System.out.println("Gibt Schon");
		else {
			map.put(neu.getTitel(), neu);
		}
	}
	
	
	
	public List<MusikStueck> getAlleMusikStueckeNachTitel() {
		class VergleicheMusikStueckTitel implements Comparator<MusikStueck> {
			@Override
			public int compare(MusikStueck a, MusikStueck b) {
				return a.titel.compareTo(b.titel);
			}
		}

		class VergleicheMusikStueckLaenge implements Comparator<MusikStueck> {
			@Override
			public int compare(MusikStueck a, MusikStueck b) {
				return Integer.compare(a.getLaenge(), b.getLaenge());
			}

		}
		
		List<MusikStueck> set = map.values().stream().collect(Collectors.toList());
		VergleicheMusikStueckTitel comp = new VergleicheMusikStueckTitel();
		Collections.sort(set, comp);
		return set;
		
		
	}
	
	public static void main (String[] args){
		MusikStueckSammlung ms = new MusikStueckSammlung();
		ms.musikStueckEinfuegen(new MusikStueck("Hello", "Adele", 550));
		ms.musikStueckEinfuegen(new MusikStueck("World", "Foo", 330));
		ms.musikStueckEinfuegen(new MusikStueck("!", "Bar", 420));

		for(MusikStueck m : ms.getAlleMusikStueckeNachTitel())
		
		System.out.println(m);

	}

}
