package KlausurUebung;

import java.util.Scanner;

public class Aufgabe2
{

	public static void main(String[] args)
	{
		SpaceInvaders si = new SpaceInvaders();
		
		Scanner scanner = new Scanner(System.in);
		
		String eingabe = "";
		
		do {
			System.out.println("Gebe den Befehl ein:");
			eingabe = scanner.nextLine();
			
			si.bewege(eingabe);
			
		}while(!eingabe.equals("x"));
		
	}
	
	
}
