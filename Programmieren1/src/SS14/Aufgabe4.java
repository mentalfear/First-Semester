package SS14;

public class Aufgabe4
{
	public static void main(String[] args)
	{
		char[][] text = {{'a', 'b','c','d', 'a', 'l'},{'b', 'c'},{'a', 'c','v'},{'a'}};
		ausgabe(text);
		text = ersetzeZeichen(text,'a','x');
		ausgabe(text);
		text = dreheDokument(text);
		ausgabe(text);
	}
	
	public static char[][] dreheDokument(char[][] text) {
		char[][] nText = text;
		
		for(int i = 0; i< text.length; i++) {
			for(int j = 0; j < text[i].length; j++) {
				nText[i][text[i].length-1-j] = text[i][j];
			}
		}
		
		return nText;
	}
	
	public static char[][] ersetzeZeichen(char[][] text, char z, char ez) {
		
		for(int i = 0; i < text.length; i++) {
			for(int j = 0; j < text[i].length; j++) {
				if(text[i][j] == z) {
					text[i][j] = ez;
				}
			}
		}
		
		return text;
	}
	
	public static void ausgabe(char[][] text) {
		for(int i = 0; i < text.length; i++) {
			for(int j = 0; j < text[i].length; j++) {
				System.out.printf("%c ", text[i][j]);
			}
			
			System.out.printf("%n");
		}
	}

}
