package Lektion16;

public class Angestellter {

	String name;
	String vorname;
	int gehalt;

	public Angestellter(String name, String vorname, int gehalt) {
		this.name = name;
		this.vorname = vorname;
		setGehalt(gehalt);
	}

	public void setGehalt(int gehalt) {
		if (gehalt > 0)
			this.gehalt = gehalt;
	}

}
