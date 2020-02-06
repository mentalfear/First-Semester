package Lektion5;

import java.util.Scanner;

public class Aufgabe2_Potenz {
	
	public static void main(String[] args)
	{
		//variable
		Scanner scanner = new Scanner(System.in);
		double b, erg = 1;
		int n;

		//eingabe
		System.out.println("Gebe bitte die Basis b ein: ");
		b = scanner.nextDouble();
		System.out.println("Gebe bitte den Exponent n ein: ");
		n = scanner.nextInt();
		
		//Berechnung und Ausgabe
		if (n > 0) for (int i = 1; i <= n; i++)	erg = erg * b;		
		if(n < 0) for (int i = 1; i <= -n; i++)	erg = erg / b;
		
		System.out.println("Ergebnis: " + erg);
		
		
	}

}
