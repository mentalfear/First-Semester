package Lektion11;

public class Aufgabe3_uebeladeneBetragsfunktion
{
	
	public static void main(String[] args) {
		
		float zahl = -1.9f;
		System.out.println(betrag(zahl));
		
	}
	
	public static int betrag(int x) {
		if(x < 0) return -x;
		return x;
	}
	
	public static double betrag(double x) {
		if(x<0) return -x;
		return x;
	}
	
	public static float betrag(float x) {
		if(x<0) return -x;
		return x;
	}

}
