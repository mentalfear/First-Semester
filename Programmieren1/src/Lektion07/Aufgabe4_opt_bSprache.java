package Lektion07;

public class Aufgabe4_opt_bSprache {

	public static void main(String[] args)
	{
		String wort = "ispiel";
		wort = bSprache(wort);
		System.out.println(wort);
	}
	
	public static String bSprache(String wort)
	{
		char[] wortChar = wort.toCharArray();
		int zaehler = 0;
		for (int i = 0; i < wortChar.length; i++)
		{
			if (wortChar[i] == 'a' || wortChar[i] == 'e' || wortChar[i] == 'i' || wortChar[i] == 'o' || wortChar[i] == 'u') zaehler++;
		}
		char[] newWortChar = new char[wortChar.length + zaehler*2];
		
		zaehler = 0;
		for (int i = 0; i < newWortChar.length; i++)
		{		
			newWortChar[i] = wortChar[i-zaehler*2];
			if (wortChar[i-zaehler*2] == 'a' || wortChar[i-zaehler*2] == 'e' || wortChar[i-zaehler*2] == 'i' || wortChar[i-zaehler*2] == 'o' || wortChar[i-zaehler*2] == 'u')
			{
				zaehler++;
				i++;
				newWortChar[i] = 'b';
				i++;
				newWortChar[i] = newWortChar[i-2];
			}
		}
		
		wort = String.valueOf(newWortChar);
		return wort;
 	}
	
	
}
