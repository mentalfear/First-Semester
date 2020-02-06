package Lektion7;

public class Aufgabe7_Lottoziehung
{

	public static int anzahlZahlen = 49;

	public static void main(String[] args)
	{
		// Erstellen der 6 Zahlen
		int[] gewinnZahlen = new int[6];
		for (int i = 0; i < 6; i++)
		{
			int[] gezogen = new int[i];
			System.arraycopy(gewinnZahlen, 0, gezogen, 0, i);
			// int[] zahlen = zahlenBerechnung(gezogen);

			gewinnZahlen[i] = randomZahl(gezogen);
		}

		// Sortieren
		for (int i = 0; i < 6; i++)
		{
			int stelle = i;
			for (int j = i; j < 6; j++)
			{
				if (gewinnZahlen[stelle] > gewinnZahlen[j])
					stelle = j;
			}
			int zerg = gewinnZahlen[i];
			gewinnZahlen[i] = gewinnZahlen[stelle];
			gewinnZahlen[stelle] = zerg;
		}

		System.out.printf("Die gezogenen Lottozahlen sind ");
		for (int i = 0; i < 6; i++)
		{
			System.out.printf("%d ", gewinnZahlen[i]);
		}

	}

	public static int randomZahl(int[] gezogen)
	{
		if (gezogen.length == 0)
			return (int) (Math.random() * anzahlZahlen + 1);

		int randzahl = 0;
		boolean bereitsVorhanden = true;

		while (bereitsVorhanden)
		{
			randzahl = (int) (Math.random() * anzahlZahlen + 1);
			for (int i = 0; i < gezogen.length; i++)
			{
				if (randzahl == gezogen[i])
					break;
				if (i == gezogen.length - 1)
					bereitsVorhanden = false;
			}
		}

		return randzahl;
	}
	/*
	 * public static int[] zahlenBerechnung(int[] gezogen) { int[] zahlen = new
	 * int[anzahlZahlen - gezogen.length]; int zaehler = 1; for (int i = 0;
	 * i<anzahlZahlen - gezogen.length; i++) { for(int j = 0; j < gezogen.length;
	 * j++) { if(zaehler == gezogen[j]) { zaehler++; break; } } zahlen[i] = zaehler;
	 * zaehler++; } return zahlen; }
	 */
}
