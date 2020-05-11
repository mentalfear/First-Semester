package Lektion18;

public class Dauerschleife {

	
	public static void main(String[] args) {
		float sum = 0;
		for (float x = 20000000; x < 20000010; x = x + 2) {
			sum = sum + 1;
			System.out.println(x);
		}
		
	}
}
