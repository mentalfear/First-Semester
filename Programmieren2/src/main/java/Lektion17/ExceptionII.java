package Lektion17;

import java.util.Scanner;

public class ExceptionII {
	
	public static void main(String[] args) {
		
		int zahl;
		do {
			
			try {
				zahl = readNumber();
				break;
			}catch (NumberFormatException e) {
				System.out.println("Gib eine ZAHL ein! " + "Fehler: "+ e);
			}
			
		}while(true);
		
		System.out.println("Zahl: " + zahl);
	}
	
	public static int readNumber() throws NumberFormatException{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		return Integer.valueOf(s);

	}

}
