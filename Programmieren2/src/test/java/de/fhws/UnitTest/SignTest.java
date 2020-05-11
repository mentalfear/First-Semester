package de.fhws.UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SignTest {

	@Test
	void testSignOperator() {
		assertTrue(-1 == Sign.sign(-10));
		assertTrue(1 == Sign.sign(10));
		assertTrue(0 == Sign.sign(0));
	}

}
