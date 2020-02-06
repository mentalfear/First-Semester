package Lektion12;

public class Personenknoten
{

	String nachname;
	int alter;
	Personenknoten next;
	Personenknoten prev;
	
	public Personenknoten(String nachname, int alter) {
		this.nachname = nachname;
		this.alter = alter;
	}
	
	public int getAlter() {
		return alter;
	}
	
	public String getNachname() {
		return nachname;
	}
	
}
