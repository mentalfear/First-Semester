package Lektion13;

import Lektion12.*;

public class AufgabeX_Rechteck
{

	public static void main(String[] args)
	{
		//toString neu definieren
		Rechteck r = new Rechteck(25, 50);		
		System.out.println(r);
		
		Knoten k = new Knoten("Hallo", "Welt");
		System.out.println(k);
		
		//equals --> lieber equals arbeiten bei Strings!
		String s = "Hallo Welt";
		String s2 = "End of the fucking World";
		String s3 = "Hallo Welt";
		
		System.out.println(s == s3);
		System.out.println(s.equals(s3));
		System.out.println(s.equals(s));
		
		//varargs
		System.out.println(concat("Hello ", "Welt", "?"));
		
	}
	
	public static String concat(String...strings) {
		String result = "";
		
		for(int i = 0; i < strings.length; i++) {
			result += strings[i];
		}
		
		return result;
		
	}
	
}
