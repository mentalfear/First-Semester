package Lektion9;

public class Aufgabe2_Pizza
{
	
	public static void main(String[] args) {
		int[] groesse = new int[] {25, 28, 32};
		float[] preis = new float[] {6.5f, 8.5f, 10.5f};
		
		Pizza[] pizza = new Pizza[5];
		pizza[0] = new Pizza("Ananas", groesse, preis);
		pizza[1] = new Pizza("Sucuk", groesse, preis);
		pizza[2] = new Pizza("Spaghetti", groesse, preis);
		pizza[3] = new Pizza("Pollo", groesse, preis);
		pizza[4] = new Pizza("Soinaci", groesse, preis);
		
		
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Pizza: %s, Durchmesser: %d, Preis: %.2f %n" , pizza[i].getName(), pizza[i].getDurchmesser(2), pizza[i].getPreis(2));
		}
		
		Pizzaofen ofen = new Pizzaofen();
		
		ofen.newPizza();
		
		System.out.println("PizzaCounter = " + ofen.getPizzaCounter());
		
	}

}
