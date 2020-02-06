package Lektion6;

public class Aufgabe1_Runden {

	public static void main(String[] args)
	{
		System.out.println(runden(2.2));
		System.out.println(rundenAufStelle(2.5678,2));
		System.out.println(quadrat(10,2));
		
	}
	
	public static double runden(double zahl)
	{
		
		if (zahl - (int) zahl >= 0.5) zahl++; 
		return (int) zahl;
	}
	
	public static double rundenAufStelle(double zahl, int kommastelle)
	{	
		zahl = runden(zahl * quadrat(10,kommastelle)) / quadrat(10,kommastelle);
		
		return zahl;
	}
	
	public static int quadrat(int b, int e) {
		if (e == 0) return 1;
		return b * quadrat(b,e-1);
	}
	
}
