package Lektion6;

public class Aufgabe3_Dreieck {
	
	public static int zaehler = 1;
	
	public static void main(String[] args)
	{
		//ausgabe(5);
		ausgabe2(31);
	}
	
	public static void ausgabe(int zeile)
	{
		if (zeile == 0) return;
		for (int i = 0; i < zeile; i++) {
			System.out.printf("* ");
		}
		System.out.printf("%n");
		ausgabe(zeile -1);
	}
	
	public static void ausgabe2(int zeile)
	{
		//int zaehler = 1;
		if (zeile < zaehler) return;
		//System.out.println(zaehler);
		for(int j = 0; j < zeile-zaehler; j++) {
			System.out.printf(" ");
		}
		for (int i = 0; i < zaehler; i++) {
			
			System.out.printf(" *");
		}
		System.out.printf("%n");
		zaehler = zaehler + 1;
		ausgabe2(zeile);
		
	}

}
