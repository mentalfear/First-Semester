package Lektion03;

public class Aufgabe4_Wuerfelwurf {
	
	public static void main(String[] args)
	{
		//Variable
		int gew�rfelteZahl;
		double randomZahl = Math.random();
		
		//Berechnung
		gew�rfelteZahl = (int) (6 * randomZahl + 1);
		
		//Ausgabe
		if (gew�rfelteZahl == 1) System.out.println("Eins gew�rfelt");
		if (gew�rfelteZahl == 2) System.out.println("Zwei gew�rfelt");
		if (gew�rfelteZahl == 3) System.out.println("Drei gew�rfelt");
		if (gew�rfelteZahl == 4) System.out.println("Vier gew�rfelt");
		if (gew�rfelteZahl == 5) System.out.println("F�nf gew�rfelt");
		if (gew�rfelteZahl == 6) System.out.println("Sechs gew�rfelt");
		
	}

}
