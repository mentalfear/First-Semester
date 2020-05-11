package Lektion09;

public class Aufgabe3_Raumbelegung
{
	
	public static void main(String[] args)
	{
		Raum r1 = new Raum("I.2.1", 50);
		Raum r2 = new Raum("I.2.15", 50);
		
		r1.isBelegt();
		r2.isBelegt();
		
		r1.setBelegungTrue();
		
		r1.isBelegt();
		r2.isBelegt();
		
		
	}

}
