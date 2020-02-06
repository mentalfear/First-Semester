package Lektion11;

import java.util.Scanner;

public class Aufgabe5_ErrorMonat
{
	
	public static void main(String[] args) {
	
		String monat;
		int tage = 0;
		boolean nop = true;
		Scanner scanner = new Scanner(System.in);
		do {
			
			try {
				System.out.println("Gebe den Monat ein: ");
				monat = scanner.nextLine();
				tage = tageImMonat(monat);
				nop = false;
			}catch (RuntimeException e) {
				System.out.println("Fehler: faler Monat");
				//scanner.nextLine();
				nop = true;
			}
			
			
			
		}while(nop);
		
		System.out.println(tage);
		
	}
	
	public static int tageImMonat(String monat)
	{
	int tage;
	switch(monat) {
	case "Februar":
	tage = 28;
	break;
	case "April":
	case "Juni":
	case "September":
	case "November":
	tage = 30;
	break;
	case "Januar":
	case "März":
	case "Mai":
	case "Juli":
	case "August":
	case "Oktober":
	case "Dezember":
	tage = 31;
	break;
	default:
	throw new RuntimeException("falscher Monatsname");
	}
	return tage;
	}

}
