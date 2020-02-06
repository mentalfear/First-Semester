package Lektion9;

public class Aufgabe1_Auto
{

	public static void main(String[] args)
	{

		Auto a1 = new Auto("VW" , 600, "weiﬂ");
		System.out.println(a1.getHubraum());
		a1.setHubraum(500);
		System.out.println(a1.getHubraum());
		a1.setHubraum(-500);
		System.out.println(a1.getHubraum());
		
		
	}

}
