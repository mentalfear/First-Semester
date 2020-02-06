package KlausurUebung;

public class SpaceInvaders
{
	char[] raumschiff = new char[8];
	char[] aliens = new char[8];
			
	public SpaceInvaders() {
		
		int posRaumschiff = (int) (Math.random()*8);
		
		for (int i = 0; i < aliens.length; i++) {
			aliens[i] = 'o';
			if(i==posRaumschiff) {
				raumschiff[i] = 'V';
			}else {
				raumschiff[i] = ' ';
			}
			
		}
		
		System.out.printf(this.toString());
		
	}
	
	@Override
	public String toString() {
		String ausgabe = "";
		for(int i = 0; i<aliens.length; i++) {
			ausgabe += aliens[i] + " ";
		}
		
		ausgabe += "%n%n%n";
		
		for(int i = 0; i <raumschiff.length;i++) {
			ausgabe += raumschiff[i] + " ";
		}
		
		return ausgabe + "%n";
	}

	public void bewege(String eingabe) {
		int raumschiffStelle = 0;
		for(int i = 0; i< raumschiff.length ; i++) {
			if(raumschiff[i] == 'V') {
				raumschiffStelle = i;
			}
		}
		
		if (eingabe.equals("a") && raumschiffStelle != 0) {
			raumschiffStelle--;	
		}
		
		if(eingabe.equals("d") && raumschiffStelle != raumschiff.length -1 ) {
			raumschiffStelle++;
		}
		
		for(int i = 0; i< raumschiff.length; i++) {
			if(i == raumschiffStelle) raumschiff[i] = 'V';
			else raumschiff[i] = ' ';
		}
		
		System.out.printf(this.toString());
	}
	
}
