package Lektion4;

public class Aufgabe1_Countdown {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		for ( int i = 15; i >= 0; i--)
		{
			System.out.println("Countdown " + i);
			Thread.sleep(1000);
		}	
	}

}
