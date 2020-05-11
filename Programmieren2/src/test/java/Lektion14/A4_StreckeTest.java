package Lektion14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class A4_StreckeTest {

	@Test
	void PunkteTest() {
		A4_Strecke str = new A4_Strecke(6,4);
		assertTrue(str.a <= str.b);
		str = new A4_Strecke(4,6);
		assertTrue(str.a <= str.b);
		
	}
	
	@Test
	void UeberschneidungTest() {
		assertTrue(A4_Strecke.überschneidung(new A4_Strecke(1,3), new A4_Strecke(2,4)));
		assertTrue(A4_Strecke.überschneidung(new A4_Strecke(5,3), new A4_Strecke(2,4)));
		assertTrue(A4_Strecke.überschneidung(new A4_Strecke(3,3), new A4_Strecke(2,4)));
		assertTrue(A4_Strecke.überschneidung(new A4_Strecke(1,3), new A4_Strecke(2,2)));
	}
	
	@Test
	void toStringTest() {
		A4_Strecke str = new A4_Strecke(6,4);
		assertEquals("4--6", str.toString());
	}

}
