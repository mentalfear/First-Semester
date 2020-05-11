package Lektion16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Lektion16_UB2.*;

class A2_Muenzautomat {

	@Test
	void Wechselgeld() {
		
		Coin[] c = Coin.values();
		
		int[][] test = {{0,0,0,1,1,1,0,1},
						{1,1,0,0,0,0,1,1},
						{1,0,0,0,0,1,1,10},
						{1,0,1,1,1,1,1,1}};
		
		for(int i = 0; i < test.length; i++) {
			int ges = 0;
			for(int j = 0; j < test[i].length; j++) {
				ges += test[i][j]*c[j].value;
			}
			
			BetterChangeCalculator cal = new BetterChangeCalculator();
			int[] ruckgabe = cal.getChange((int) (ges/100), ges%100);
			
			for(int j = 0; j < test[i].length; j++) {
				assertTrue(test[i][j] == ruckgabe[j]);
			}
			
		}
		
		
		
		
	}

}
