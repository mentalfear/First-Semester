package Lektion10;

public class Autofabrik
{
	
	public static int produzierteAutos;
	
	public static  void produziere(String marke, int ccm, String farbe) {
		
		Auto a1 = new Auto(marke, ccm, farbe);
		produzierteAutos++;
		
		System.out.printf("Das Auto %s wurde produzierte. Bis jetzt wurden %d Autos produziert in der Fabrik.%n", marke, produzierteAutos);
	}

}
