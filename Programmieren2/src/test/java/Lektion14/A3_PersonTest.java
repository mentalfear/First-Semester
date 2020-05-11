package Lektion14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class A3_PersonTest {

	A3_Adresse adresse = new A3_Adresse("Weg", "Ort", "3b", 98545);

	@Test
	void CreatePersonTest() {

		// gelingen Test
		try {
			A3_Person p1 = new A3_Person("Hans", "Gustav", adresse);

		} catch (RuntimeException e) {
			System.out.println(e);
			fail("Runtime ausgelöst");
		}

		// Vorname Test
		try {
			A3_Person p1 = new A3_Person("hans", "Gustav", adresse);
			fail("NoRuntime");
		} catch (RuntimeException e) {
			String errorMessage = e.getMessage();
			assertEquals(errorMessage, "Vorname");
		}

		// Strasse Test
		try {
			adresse.strasse = "weg";
			A3_Person p1 = new A3_Person("Hans", "Gustav", adresse);
			fail("NoRuntime");
		} catch (RuntimeException e) {
			String errorMessage = e.getMessage();
			assertEquals(errorMessage, "Straße");
		}
		adresse.strasse = "Weg";
		
		// Ort Test
		try {
			adresse.ort = "ort";
			A3_Person p1 = new A3_Person("Hans", "Gustav", adresse);
			fail("NoRuntime");
		} catch (RuntimeException e) {
			String errorMessage = e.getMessage();
			assertEquals(errorMessage, "Ort");
		}
		adresse.ort = "Ort";
		
		// Hausnummer Test
		try {
			adresse.hausnummer= "b3";
			A3_Person p1 = new A3_Person("Hans", "Gustav", adresse);
			fail("NoRuntime");
		} catch (RuntimeException e) {
			String errorMessage = e.getMessage();
			assertEquals(errorMessage, "Hausnummer");
		}

	}

}
