package Lektion16_UB1;

public class LaeuferImpl extends AbstractFigur implements Laeufer {
	public LaeuferImpl(int x, int y) {
		super(x, y);
	}

	public Brett gibErlaubteFelder() {
		Brett brett = new Brett();

		//Positiv = alles was drüber liegt vom Standpunkt
		//Negativ = Alles was drunter liegt vom Standpunkt
		int[] yArrPositiv = new int[8];
		int[] yArrNegativ = new int[8];
		
		int count = 0;
		
		while(true) {
			
			// -1, weil sonst um eins nach rechts verschoben (liegt an der Methode makiereFeld())
			int xPos1 = x-count-1;
			int xPos2 = x+count-1;
			int yPosPositiv = y-count;
			int yPosNegativ = y+count;
			
			//Abbruch wenn außerhalb des Spielfeldes
			if(yPosPositiv <1 && yPosNegativ > 8) break;
			
			//Werte Schreiben in die zwei Arrays; Null beschreibt kein Kreuz!
			if(xPos1 >= 0 && yPosPositiv >= 1) yArrPositiv[xPos1] = yPosPositiv;
			if(xPos2 <= 7 && yPosPositiv >= 1) yArrPositiv[xPos2] = yPosPositiv;
			if(xPos1 >= 0 && yPosNegativ <= 8) yArrNegativ[xPos1] = yPosNegativ;
			if(xPos2 <= 7 && yPosNegativ <= 8) yArrNegativ[xPos2] = yPosNegativ;
			
			//Zähler eben
			count++;
		}
		
		for(int i = 0; i < 8; i++) {
			
			//Null beschreibt immer das es nicht belegt ist
			if(yArrPositiv[i] != 0) {
				brett.markiereFeld(i+1, yArrPositiv[i]);
			}
			if(yArrNegativ[i] != 0) {
				brett.markiereFeld(i+1, yArrNegativ[i]);
			}
			
		}

		return brett;
	}

	public static void main(String[] args) {
		LaeuferImpl l = new LaeuferImpl(3, 6);
		Brett brett = l.gibErlaubteFelder();
		for (int j = 1; j <= 8; j++) {
			for (int i = 1; i <= 8; i++) {
				if (brett.gibFeld(i, j))
					System.out.print("x");
				else
					System.out.print("o");
			}
			System.out.println();
		}
	}
}
