package Lektion10;

public class Raum
{
	String Raumname;
	int anzahlStudenten;
	boolean belegt = false;
	int[] StudentenImRaum;
	int[] neueStudentenImRaum;
	int anzahlStudentenImRaum = 0;
	
	public Raum(String Raumname, int anzahlStudenten) {
		this.Raumname = Raumname;
		this.anzahlStudenten = anzahlStudenten;
		this.StudentenImRaum = new int[anzahlStudenten];
	}
	
	public boolean isBelegt() {
		return belegt;
	}
	
	public void setBelegung(boolean belegt) {
		this.belegt = belegt;
	}
	
	public void betreteRaum(int matrikelnummer) {
		StudentenImRaum[anzahlStudentenImRaum] = matrikelnummer;
		anzahlStudentenImRaum++;
		
	}
	
	public void verlasseRaum(int matrikelnummer) {
		this.neueStudentenImRaum = new int[anzahlStudentenImRaum -1];
		int stelleArray = 0;
		for (int i = 0; i < anzahlStudentenImRaum - 1; i++) {
			if(StudentenImRaum[stelleArray] == matrikelnummer) {
				stelleArray++;
			}
			neueStudentenImRaum[i] = StudentenImRaum[stelleArray];
			stelleArray++;
		}
		
		anzahlStudentenImRaum--;
		this.StudentenImRaum = new int[anzahlStudentenImRaum];
		
		for(int i = 0; i<anzahlStudentenImRaum;i++) {
			StudentenImRaum[i] = neueStudentenImRaum[i];
		}
		
	}

}
