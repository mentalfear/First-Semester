package Lektion9;

public class Pizza
{
	String name;
	int[] durchmesser;
	float[] preis;
	//private static int pizzaCounter;
	
	
	public Pizza(String name, int[] durchmesser, float[] preis)
	{
		
		this.name = name;
		
		if (durchmesser.length == preis.length) {
			this.durchmesser = new int[preis.length];
			this.preis = new float[preis.length];
			
			for (int i = 0; i < preis.length; i++) {
				this.durchmesser[i] = durchmesser[i];
				this.preis[i] = preis[i];
			}
		}

		//pizzaCounter++;
	}
	
	//public static int getPizzaCounter() {
	//	return pizzaCounter;
	//}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDurchmesser(int kombination) {
		return this.durchmesser[kombination];
	}
	public void setDurchmesser(int durchmesser, int kombination) {
		this.durchmesser[kombination] = durchmesser;
	}
	public float getPreis(int kombination) {
		return this.preis[kombination];
	}
	public void setPreis(float preis, int kombination) {
		this.preis[kombination] = preis;
	}

}
