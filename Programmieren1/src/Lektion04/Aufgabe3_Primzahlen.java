package Lektion04;

import java.util.Scanner;

public class Aufgabe3_Primzahlen {
	
	public static void main(String[] args)
	{
		//variable
		//int zahl = 51;
		boolean primzahl = true;
		Scanner scanner = new Scanner(System.in);
		
		//Eingabe
		System.out.println("Bitte zu untersuchende Zahl eingeben: ");
		int zahl = scanner.nextInt();
		
		//a) Teil
		//Berechnung
		for (int i = 2; i < zahl; i++)
		{
			int rest = zahl % i;
			if(rest == 0) {
				primzahl = false;
			}
		}
		
		//Ausgabe
		if(primzahl == true) {
			System.out.println("Untersuchte Zahl ist eine Primzahl!");
		}else {
			System.out.println("Untersuchte Zahl ist keine Primzahl!");
		}
		
		
		//b) Teil
		//Berechnung
		for (int i = 1; i <= zahl; i++) {
			
			primzahl = true;
			
			for (int f = 2; f < i; f++)
			{
				int rest = i % f;
				if(rest == 0) {
					primzahl = false;
				}

			}
			
			//Ausgabe
			if(primzahl == true) {
				System.out.printf("%d ist eine Primzahl! %n" , i);
			}else {
				System.out.printf("%d ist keine Primzahl! %n" , i);
			}
		}
	}
}
