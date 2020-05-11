package Lektion15;

public class A1_Angestellter {
	
	private static final float GRUNDGEHALT = 1000.0f; 
	
	private String vorname;
	private String nachname;
	private int id;
	private float gehaltsfaktor = 1;
	private float gehalt;


	public A1_Angestellter(String vorname, String nachname, int id) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.id = id;
	}

	public static float getGrundgehalt() {
		return GRUNDGEHALT;
	}


	public String getVorname() {
		return vorname;
	}


	public void setVorname(String vorname) {
		this.vorname = vorname;
	}


	public String getNachname() {
		return nachname;
	}


	public void setNachname(String nachname) {
		this.nachname = nachname;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public float getGehaltsfaktor() {
		return gehaltsfaktor;
	}


	public void setGehaltsfaktor(float gehaltsfaktor) {
		this.gehaltsfaktor = gehaltsfaktor;
	}
	
	public float getGehalt() {
		gehalt = gehaltsfaktor * GRUNDGEHALT;
		return gehalt;
	}

	
	
	
	

}
