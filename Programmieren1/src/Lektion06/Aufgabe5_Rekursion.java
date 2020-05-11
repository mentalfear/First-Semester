package Lektion06;

import java.util.Scanner;

public class Aufgabe5_Rekursion {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gebe die Basis an: ");
		int basis = scanner.nextInt();
		System.out.println("Gebe den Exponent an: ");
		int exp = scanner.nextInt();
		System.out.println("Das Ergebnis ist: " + exponent(basis,exp));
	}
	
	public static int exponent(int b, int e)
	{
		if (e == 0) return 1;
		return b * exponent(b, e-1);
	}
}
