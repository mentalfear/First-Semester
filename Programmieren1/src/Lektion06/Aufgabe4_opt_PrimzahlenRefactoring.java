package Lektion6;

public class Aufgabe4_opt_PrimzahlenRefactoring {
	
	public static void main(String[] args) {
		System.out.println(primzahl(15));
	}
	
	public static boolean primzahl(int zahl)
	{
		for (int i = 2; i < zahl; i++)
		{
			int rest = zahl % i;
			if(rest == 0) {
				return false;
			}
		}
		return true;
	}
}
