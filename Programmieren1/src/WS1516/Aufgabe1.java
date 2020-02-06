package WS1516;

public class Aufgabe1
{
	
	public static void main(String[] args)
	{
		System.out.println(berechneProzent(250, 10));
	}
	
	public static float berechneProzent(int betrag, int prozent) {
		
		float anteil = (float) betrag*prozent/100;
		return anteil;
		
	}

}
