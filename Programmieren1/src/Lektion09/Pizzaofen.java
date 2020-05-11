package Lektion09;

public class Pizzaofen
{
	private int PizzaCounter;
	
	public Pizza newPizza() {
		PizzaCounter++;
		
		Pizza pizza = new Pizza("Salami", new int[] {30}, new float[] {12f});
		return pizza;
	}
	
	public int getPizzaCounter() {
		return PizzaCounter;
	}
	
	

}
