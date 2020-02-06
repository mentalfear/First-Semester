package Lektion8;

public class Aufgabe3_Rechner {
	
	public static void main(String[] args)
	{			
		int erg = 0;

		if(args[args.length-1].charAt(0) == '+')
		{
			for(int i = 0; i <args.length-1; i++)
			{
				erg = erg + Integer.valueOf(args[i]);
				
			}
		}
		
		if(args[args.length-1].charAt(0) == '-')
		{
			erg = Integer.valueOf(args[0]);
			for(int i = 1; i <args.length-1; i++)
			{
				erg = erg - Integer.valueOf(args[i]);
			}
		}
		
		System.out.println(erg);
	}

}
