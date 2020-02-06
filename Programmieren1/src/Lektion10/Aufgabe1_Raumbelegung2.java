package Lektion10;

public class Aufgabe1_Raumbelegung2
{
	public static void main(String[] args) {

		
		Raum raum = new Raum("I3.12", 20);
		
		//Gehen in den Raum
		for (int i = 0; i < raum.anzahlStudenten; i++) {
			int matrikel = i*150 + 2535;
			raum.betreteRaum(matrikel);
		}
			
		ausgabe(raum);
		
		//Verlassen den Raum
		while (raum.anzahlStudentenImRaum != 0) {
			int matr = raum.StudentenImRaum[(int) (Math.random()*raum.anzahlStudentenImRaum)];
			raum.verlasseRaum(matr);
				
		}
		
		ausgabe(raum);

	}
	
	public static void ausgabe(Raum raum) {
		System.out.printf("Gerade sind im Raum folgende Matrikelnummern: ");
		for(int i =0; i < raum.anzahlStudentenImRaum;i++) {
			System.out.printf(" %d,",raum.StudentenImRaum[i]);
		}
		System.out.printf("%n Die Anzahl der Studenten beträgt %d", raum.anzahlStudentenImRaum);
		System.out.printf("%n");
	}

}
