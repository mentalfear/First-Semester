package Lektion05;

public class Aufgabe4_Quadratwurzelberechnung {
	
	public static void main(String[] args)
	{
		double wurzel = 36;
		double y0 = 1;
		double y1;
		int faktor = 1;
		
		for ( int i = 0; i <= 10000; i++) {
		
			y1 = ((wurzel / y0) + y0) /2;
			y0 = y1;
			if (faktor == i) {
				System.out.println(Math.abs(Math.sqrt(wurzel) - y0));
				faktor = faktor*10;
			}
			//System.out.println(y0);
		}
		
	}

}
