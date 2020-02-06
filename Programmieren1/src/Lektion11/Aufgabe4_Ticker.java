package Lektion11;

public class Aufgabe4_Ticker
{

	public static void main(String[] args) {
		String nachricht = "Wetter: Schnee mit Hagel";
		
		char[] cNachricht = nachricht.toCharArray();
		
		Ticker tNachricht = new Ticker(50);
		
		tNachricht.setNachricht(cNachricht);
		tNachricht.rotateNachricht(6);
		
		System.out.println(tNachricht.getNachricht());
	}
	
}
