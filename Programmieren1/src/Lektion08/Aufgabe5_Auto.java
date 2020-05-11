package Lektion08;

public class Aufgabe5_Auto {

	public static void main(String[] args) 
	{

		Auto autoEins = new Auto();
		autoEins.marke = "Mercedes";
		autoEins.ccm = 300;
		
		
		Auto autoZwei = new Auto();
		autoZwei.marke = "Volkswagen";
		autoZwei.ccm = 400;
		
		Auto autoDrei = new Auto();
		autoDrei.marke = "BMW";
		autoDrei.ccm = 500;
		
		if (autoEins.ccm > autoZwei.ccm && autoEins.ccm > autoDrei.ccm)
			System.out.printf("Marke: %s, Hubraum: %d, Farbe: %s %n" ,autoEins.marke, autoEins.ccm, autoEins.farbe);
		if (autoZwei.ccm > autoEins.ccm && autoZwei.ccm > autoDrei.ccm)
			System.out.printf("Marke: %s, Hubraum: %d, Farbe: %s %n" ,autoZwei.marke, autoZwei.ccm, autoZwei.farbe);
		if (autoDrei.ccm > autoZwei.ccm && autoDrei.ccm > autoEins.ccm)
			System.out.printf("Marke: %s, Hubraum: %d, Farbe: %s %n" ,autoDrei.marke, autoDrei.ccm, autoDrei.farbe);
		
	}

}
