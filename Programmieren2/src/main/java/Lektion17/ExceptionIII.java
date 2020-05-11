package Lektion17;

import java.util.Scanner;

public class ExceptionIII {
	
	public static void main(String[] args) throws NumberFormatException {
		System.out.println(readNumber());
	}
	
	public static int readNumber() throws NumberFormatException {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		return Integer.valueOf(s);
		
		
	}

}
