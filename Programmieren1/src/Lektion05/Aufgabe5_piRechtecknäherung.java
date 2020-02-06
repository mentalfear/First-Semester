package Lektion5;

import java.util.Scanner;

public class Aufgabe5_piRechtecknäherung {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
	
		//variable
		double anzahlRechtecke = 2.0;
		int coun = 1;
		int r = 1;
		
		
		//eingabe
		System.out.println("Gebe die Anzahl der Rechtecke an: ");
		anzahlRechtecke = (double)scanner.nextInt();
		
		double pi = 1/anzahlRechtecke;
		
		//Alternativ
		while (coun < anzahlRechtecke) {
			pi = pi + r/anzahlRechtecke * Math.sqrt((r*r) - ((coun/anzahlRechtecke)*(coun/anzahlRechtecke)));
			coun = coun + 1;
		}
		
		
		pi = pi*4;
		
		System.out.println(pi);
	}

}