package Lektion12;

public class Aufgabe2_Doppeltverkettete_Liste
{
	
	public static void main(String[] args) {
	
		Liste list = new Liste();
		list.setNewKnoten("Gross", 27);
		list.setNewKnoten("Braun", 25);
		list.setNewKnoten("Maier", 29);
		list.setNewKnoten("Zed", 30);
		
		list.listeDurchlaufen();
		
		System.out.println("Suche \"Gross\": " + list.searchPerson("Gross").getNachname());
		
		
	}

}
