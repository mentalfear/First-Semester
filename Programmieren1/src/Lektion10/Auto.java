package Lektion10;

public class Auto {
	
	String marke;
	int ccm;
	String farbe;
	public static int produzierteAutos = 0;
	
	public Auto(String marke, int ccm, String farbe) {
	
		this.marke = marke;
		if (ccm > 0) this.ccm = ccm;
		else this.ccm = 1600;
		this.farbe = farbe; 
		produzierteAutos++;
		System.out.printf("Das Auto %s wurde produzierte. Bis jetzt wurden %d Autos produziert.%n", marke, produzierteAutos);
		
	}
	
	
	public void setHubraum (int ccm) {
		if (ccm > 0) this.ccm = ccm;
	}
	
	public int getHubraum () {
		return ccm;
	}
	

}
