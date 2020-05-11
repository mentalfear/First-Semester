package Lektion14;

public class A1_Kugelvolumen {

	public static double berechneKugelvolumen(double radius) {
		if(radius < 0) throw new RuntimeException("Ungültiger Radius!");
		return (double) 4 / 3 * Math.PI * radius * radius * radius;
	}

}
