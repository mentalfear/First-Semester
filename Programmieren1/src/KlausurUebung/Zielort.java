package KlausurUebung;

public class Zielort
{
	String name;
	int distanz;
	Zielort next;
	
	public Zielort(String name, int distanz) {
		this.name = name;
		this.distanz = distanz;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDistanz(int distanz) {
		this.distanz = distanz;
	}
	
	public void setNext(Zielort next) {
		this.next = next;
	}
	
	public String getName() {
		return name;
	}
	
	public int getDistanz() {
		return distanz;
	}
	
	public Zielort getNext() {
		return next;
	}
	
	@Override
	public String toString() {
		return "Ortsname: " + name + " Distanz: " + distanz + " km"; 
	}

}
