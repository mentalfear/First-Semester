package Lektion4;

public class Aufgabe6_DasKleineEinmaleins {
	
	public static void main(String[] args) {
		
		for(int j=1; j<=10; j++ ) 
		{
			for(int i=1; i<=10; i++) 
			{
				int erg = j * i;
				System.out.printf("%d x %d = %d \n", j, i, erg);
			}
		}
	}
}
