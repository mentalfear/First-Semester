package Lektion15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class A1_AngestellterTest {
	
	private static final double EPSILON = 10e-6;
	
	A1_Angestellter p1 = new A1_Angestellter("Max", "Mustermann",1);
	A1_Abteilungsleiter l1 = new A1_Abteilungsleiter("Chef", "Babo",2);

	@Test
	void generateAngesteller() {
		
		assertEquals(1, p1.getGehaltsfaktor(), EPSILON);
		assertEquals(1000, A1_Angestellter.getGrundgehalt(), EPSILON);
		assertEquals(1000, p1.getGehalt(), EPSILON);
		assertEquals(1, p1.getId());
	}
	
	@Test
	void generateAbteilungsleiter() {
		
		assertEquals(2, l1.getGehaltsfaktor(), EPSILON);
		assertEquals(1000, A1_Angestellter.getGrundgehalt(), EPSILON);
		assertEquals(2000, l1.getGehalt(), EPSILON);
		assertEquals(2, l1.getId());
	
		//Erste Beförderung
		l1.befoerdern(p1);
		assertEquals(1.1, p1.getGehaltsfaktor(), EPSILON);
		assertEquals(1000*1.1, p1.getGehalt(), EPSILON);
		
		//Zweite Beförderung
		l1.befoerdern(p1);
		assertEquals(1.2, p1.getGehaltsfaktor(), EPSILON);
		assertEquals(1000*1.2, p1.getGehalt(), EPSILON);
		
	}

}
