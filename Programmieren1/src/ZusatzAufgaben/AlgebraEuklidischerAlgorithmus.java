package ZusatzAufgaben;

import java.io.*;

public class AlgebraEuklidischerAlgorithmus {
	
public String var;
public static int y;
public static int x;
	
	public static void main(String[] args) throws IOException
	{
		//Scanner scannerVariable = new Scanner(System.in);
		//System.out.println("User input: " + scannerVariable.nextLine());
		
		//Eingabe
		String var;
		int vara = Eingabe(var = "a");
		int varb = Eingabe(var = "b");
		
		//Berechnung ggT
		int teiler = ggT(vara, varb)[0];
		System.out.println("Der ggT ist: " + teiler);
		System.out.println("y ist: " + y);
		System.out.println("x ist: " + x);
	}
	
	public static int[] ggT(int a, int b) {

		int olda = a;
		int oldb = b;

		int varza = 0;
		int varzb = 1;
		int rest;
		
		int quotient;
		int varz = -2;
		
		while(b != 0) {
			// Quotienten bestimmen
			quotient = (int) a/b;
			//System.out.println("q" + quotient);
			
			//Berechnungen/ Zwischenspeicher
			varz = varza - (quotient * varzb);
			rest = a % b;
			
			// Alte b-Zeilen werden Neue a-Zeilen
			varza = varzb;
			a = b;
			
			// Zwischenspeicher wird neue b-Zeile
			varzb = varz;
			b = rest;
			
		}
		if(a < 0) a= -a;
		rest = a;
		y = varza;
		x = (rest - y * olda)/(oldb); 
		int[] erg = {rest,y,x};
		return erg;
	}
	
	public static int Eingabe (String var) throws IOException {
		//variable Abfrage
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String eingabe;
		
		System.out.println("Gib "+ var + " ein");
		
		eingabe = br.readLine(); 
		int zahl = Integer.parseInt(eingabe);
		System.out.println("Du hast " + zahl + " eingegeben.");
		
		return zahl;
		
	}

}
