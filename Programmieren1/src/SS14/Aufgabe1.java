package SS14;

public class Aufgabe1
{
	public static void main(String[] args)
	{
		System.out.println(gueltigeMatrikelNr(5100000));
	}

	public static boolean gueltigeMatrikelNr(int matNr) {
		boolean gueltig = false;
		if(matNr < 6200000 && matNr >= 5000000) {
			int ersteZeichen = matNr / 100000;
			System.out.println(ersteZeichen);
			
			switch (ersteZeichen) {
			case 50:
			case 51:
			case 61:
				gueltig = true;
				break;
			}
			
		}
		
		return gueltig;
	}
	
}
