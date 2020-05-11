package Lektion16_UB2;

public class Main {

	public static void main(String[] args) {
		
		BetterChangeCalculator c = new BetterChangeCalculator();
		
		int[] ruckgabe = c.getChange(0, 58);
		
		for(int i = 0; i < ruckgabe.length; i++) {
			System.out.println(ruckgabe[i]);
		}
	}
	
}
