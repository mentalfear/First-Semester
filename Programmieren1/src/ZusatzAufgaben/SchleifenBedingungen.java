package ZusatzAufgaben;

public class SchleifenBedingungen
{
	
	public static void main(String[] args)
	{
		int durchlauf = 0;
		do {
			if(durchlauf == 2) {
				durchlauf++;
				continue;
			}
			System.out.println(durchlauf);
			durchlauf++;
			if(durchlauf == 5) break;
		}while(true);
		
		for(int i = 0; i< 10; i++) {
			
			if(i == 2) continue;
			System.out.println(i);
			//break;
		}
		
		System.out.println(add(5));
	}
	
	public static int add(int a) {
		return a;
	}

}
