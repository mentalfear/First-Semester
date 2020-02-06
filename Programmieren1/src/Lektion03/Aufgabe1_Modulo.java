package Lektion03;

import java.util.Scanner;

public class Aufgabe1_Modulo {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int teiler = 7;
		int eingabe, rest;
		
		//Eingabe
		System.out.println("Gibe eine Zahl ein: ");
		eingabe = scanner.nextInt();
		
		//Berechnung
		rest = eingabe % teiler;
		
		//Ausgabe
		if (rest == 0) System.out.println("Die Zahl ist durch 7 ganzzahlig teilbar.");
		else System.out.println("Ist nicht ganzzahlig teilbar!");
		
		scanner.close(); //Normalerweise nicht verwendet, da nur einmal geschlossen werden kann im gesamten Programm
		
	}
	
}
