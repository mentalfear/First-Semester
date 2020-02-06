package WS1516;

import java.util.Scanner;

public class Aufgabe2
{
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String eingabe;
		
		System.out.println("Gebe die ISBN-Nummer ein");
		eingabe = scanner.nextLine();
		
		if(isGueltig(eingabe)) {
			System.out.println("Die ISBN ist gültig!");
		}else {
			System.out.println("Die ISBN ist nicht gültig!");
		}
	}
	
	public static boolean isGueltig(String isbn) {
		
		char[] isbnArray = isbn.toCharArray();
		
		int summe = 0;
		for (int i = 0; i < isbnArray.length; i++) {
			if (isbnArray[i] != '-') {
				summe += (isbnArray[i]*(i+1));
			}
		}
		
		if(summe%11 == 0) return true;
			else return false;
		
	}

}
