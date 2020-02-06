package Lektion03;

import java.util.Scanner;

public class Aufgabe5_Matrikelnummer {
	
	public static void main(String[] args)
	{
		// Variable
		String Matrikelnummer = "5155555";
		Scanner scanner = new Scanner(System.in);
		
		
		
		//Eingabe
		System.out.println("Gebe deine Matrikelnummer ein");
		Matrikelnummer = scanner.nextLine();
		int ersteBeidenZahlen = Integer.parseInt(Matrikelnummer.substring(0, 2));
		
		//Ausgabe
		if ( Matrikelnummer.length() == 7) {
			if (ersteBeidenZahlen == 50) System.out.println("Student ist in Wirtschaftinformatik eingeschrieben.");
			else if (ersteBeidenZahlen == 51) System.out.println("Student ist in Informatik eingeschrieben.");
			else if (ersteBeidenZahlen == 61) System.out.println("Student ist in E-Commerce eingeschrieben.");
			else System.out.println("Ersten beiden Ziffern sind nicht korrekt");
		}else {
			System.out.println("Matrikelnummer zu lang oder zu kurz");
		}
		
		//Überprüfung fehlt das es nur zahlen sind
		
		
		
		
	}

}
