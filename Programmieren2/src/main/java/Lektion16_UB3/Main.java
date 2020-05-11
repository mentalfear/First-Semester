package Lektion16_UB3;

import Lektion15.A2_Student;

public class Main {

	public static void main(String[] args) {
		
		StackVererbung sV = new StackVererbung();
		StackAttribut sA = new StackAttribut();
		
		//Objekte zum hinzufügen
		A2_Student st = new A2_Student();
		String text = "Hallo Welt";
		int zahl = 200;
		
		
		//StackVererbungTest
		sV.push(st);
		sV.push(text);
		sV.push(zahl);
		System.out.println(sV); // was gerade alles drin
		Object eV = sV.pop(); // löschen und rückgabe des Objektes
		System.out.println(eV); // Ausgabe des Objektes, das zurückgegeben wurde
		System.out.println(sV); // Veränderte Liste nach pop()
		
		//StackAttribut
		sA.push(st);
		sA.push(text);
		sA.push(zahl);
		System.out.println(sA); // was gerade alles drin
		Object eA = sA.pop(); // löschen und rückgabe des Objektes
		System.out.println(eA); // Ausgabe des Objektes, das zurückgegeben wurde
		System.out.println(sA); // Veränderte Liste nach pop()
		
		
		
	}
	
}
