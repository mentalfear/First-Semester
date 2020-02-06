package Lektion6;

public class Aufgabe6_opt_Spruenge {
	
	public static int zaehler = 0;
	
	public static void main(String[] args)
	{
		System.out.println(springeInMehrerenMetern(5,2,3));
	}
	
	public static int springeInMehrerenMetern(int sum, int a, int b)
	{
		berechnung(sum, a, b ,0);
		return zaehler;
	}

	public static void berechnung(int sum, int a, int b, int erg) 
	{
		if(erg == sum) zaehler++;
		if(erg >= sum) return;
		berechnung(sum, a, b, erg+a);
		berechnung(sum, a, b, erg+b);
		return;
	}
	
}
