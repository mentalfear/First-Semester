package Lektion4;

import java.util.Scanner;

public class Aufgabe2_FreierFall {
	
	public static void main(String[] args)
	{
		//Variable
		float g = 9.80655f;
		float erg;
		Scanner scanner = new Scanner(System.in);
		
		//Eingabe
		System.out.println("Bitte Falldauer in Sekunden eingeben: ");
		int sekunden = scanner.nextInt();
		
		//Ausgabe
		for (int i = 1 ; i <= sekunden; i+=5)
		{
			erg = 0.5f * g * i * i;
			System.out.printf("Zeit %d Sekunden: Zurückgelegte Strecke: %f m %n",i, erg);
		}
		
	}

}
