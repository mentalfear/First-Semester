package Lektion02;

public class Aufgabe1_KreisUndKugel {
	
	public static void main(String[] args)
	{
		final float pi = 3.1415f;
		float radius = 10.2f;
		
		float kreisflaeche = (float)(pi * Math.pow(radius, 2));		
		double kreisumfang = 2 * pi * radius;
		double kugelvolumen = 4.0/3.0 * pi * Math.pow(radius, 3);
		
		System.out.println("Die Kreisfläche entspricht " + kreisflaeche);
		System.out.printf("Kreisfläche entspricht %.2f %n", kreisflaeche);
		
		System.out.println("Der Kreisumfang entspricht " + kreisumfang);
		System.out.println("Das Kugelvolumen beträgt " + kugelvolumen);
	}

}
