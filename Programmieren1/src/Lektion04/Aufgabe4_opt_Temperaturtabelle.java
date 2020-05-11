package Lektion04;

public class Aufgabe4_opt_Temperaturtabelle {
	
	public static void main(String[] args) {
		
		float celsius = 30.0f;
		
		System.out.printf("Fahreneinheit \tCelsius \n");
		
		for(float fahrenheit = 0; fahrenheit <= 300; fahrenheit++) {
			celsius = 5.0f/9*(fahrenheit -32);
			System.out.printf("%.2f \t\t%.2f \n", fahrenheit, celsius);
		}
		
		
	}

}
