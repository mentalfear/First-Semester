package KlausurUebung;

public class Aufgabe1
{

	public static void main(String[] args)
	{
		
		String s = "Graphik.Init.Datei.ini ";
		int ersetzAnzahl = ersetze(s.toCharArray());
		System.out.println(ersetzAnzahl);
		
	}
	
	public static int ersetze(char[] cArray) {
		
		int arrayLength = cArray.length;
		
		for (int i = 0; i< cArray.length; i++) {
			if(cArray[i] == '.') {
				arrayLength = i;
			}
		}
		
		int zaehler = 0;
		
		for(int i = 0; i < arrayLength; i++) {
			if(cArray[i] == '.') {
				zaehler++;
				cArray[i] = '_';
			}
		}
		String s = String.copyValueOf(cArray);
		
		System.out.println(s);
		
		return zaehler;
		
	}
	
}
