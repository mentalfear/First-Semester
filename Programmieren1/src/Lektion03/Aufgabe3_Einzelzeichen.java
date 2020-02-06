package Lektion03;

import java.util.Scanner;

public class Aufgabe3_Einzelzeichen {

	public static void main(String[] args)
	{
		//Variable
		Scanner scanner = new Scanner(System.in);
		int eingabeAscii;
		
		//Eingabe
		System.out.println("Eingabe des Einzelzeichens: ");
		String line = scanner.nextLine(); 
		
		//Umwandlung
		eingabeAscii = (int) line.charAt(0);
		
		//Ausgabe
		if (eingabeAscii <= 70 && eingabeAscii >= 65 || eingabeAscii <= 102 && eingabeAscii >= 97 || eingabeAscii <= 57 && eingabeAscii >= 48)
			System.out.println("Hexadezimalzahl");
		if ( eingabeAscii <= 90 && eingabeAscii >= 65 ) System.out.println("Groﬂbuchstaben");
		if ( eingabeAscii == 48 || eingabeAscii == 49 ) System.out.println("Bin‰rzahl");
		if ( eingabeAscii <= 55 && eingabeAscii >= 48 ) System.out.println("Oktale Zahl");
		
		
	}
	
}
