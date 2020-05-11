package Lektion08;

public class Aufgabe2_opt_Parameter {

	public static void main(String[] args)
	{
		for (int i = 0; i < args.length; i++)
		{
		System.out.println(args[i]);
		}
		
		int add = Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
		System.out.println(add);
	}
	
}
