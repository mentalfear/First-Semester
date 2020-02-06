package Lektion03;

import java.util.Scanner;

public class Aufgabe6_Schaltjahr {
	
	public static void main(String[] args)
	{
		//Variablen
		int jahreszahl = 2005;
		
		//Eingabe
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gib eine Jahreszahl ein");
		jahreszahl = scanner.nextInt();
		
		
		//Berechnung & Ausgabe
		if (jahreszahl % 4 == 0) {
			if ( jahreszahl % 100 == 0) {
				if( jahreszahl % 400 == 0) {
					System.out.println("Schaltjahr!");
				}else {
					System.out.println("Kein Schaltjahr, da ganzzahlig durch 4 und 100 teilbar, aber nicht\r\n" + 
							"durch 400!");
				}
			}else {
				System.out.println("Schaltjahr!");
			}
		}else {
			System.out.println("Kein Schaltjahr weil nicht durch 4 teilbar");
		}
		
		//Alternativ
		boolean teilerVier = jahreszahl % 4 == 0;
		boolean teilerHundert = jahreszahl % 100 == 0;
		boolean teilerVierHundert = jahreszahl % 400 == 0;
		
		if (teilerVier &&  teilerHundert && teilerVierHundert) System.out.println("Schaltjahr!");
		if (teilerVier &&  teilerHundert && !teilerVierHundert) System.out.println("Kein Schaltjahr!");
		if (teilerVier &&  !teilerHundert && !teilerVierHundert) System.out.println("Schaltjahr!");
		if (!teilerVier) System.out.println("Kein Schaltjahr");
		
		
	}

}
