package Lektion7;

import java.util.Scanner;

public class Aufgabe2_Mittelwert {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int eintraege;
		
		//Anlegen der Liste (Array)
		do {
			System.out.printf("Gebe die Anzahl der Einträge an: ");
			eintraege = scanner.nextInt();
			if(eintraege <= 0) System.out.print("Anzahl Einträge muss größer als 0 sein!");
		}while(eintraege <= 0);
		
		double[] werte = new double[eintraege];
		
		
		//Abfrage der einzelnen Werte
		for(int i = 0; i < eintraege; i++)
		{
			System.out.printf("Gebe den %d. Wert an: ", i+1);
			werte[i] = scanner.nextDouble();
		}
		
		//Berechnung des Mittelwerts, größte und kleinste Wert
		double[] erg = mittelwert(werte); 
		System.out.printf("Der Mittelwert beträgt: %f%n", erg[0]);
		System.out.printf("Der größte Wert beträgt: %f%n", erg[1]);
		System.out.printf("Der kleinste Wert beträgt: %f%n", erg[2]);
		
		//Berechnung der Streuung
		double streuung = streuung(werte, erg[0]);
		System.out.printf("Die Streuung beträgt: %f%n", streuung);
		
		scanner.close();
	}
	
	public static double streuung(double[] werte, double mittelwert)
	{
		int eintraege = werte.length;
		double summe = 0;
		double summand = 1.0;
		
		for(int i = 0; i < eintraege; i++)
		{
			summand = Math.pow(werte[i] - mittelwert, 2) / eintraege;
			summe = summe + summand;
		}
		
		return Math.sqrt(summe);		
	}
	
	public static double[] mittelwert(double[] werte)
	{
		double[] erg = new double[3];
		erg[0] = 0; //Mittelwert
		erg[1] = werte[0]; // größterWert
		erg[2] = werte[0]; // kleinsterWert
		int eintraege = werte.length;
		
		for(int i = 0; i < eintraege;i++ )
		{
			erg[0] = erg[0] + werte[i] / eintraege;
			if(erg[1] <= werte[i]) erg[1] = werte[i];
			if(erg[2] >= werte[i]) erg[2] = werte[i];
		}

		return erg;
	}
	
}
