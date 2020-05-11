package de.fhws.UnitTest;

public class Sign {
	
	public static int sign(int wert) {
		if(wert < 0) return -1;
		else if (wert > 0) return 1;
		else return 0;
	}
}
