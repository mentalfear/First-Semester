package WS1516;

public class Aufgabe4
{
	public static void main(String[] args)
	{
		Schlieﬂfach[] fach = new Schlieﬂfach[100];
		
		for (int i = 0; i<100; i++) {
			fach[i] = new Schlieﬂfach(i+1, false);
		}
		
		
		for(int i = 1; i<=100; i++) {
			for(int j = 0; j<100; j = j+i) {
				if(fach[j].isOpen()) fach[j].setOpen(false);
				else fach[j].setOpen(true);
			}
			/*
			for(int g = 0; g<100; g++) {
				System.out.printf(fach[g].toString());
			}
			System.out.printf("%n");
			*/
		}
		
		int anzahlOpen = 0;
		for (int i = 0; i<100; i++) {
			if(fach[i].isOpen()) anzahlOpen++;
		}
		System.out.println("An Ende die insgesamt noch " + anzahlOpen +" geˆffent!");
 	}

}
