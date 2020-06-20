package Lektion22_A4;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if(o1.length() < o2.length()) return -1;
		else if(o1.length() > o2.length()) return 1;
		
		return o1.compareTo(o2);
	}
	

}
