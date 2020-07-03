package Lektion22_A4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Kreuzwortraetsel {
	static String[] alleWoerter = { "Bienenschwarm", "Buch", "Bibel", "Beige", "Barriere", "Bein", "Beil", "Christ",
			"Christian", "Carmen" };

	public static void main(String[] args) {
		//normale Sortierung bei TreeSet-----------------------------
		TreeSet<String> t1 = new TreeSet<>();
		t1.addAll(Arrays.asList(alleWoerter));
		for (String wort : t1)
			System.out.println(wort);
		
		//MyComparator-----------------------------------------------
		System.out.println("--MyComparator--");
		TreeSet<String> t2 = new TreeSet<>(new MyComparator());
		t2.addAll(Arrays.asList(alleWoerter));
		for (String wort : t2)
			System.out.println(wort);
		
		//Anonymer Comparator----------------------------------------
		System.out.println("--anonymerComparator--");
		TreeSet<String> t3 = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.length() < o2.length()) return 1;
				else if(o1.length() > o2.length()) return -1;
				
				return o1.compareTo(o2);
			}
		});
		t3.addAll(Arrays.asList(alleWoerter));
		for (String wort : t3)
			System.out.println(wort);
		
		//LAMBDA-Ausdrücke-------------------------------------------
		System.out.println("--LAMBDA-Ausdruck--");
		TreeSet<String> t4 = new TreeSet<>((o1,o2) -> {
			if(o1.length() < o2.length()) return 1;
			else if(o1.length() > o2.length()) return -1;
			
			return o1.compareTo(o2);
		});
		t4.addAll(Arrays.asList(alleWoerter));
		t4.stream().forEach(wort -> System.out.println(wort));
		
		
	}

}
