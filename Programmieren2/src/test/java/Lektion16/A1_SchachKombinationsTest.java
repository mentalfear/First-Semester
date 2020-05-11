package Lektion16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Lektion16_UB1.*;

class A1_SchachKombinationsTest {

	Dame dame = new Dame(5,6);
	Brett dameBrett = dame.gibErlaubteFelder();
	
	@Test
	void vergleichMitTurm() {
		
		TurmImpl t = new TurmImpl(dame.getX(), dame.getY());
		Brett tBrett = t.gibErlaubteFelder();
		
		
		for(int i = 1; i <=8; i++) {
			for(int j = 1; j <= 8; j++) {
				if(tBrett.gibFeld(i, j)) {
					assertTrue(dameBrett.gibFeld(i, j));
				}
			}
		}
	}
	
	@Test
	void vergleichMitLaeufer() {
		
		LaeuferImpl l = new LaeuferImpl(dame.getX(), dame.getY());
		Brett lBrett = l.gibErlaubteFelder();
		
		for(int i = 1; i <=8; i++) {
			for(int j = 1; j <= 8; j++) {
				if(lBrett.gibFeld(i, j)) {
					assertTrue(dameBrett.gibFeld(i, j));
				}
			}
		}
		
		
	}

}
