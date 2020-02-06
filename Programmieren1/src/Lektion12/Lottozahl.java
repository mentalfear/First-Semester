package Lektion12;

public class Lottozahl
{

	int zahl;
	Lottozahl next;
	
	public Lottozahl(int zahl) {
		this.zahl = zahl;
		this.next = null;
	}
	
	public void setZahl(int zahl) {
		this.zahl = zahl;
	}
	
	public void setNext(Lottozahl next) {
		this.next = next;
	}
	

	
	public int getZahl() {
		return zahl;
	}
	
	public Lottozahl getNextLottozahl() {
		return next;
	}

	
}
