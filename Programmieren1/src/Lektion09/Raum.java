package Lektion9;

public class Raum
{
	String Raumname;
	int anzahlStudenten;
	boolean belegt = false;
	
	public Raum(String Raumname, int anzahlStudenten) {
		this.Raumname = Raumname;
		this.anzahlStudenten = anzahlStudenten;
	}
	
	public void isBelegt() {
		if(belegt) System.out.println("Der Raum ist belegt");
		else System.out.println("Der Raum ist frei");
	}
	
	public void setBelegungTrue() {
		this.belegt = true;
	}
	
	public void setBelegungFalse() {
		this.belegt = false;
	}

}
