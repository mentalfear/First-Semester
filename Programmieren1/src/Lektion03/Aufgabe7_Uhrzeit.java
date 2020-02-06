package Lektion03;

import java.util.Scanner;

public class Aufgabe7_Uhrzeit {
	
	public static void main(String[] args) {
		
		//Variable
		int stunden, minuten, sekunden;
		Scanner scanner = new Scanner(System.in);
		
		//Eingabe
		do {
			System.out.println("Gebe Stunden ein: ");
			stunden = scanner.nextInt();
			if( !(stunden < 24 && stunden >= 0)) System.out.println("Fehlerhafte Eingabe: Stunde kann nur von 0 bis 23 geben") ;
			
		} while (!(stunden < 24 && stunden >= 0));
		
		do {
			System.out.println("Gebe Minuten ein: ");
			minuten = scanner.nextInt();
			if( !(minuten < 60 && minuten >= 0)) System.out.println("Fehlerhafte Eingabe bei Minuten") ;
		} while (!(minuten < 60 && minuten >= 0));
		
		do {
			System.out.println("Gebe Sekunden ein: ");
			sekunden = scanner.nextInt();
			if( !(sekunden < 60 && sekunden >= 0)) System.out.println("Fehlerhafte Eingabe bei Sekunden") ;
		} while (!(sekunden < 60 && sekunden >= 0));
		
		System.out.printf("Zeit: %02d:%02d:%02d \n" , stunden , minuten , sekunden );
		
		
		/*
		//Alt und unsauber
		System.out.println("Gebe Stunden ein: ");
		stunden = scanner.nextInt();
		if( !(stunden < 24 && stunden >= 0)) System.out.println("Fehlerhafte Eingabe: Stunde kann nur von 0 bis 23 geben") ;
		
		System.out.println("Gebe Minuten ein: ");
		minuten = scanner.nextInt();
		if( !(minuten < 60 && minuten >= 0)) System.out.println("Fehlerhafte Eingabe bei Minuten") ;
		
		System.out.println("Gebe Sekunden ein: ");
		sekunden = scanner.nextInt();
		if( !(sekunden < 60 && minuten >= 0)) System.out.println("Fehlerhafte Eingabe bei Sekunden") ;
		
		System.out.printf("Zeit: %02d:%02d:%02d " , stunden , minuten , sekunden );
		*/
		
	}

}
