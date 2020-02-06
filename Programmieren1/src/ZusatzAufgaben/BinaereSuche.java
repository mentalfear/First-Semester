package ZusatzAufgaben;

public class BinaereSuche {
	
	public static void main(String[] args)
	{
		int maxZahl = 50;
		int minZahl = -300;
		int gesuchteZahl = 13;
		int schaetzung = (maxZahl + minZahl) / 2;
		int iteration = 0;
		
		while (schaetzung != gesuchteZahl)
		{
			iteration++;
			//System.out.println(iteration);
		
			if (gesuchteZahl > schaetzung) {
				minZahl = schaetzung;
				schaetzung = (schaetzung + maxZahl) /2;
			}else{
				maxZahl = schaetzung;
				schaetzung = (schaetzung + minZahl) /2;
			};
			System.out.println(schaetzung);
		}
	}

}
