package Lektion02;

public class Aufgabe2_pqFormel {
	
	public static void main(String[] args) {
		float p = 1;
		float q = -4;
		double wurzelTeil = Math.pow((p/2), 2) - q;
		System.out.println(wurzelTeil);
		double x1;
		double x2;
		
		if (wurzelTeil >= 0) 
		{
			x1 = -p/2 + Math.sqrt(wurzelTeil);
			System.out.println("erste L�sung = " + x1);
			
			x2 = -p/2 - Math.sqrt(wurzelTeil);
			System.out.println("zweite L�sung = " + x2);
			
		}else {
			System.out.println("error (unter der Wurzel steht etwas negatives");
		}
	}

}
