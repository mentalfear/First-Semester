package Lektion16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Lektion16_UB3.StackVererbung;

class A3_StackTest {
	
	public static final String TEST_STRING = "TestString";

	@Test
	void StackVererbungTest() {
		StackVererbung s = new StackVererbung();
		
		//pushTest
		try {
			s.push(TEST_STRING);
			assertTrue(s.size() == 1);
		}catch (Exception e) {
			fail("Kein pushen möglich!");
		}
		//popTest
		try {
			Object o = s.pop();
			assertEquals(o, TEST_STRING);
			assertTrue(s.size() == 0);
		}catch (Exception e) {
			fail("Kein pop möglich!");
		}

		//doppeltes pop
		try {
			s.pop();
			fail("doppeltes Entfernen geht");
		}catch (Exception e) {
			
		}
		
		
		

		
	}

}
