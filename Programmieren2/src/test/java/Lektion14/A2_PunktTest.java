package Lektion14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class A2_PunktTest {

	A2_Punkt punkt = new A2_Punkt();
	
	@Test
	void PunktTest() {

		try {
			punkt.verschiebePunkt(50, 50);
		} catch (RuntimeException e) {
			fail("RuntimeException reingelaufen");
		}
	}
//Koordinate Negative?
	@Test
	void PunktTestNegative() {
		//X NEGATIVE
		try {
			punkt.verschiebePunkt(-50, 50);
			fail("No RuntimeException");
		} catch (RuntimeException e) {
			String errorMessage = e.getMessage();
			assertEquals(errorMessage,"Koordinate negative");
		}
		
		//Y NEGATIVE
		try {
			punkt.verschiebePunkt(50, -50);
			fail("No RuntimeException");
		} catch (RuntimeException e) {
			String errorMessage = e.getMessage();
			assertEquals(errorMessage,"Koordinate negative");
		}
	}
	
//x-Koordinate größer als 1920?
	@Test
	void PunktTestXOutOfRange() {

		try {
			punkt.verschiebePunkt(2000, 50);
			fail("No RuntimeException!");
		} catch (RuntimeException e) {
			String errorMessage = e.getMessage();
			assertEquals(errorMessage, "X-Koordinate zu groß");
		}
	}
	
//y-Koordinate größer als 1080?	
	@Test
	void PunktTestYOutOfRange() {

		try {
			punkt.verschiebePunkt(50, 2000);
			fail("No RuntimeException!");
		} catch (RuntimeException e) {
			String errorMessage = e.getMessage();
			assertEquals(errorMessage, "Y-Koordinate zu groß");
		}
	}
	
}
