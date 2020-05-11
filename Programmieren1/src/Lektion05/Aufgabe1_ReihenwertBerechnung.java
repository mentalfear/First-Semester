package Lektion05;

public class Aufgabe1_ReihenwertBerechnung {
	
	public static void main(String[] args)
	{
		double summand;
		double erg = 0;
		double zaehler = 1; 
		
		do
		{
			summand = (6 / Math.pow(zaehler, 2));
			erg = erg + summand;
			zaehler++;
			System.out.println("Ergebnis ist " + erg);
			
		}
		while(summand > Math.pow(10, -5));
		
		
	}

}
