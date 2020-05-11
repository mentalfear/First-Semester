package Lektion07;

public class Aufgabe3_opt_Grossbuchstaben {
	
	public static void main(String[] args)
	{
		char x = 'c';
		x = umwandlung(x);
		System.out.println(x);
	}
	
	public static char umwandlung(char x)
	{
		if(x >= 'a' && x <= 'z') x = (char) (x - 32);
		return x;
	}

}
