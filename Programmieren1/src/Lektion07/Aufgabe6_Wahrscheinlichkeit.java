package Lektion07;

public class Aufgabe6_Wahrscheinlichkeit {
	
	public static void main(String[] args)
	{
		//int schreibtisch = 0;
		//int ersteSchublade = 0;
		//int zweiteSchublade = 0;
		int dritteSchublade = 0;
		int durchlaufe = 10000;
		//int durchlaufFallEins = durchlaufe;
		//int durchlaufFallZwei =0;
		int durchlaufFall =0;
		for (int i=0; i<durchlaufe;i++)
		{
			//double wahrscheinlichkeit = 2 * Math.random();
			//schreibtisch = schreibtisch + (int) wahrscheinlichkeit;
			
			int wahrscheinlichkeit =(int) (3* 2 * Math.random());
			
			//if(wahrscheinlichkeit == 0) ersteSchublade++;
			
			if(!(wahrscheinlichkeit == 0)) 
			{
				//durchlaufFallZwei++;
				//if(wahrscheinlichkeit == 1) zweiteSchublade++;
				
				if(!(wahrscheinlichkeit == 1)) 
				{
					durchlaufFall++;
					if(wahrscheinlichkeit == 2) dritteSchublade++;
					
				}
			}
		
		}
		//System.out.println("Die Wahrscheinlichkeit betragt " + (double) schreibtisch/durchlaufe * 100 + "%");
		//System.out.println("Die Wahrscheinlichkeit betragt " + (double) ersteSchublade/durchlaufe * 100 + "%");
		//System.out.println("Die Wahrscheinlichkeit betragt " + (double) zweiteSchublade/durchlaufFallZwei * 100 + "%");
		System.out.println("Die Wahrscheinlichkeit betragt " + (double) dritteSchublade/durchlaufFall * 100 + "%");
	}

}
