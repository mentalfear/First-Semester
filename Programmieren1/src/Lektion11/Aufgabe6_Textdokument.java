package Lektion11;

public class Aufgabe6_Textdokument
{
	
	private static char[][] text = new char[6][6];
	
	public static void main(String[] args) {
		
		
		text[0][2] = 'D';
		text[2][2] = 'F';
		text[1][0] = ' ';
		
		System.out.println(zaehleZeichen(text));
		
		System.out.println(text[0][2]);
		System.out.println(text[2][2]);
		
		
		//System.out.println(vertauscheZeilen(0,4));
		
		char[][] nText = new char[][] {{'1','2'},{'A','F'}};
		fuegeEinTextdokument(nText, 7);
		
		System.out.println(text[0][2]);
		System.out.println(text[2][1]);
		
		
		
	}
	
	public static int zaehleZeichen(char[][] text) {
		
		int zaehler = 0;
		
		for (int i = 0; i<text.length; i++) {
			
			for(int j = 0; j<text[i].length; j++) {
				
				if ( text[i][j] != ' ' && text[i][j] != 0 ) {
					zaehler++;
				}
				
			}
			
		}
		
		return zaehler;
	}
	
	public static boolean vertauscheZeilen(int a, int b) {

		try {
			char[] aZeile = text[a];
			
			text[a] = text[b];
			text[b] = aZeile;
						
			return true;
			
		}catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
		
	}
	
	public static void fuegeEinTextdokument(char[][] einfuegeText, int zeile) {
		
		try {
		
			for(int i = 0; i < einfuegeText.length; i++) {
				
				for(int j = 0; j <einfuegeText[i].length; j++) {
			
					text[i+zeile][j] = einfuegeText[i][j];
					
				}
			}
			
			
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Vertauschen geht nicht");
		}
		
		
	}

}
