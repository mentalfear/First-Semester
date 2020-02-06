package Lektion03;

public class Aufgabe4_Wuerfelwurf {
	
	public static void main(String[] args)
	{
		//Variable
		int gewürfelteZahl;
		double randomZahl = Math.random();
		
		//Berechnung
		gewürfelteZahl = (int) (6 * randomZahl + 1);
		
		//Ausgabe
		if (gewürfelteZahl == 1) System.out.println("Eins gewürfelt");
		if (gewürfelteZahl == 2) System.out.println("Zwei gewürfelt");
		if (gewürfelteZahl == 3) System.out.println("Drei gewürfelt");
		if (gewürfelteZahl == 4) System.out.println("Vier gewürfelt");
		if (gewürfelteZahl == 5) System.out.println("Fünf gewürfelt");
		if (gewürfelteZahl == 6) System.out.println("Sechs gewürfelt");
		
	}

}
