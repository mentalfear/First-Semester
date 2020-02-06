package Lektion10;

public class Aufgabe3_Autofabrik
{

	public static void main(String[] args) {
		
		Auto a1 = new Auto("asd", 400 , "lila");
		Auto a2 = new Auto("asd", 400 , "lila");
		Auto a3 = new Auto("asd", 400 , "lila");
		
		Autofabrik.produziere("ddd", 400, "Blau");
		Autofabrik.produziere("ddd", 400, "Blau");
		Autofabrik.produziere("ddd", 400, "Blau");
		Autofabrik.produziere("ddd", 400, "Blau");
		
		
	}
	
}
