package Lektion07;

import java.util.Scanner;

public class Aufgabe5_Galgenmann {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		//
		String[] auswahl = {"PROGRAMM", "BIERDURST", "AUTOBAHN", "FEINDE", "KNEIPE", "VAMPIR", "CHIHUAHUA", "JOGGINGHOSE", "TRINKFLASCHE", "WOLLSOCKEN"
				,"STRICKPULLOVER", "SONNENFINSTERNIS", "EISTEE", "SPEICHERSTAND", "ALBTRAUM", "HUNDERASSE", "FENSTERGRIFF", "BELEUCHTUNG","TETRAPACK","LICHTSCHALTER"};
		
		String wort = auswahl[(int) (Math.random()*19)];
		
		char[] wortChar = wort.toCharArray();
		char[] lsg = new char[wortChar.length];
		for (int i = 0; i < lsg.length; i++) lsg[i] = '_';
		
		for (int i = 0; i < 15; i++)
		{
			System.out.printf("%d. Versuch: %s Eingabe: ", i+1, String.valueOf(lsg));
			String eingabe = scanner.next();
			
			if (eingabe.equals(wort)) {
				System.out.println("true");
				break;
			}
			char eingabeChar = umwandlung(eingabe.charAt(0));
			
			boolean erraten = true;
			
			for(int j = 0; j < wort.length() ;j++)
			{
				if (eingabeChar == wortChar[j]) lsg[j] = eingabeChar;
				if (lsg[j] == '_') erraten = false;
			}
			
			if (erraten == true) 
			{
				System.out.printf("Glückwunsch du hast das Wort %s erraten", wort);
				break;
			}
			
			if (i == 14) System.out.printf("Verloren, das Wort wäre %s gewesen." , wort);	
		}
		
		//System.out.println(wort.valueOf(lsg));
		
	}
	
	public static char umwandlung(char x)
	{
		if(x >= 'a' && x <= 'z') x = (char) (x - 32);
		return x;
	}
	
}
