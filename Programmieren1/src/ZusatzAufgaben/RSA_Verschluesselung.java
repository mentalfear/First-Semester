package ZusatzAufgaben;

import java.math.BigInteger;

import ZusatzAufgaben.AlgebraEuklidischerAlgorithmus;

public class RSA_Verschluesselung {
	
	public static int privateKey;
	public static int[] publicKey = new int[2];
	
	
	public static void main(String[] args)
	{
		int text = 69;
		keyGenerate();
		//BigInteger locktext =  Math.pow(text, publicKey[0]) % publicKey[1];
		//long locktext = pow_modulo(text, publicKey[0], publicKey[1]);
		
		double unlocktext =  Math.pow(locktext, privateKey) % publicKey[1];
		
		String binaer = Integer.toBinaryString(publicKey[0]);
		int[] intBi = stringToArray(binaer);
		System.out.println(intBi[0]);
		
		//System.out.println(text);
		System.out.println(locktext);
		System.out.println(unlocktext);
		
	}
	
	public static int[] stringToArray(String str)
	{
		int[] erg = new int[str.length()];
 		for(int i = 0; i < str.length(); i++)
		{
 			char zwi = str.charAt(i);
			erg[i] = Integer.parseInt(Character.toString(zwi));
			
		}
 		return erg;		
	}

	public static void sqaureAndMultiply(int basis, int exp)
	{
		//Fehlt noch
	}


	
	public static void keyGenerate()
	{
		//getroffene Einheiten
		int primzahl1 = 7;
		int primzahl2 = 17;
		int e = 11;
		
		//1. m und phi(m) berechnen
		int m = primzahl1*primzahl2;
		int phim = (primzahl1-1)*(primzahl2-1);
		
		//2. Überhaut möglich Beweis
		int[] ggTBerechnungPhim = AlgebraEuklidischerAlgorithmus.ggT(phim,e); 
		if (!(ggTBerechnungPhim[0] == 1)) 
		{
			System.out.println("ggT nicht 1!");
			return;
		}
		//3. Berechnung privater Schlüssel
		privateKey = ggTBerechnungPhim[1];
		if (privateKey < 0) privateKey = phim + privateKey;
		
		//4. Bestimmung des public keys
		publicKey[0] = e;
		publicKey[1] = m;
		
		
		
	}

}
