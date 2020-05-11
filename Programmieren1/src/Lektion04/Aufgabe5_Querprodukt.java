package Lektion04;

import java.util.Scanner;

public class Aufgabe5_Querprodukt {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int eingabe = -1;
		
		//eingabe
		while(eingabe < 1 || eingabe > 1000000) {
			System.out.printf("Geben Sie bitte eine Zahl ein: ");
			eingabe = scanner.nextInt();
			if(eingabe < 1 || eingabe > 1000000) System.out.println("FEHLER - Zahl ist zu klein");
			//if(eingabe > 1000000) System.out.println("FEHLER - Zahl ist zu groß");
			
		}
		
		int quersumme = 1;
		int zahl = eingabe;
		for (; eingabe > 0; eingabe /= 10) {
			int rest = eingabe%10;
			quersumme = quersumme * rest;
		}
		System.out.printf("Das Querprodukt der Zahl %d betraegt %d ", zahl , quersumme);
	}
}
