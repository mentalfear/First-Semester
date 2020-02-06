package Lektion03;

import java.io.*;
import java.util.Scanner;

public class Aufgabe8_Wahrheitstabelle {
	
	public static void main(String[] args) throws IOException
	{
		//Old
		/*
		System.out.println("Gebe das erste Einzelzeichen ein");
		char firstChar = (char) System.in.read();
		System.out.println("Gebe das zweite Einzelzeichen ein");
		char secondChar = (char) System.in.read();
		*/
		
		//variable
		char firstChar, secondChar;
		String eingabe;
		int ausgabeInt = 0;
		
		
		//Eingabe
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gebe das erste Einzelzeichen ein");
		eingabe =  scanner.nextLine();
		firstChar = eingabe.charAt(0);
		System.out.println("Gebe das zweite Einzelzeichen ein");
		eingabe = scanner.nextLine();
		secondChar = eingabe.charAt(0);
		
		//Berechnung
		if (firstChar == 'f' && secondChar == 'f') ausgabeInt = 0;
		else if (firstChar == 'f' && secondChar == 't') ausgabeInt = 1;
		else if (firstChar == 't' && secondChar == 'f') ausgabeInt = 2;
		else if (firstChar == 't' && secondChar == 't') ausgabeInt = 3;
		 
		//Ausgabe
		System.out.println("Das Ergebnis ist " + ausgabeInt);
		
	}

}
