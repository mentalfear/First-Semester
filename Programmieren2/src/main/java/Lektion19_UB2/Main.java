package Lektion19_UB2;

import Lektion15.A2_Student;

public class Main {

	public static void main(String[] args) {
		
		StackAttribut sA = new StackAttribut();
		
		//Objekte zum hinzufügen
		A2_Student st = new A2_Student();
		String text = "Hallo Welt";
		int zahl = 200;
		
		//StackAttribut
		sA.push(st);
		sA.push(text);
		sA.push(zahl);
		System.out.println(sA); // was gerade alles drin
		Object eA = sA.pop(); // löschen und rückgabe des Objektes
		System.out.println(eA); // Ausgabe des Objektes, das zurückgegeben wurde
		System.out.println(sA); // Veränderte Liste nach pop()
		
		
		//GenericStack
		GenericStack<String> s = new GenericStack<>();
		s.push("Hallo");
		s.push("Welt");
		System.out.println(s.pop());
		System.out.println(s.pop());
		
	}
	
}
