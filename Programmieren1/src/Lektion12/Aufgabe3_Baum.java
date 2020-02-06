package Lektion12;

public class Aufgabe3_Baum
{
	
	public static void main(String[] args) {
		
		Baum baum = new Baum();
		Knoten qualle = new Knoten("Qualle", "Bed. Qualle"); 
		baum.insert(new Knoten("Baum", "Bed. Baum"));
		baum.insert(new Knoten("Haus", "Bed. Haus"));
		baum.insert(new Knoten("Garten", "Bed. Garten"));
		baum.insert(new Knoten("Zed", "Bed. Zed"));
		baum.insert(qualle);
		
		baum.print();
		//System.out.println(baum.search("Zed"));
		baum.delete(qualle);
		
		baum.print();
		
		
	}

}
