package SS14;

public class Aufgabe2
{

	public static void main(String[] args)
	{
		Liste l = new Liste();
	
		l.insert(new Knoten("Aaronson"));
		l.insert(new Knoten("Cool"));
		l.insert(new Knoten("Garret"));
		l.insert(new Knoten("Zylla"));
		
		l.ausgabe();
		
		l.delete(3);
		
		l.ausgabe();
		
	}

}
