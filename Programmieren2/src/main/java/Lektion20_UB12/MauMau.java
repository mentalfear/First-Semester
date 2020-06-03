package Lektion20_UB12;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MauMau implements Karte, Comparable<MauMau> {

	String farbe; // Symbol
	String wert; // Zahlen- oder Bildwert

	//Umwandlung zu zahlen für das einfachere Vergleichen
	String[] farbeWert = { "Kreuz", "Pik", "Herz", "Karo" };
	String[] wertWert = { "Bube", "Ass", "10", "König", "Dame", "9", "8", "7" };
	int farbeInt; 
	int wertInt;
	
	
	public MauMau(String farbe, String wert) {
		this.farbe = farbe;
		this.wert = wert;
		farbeInt = stellenWert(farbe, farbeWert); 
		wertInt = stellenWert(wert, wertWert);
	}

	@Override
	public String toString() {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		ps.printf("%10s %10s", farbe, wert);
		ps.flush();
		return baos.toString();
	}

	@Override
	public int compareTo(MauMau o) {
		//zwei Buben
		if(this.wertInt == 0 && o.wertInt == 0) {
			if(this.farbeInt < o.farbeInt) return -1;
			else return 1;
		}
		//ein Buben This
		else if(this.wertInt == 0) return -1;
		//Ein Buben o
		else if(o.wertInt == 0) return 1;
		// Kein Buben
		else {
			//this kleiner o bei Farbe
			if(this.farbeInt < o.farbeInt) return -1;
			//this gößer o bei Farbe
			else if(this.farbeInt > o.farbeInt) return 1;
			// Farbe gleich
			else {
				//this kleiner o bei Wert
				if(this.wertInt < o.wertInt) return -1;
				//this gößer o bei Wert
				else if(this.wertInt > o.wertInt) return 1;
				//Wert Gleich -> sollte nie pasieren
				else return 0;
			}
		}
	}
	

	public int stellenWert(String s, String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(s.compareTo(arr[i]) == 0) return i; 
		}
		return -1;
	}

}
