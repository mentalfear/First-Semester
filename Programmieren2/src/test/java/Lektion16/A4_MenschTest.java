package Lektion16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Lektion16_UB4.Cyborg;
import Lektion16_UB4.Mensch;

class A4_MenschTest {

	final static double EPSILON = 0.01;
	final static int durchlaeufe = 50000;
	
	
	
	@Test
	void entscheidung() {
		int trueEntscheidung = 0;
		int falseEntscheidung = 0;
		
		Mensch mensch = new Mensch();
		
		for(int i = 0; i < durchlaeufe; i++) {
			
			if(mensch.entschiede(i%3) != i%3) falseEntscheidung++;
		}
		double erg = (double) falseEntscheidung/durchlaeufe;
		assertEquals(erg,0.25,EPSILON);
		
	}
	
	@Test
	void entscheidungCyborg() {
		Cyborg cyborg = new Cyborg();
		
		int falseEntscheidung = 0;
		
		for(int i = 0; i < durchlaeufe; i++) {
			int entCyborg = cyborg.entschiede(i%3);
			if(entCyborg != i%3) falseEntscheidung++;
		}
		
		double erg = (double) falseEntscheidung/durchlaeufe;
		assertEquals(erg,0.125,EPSILON);
		
	}

}
