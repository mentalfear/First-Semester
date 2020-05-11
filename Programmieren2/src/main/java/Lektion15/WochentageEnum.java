package Lektion15;

import java.util.Scanner;

public class WochentageEnum {
	
	public static void main(String[] args) {
		String eingabe = new Scanner(System.in).nextLine();
		
		Wochentag w = Wochentag.valueOf(eingabe);
		System.out.println(w);
		
		
	}

}
