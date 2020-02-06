package Lektion03;

import java.util.Scanner;

public class Aufgabe2_Pizzarechner {

	public static void main(String[] args)
	{
		//Variablen
		Scanner scanner = new Scanner(System.in);
		float pizzaEinsDurchmesser = 26;
		float pizzaZweiDurchmesser = 28;
		float pizzaEinsPreis = 8.50f;
		float pizzaZweiPreis = 9.50f;
		float pizzaEinsVerhaeltnis, pizzaZweiVerhaeltnis;
		float pizzaFlaeche;
		float pi = 3.1415f;
		
		//Eingabe
		
		System.out.println("Durchmesser der 1. Pizza in cm:");
		pizzaEinsDurchmesser = scanner.nextInt();
		System.out.println("Preis der 1. Pizza");
		pizzaEinsPreis = scanner.nextFloat();
		
		System.out.println("Durchmesser der 2. Pizza in cm:");
		pizzaZweiDurchmesser = scanner.nextInt();
		System.out.println("Preis der 2. Pizza");
		pizzaZweiPreis = scanner.nextFloat();
		
		//Berechnung
		pizzaFlaeche = pi * pizzaEinsDurchmesser * pizzaEinsDurchmesser;
		pizzaEinsVerhaeltnis = pizzaFlaeche / pizzaEinsPreis;
		pizzaFlaeche = pi * pizzaZweiDurchmesser * pizzaZweiDurchmesser;
		pizzaZweiVerhaeltnis = pizzaFlaeche / pizzaZweiPreis;
		
		//Ausgabe
		System.out.printf("Verhältnis Pizza 1: %.2f cm^2/€ \nVerhältnis Pizza 2: %.2f cm^2/€ \n", pizzaEinsVerhaeltnis , pizzaZweiVerhaeltnis);
		if (pizzaEinsVerhaeltnis > pizzaZweiVerhaeltnis) System.out.println("Pizza 1 ist billiger!");
		else if(pizzaEinsVerhaeltnis < pizzaZweiVerhaeltnis) System.out.println("Pizza 2 ist billiger");
		else if(pizzaEinsVerhaeltnis == pizzaZweiVerhaeltnis) System.out.println("Gleich teuer!");
		
	}
	
}
