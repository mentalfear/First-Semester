package Lektion07;

import java.util.Scanner;

public class Aufgabe1_SinusBerechnung {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gebe die zahl ein für die der Sinus berechnet werden soll: ");
		double wert = scanner.nextDouble();
		System.out.println("Ergebnis: " + sin(wert));
		scanner.close();
	}
	
	public static double sin(double x)
	{
		double zaehler = 1.0;
		double nenner = 1.0;
		double faktor = 1.0;
		double summe = 0.0;
		double summand = 1.0;
		
		for (int k = 0; k < 100; k++)
		{
			zaehler = quadrat(x,2*k+1);
			nenner = fak(2*k+1);
			if (k%2 == 0 ) faktor = 1;
			else faktor = -1;
			summand = zaehler/nenner * faktor;
			summe = summe + summand;
			
		}
		return summe;
	}
	
	public static double quadrat(double basis, int expo)
	{
		if ( expo == 0) return 1;
		return basis * quadrat(basis, expo-1);
	}
	
	public static double fak(int n)
	{
		if (n == 0) return 1;
		return n * fak(n-1);
	}
	
}
