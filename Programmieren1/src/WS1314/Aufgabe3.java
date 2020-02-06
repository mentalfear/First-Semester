package WS1314;

public class Aufgabe3
{

	public static void main(String[] args)
	{
		int[] a = {1,9,9};
		int[] b = {1,9,9};
		int[] erg = add(a,b);
		for(int i = 0; i<erg.length; i++) {
			System.out.println(erg[i]);
			
		}
	}
	
	public static int[] add(int[] a, int[] b) {
		int[] erg = new int[a.length];
		boolean übertrag = false;
		int zerg = 0;
		
		for(int i = 0; i<erg.length; i++) {
			erg[i] = 0;
		}
		
		for(int i = a.length-1; i >= 0; i--) {
			zerg = a[i] + b[i];
			erg[i] += zerg;
			
			if(erg[i] > 9) {
				erg[i] %= 10;
				if(i!=0)	erg[i-1] = 1;
				else übertrag = true;
			}
			
		}
		if(übertrag) {
			int[] erg2 = new int[erg.length+1];
			erg2[0] = 1;
			for(int i = 0; i < erg.length; i++) {
				erg2[i+1] = erg[i];
			}
			return erg2;
			
		}else {
			return erg;
		}
		
	}
	
}
