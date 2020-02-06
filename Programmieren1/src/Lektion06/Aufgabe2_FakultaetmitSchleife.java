package Lektion6;

import java.util.Scanner;

public class Aufgabe2_FakultaetmitSchleife {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gib die Zahl ein: ");
		int n = scanner.nextInt();
		System.out.println(fak(n));
	}
	
	public static long fak(long n)
	{
		if (n == 0) return 1;
		return n * fak(n-1);
		
	}

}
