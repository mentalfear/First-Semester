package KlausurUebung;

public class Aufgabe3
{
	
	public static void main(String[] args) {
		
		Zielort wue = new Zielort("W�rzburg", 0);
		Zielort kit = new Zielort("Kitzingen", 19);
		Zielort neu = new Zielort("Neustadt", 42);
		Zielort nue = new Zielort("N�rnberg", 49);
		
		Fahrstrecke fahrt = new Fahrstrecke();
		fahrt.einfuege(wue);
		fahrt.einfuege(kit);
		fahrt.einfuege(neu);
		fahrt.einfuege(nue);
		
		
		System.out.println("Die gesamte Fahrstrecke betr�gt von " + fahrt.root.getName() + " nach "
				+ fahrt.Ankunftsort().getName() + " : " + fahrt.gesamtStrecke() +  " km");
		
		
		
	}

}
