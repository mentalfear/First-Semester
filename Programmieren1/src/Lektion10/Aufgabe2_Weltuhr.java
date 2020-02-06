package Lektion10;

public class Aufgabe2_Weltuhr
{
	
	public static void main(String[] args) {
		
		Uhr[] weltuhr = new Uhr[24];
		int stunden = 0;
		
		for (int i =0; i < weltuhr.length; i++) {
			weltuhr[i] = new Uhr(stunden, 23 , 0);
			stunden++;
		}
		
		System.out.println(weltuhr[2].getStd());
		
	}

}
