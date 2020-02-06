package Lektion12;

public class Aufgabe1_Lottoziehung
{
	
	public static void main(String[] args) {
		
		Lottozahl start = null;
		start = new Lottozahl(1);
		Lottozahl k;
		
		for(int i = 2; i<50;i++) {
			k = new Lottozahl(i);
			Lottozahl temp = start;
			while (temp.next != null) {
				temp = temp.next;
				
			}
			temp.next = k;
		}
		
		//Kontrolle
		Lottozahl temp = start;
		while(temp != null) {
			System.out.println(temp.getZahl());
			temp = temp.next;
		}
		
		
		//Ziehung
		int[] ziehung = new int[6];
		int anzahlZahlen = 49;
		for(int i = 0; i<6; i++) {
			
			int randZahl =(int) (Math.random()*anzahlZahlen);
			
			Lottozahl oldtemp = start;
			Lottozahl newtemp = start.next;
			
			//falls es die erste Stelle (start) wird
			if(randZahl == 0) {
				ziehung[i] = oldtemp.getZahl();
				start = newtemp;
				continue;
			}
			
			
			//Muss bei 1 Beginnen, da der temp wert auf dem zweiten Wert schon steht
			for(int j = 1; j< randZahl; j++) {
				oldtemp = newtemp;
				newtemp = newtemp.next;
				
			}
			
			ziehung[i] = newtemp.getZahl();
			oldtemp.next = newtemp.next;
			
			anzahlZahlen--;
			
		}
		
		//Kontrolle
		System.out.println("Ziehung: ");
		for(int i = 0; i< ziehung.length; i++) {
			System.out.printf(" %d",ziehung[i]);
		}
		System.out.printf("%n");
		
		
		
	}

}
