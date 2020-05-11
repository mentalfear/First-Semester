package Lektion14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class A1_KugelvolumenTest {

	final double EPSILON = 10e-3;
	
	@Test
	void TestRadiusOne() {
		double erg = 4.189;
		assertEquals(erg, A1_Kugelvolumen.berechneKugelvolumen(1), EPSILON);
	}
	
	@Test
	void TestRadiusFive() {
		double erg = 523.599;
		assertEquals(erg, A1_Kugelvolumen.berechneKugelvolumen(5), EPSILON);
	}
	
	@Test
	void TestRadiusZero() {
		double erg = 0;
		assertEquals(erg, A1_Kugelvolumen.berechneKugelvolumen(0), EPSILON);
	}
	

	@Test
	void TestRadiusNegative() {
		try
		{
			A1_Kugelvolumen.berechneKugelvolumen(-1);
			fail("Runtime Exception erwartet!");
		}catch(RuntimeException e){
			String errorMessage = e.getMessage();
			assertEquals(errorMessage, "Ungültiger Radius!");
		}
		
	}
}
