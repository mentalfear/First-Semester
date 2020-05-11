package Lektion17;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;


class OutputStreamTest {
	

	// off negative
	@Test
	void OffNegative() {
		String s = "Hallo Welt";
		byte[] b = s.getBytes();
		int off = -5;
		int len = b.length;

		try {
			A2_FileCopy.WriteCopy(b,off,len);
			fail("keine Exception ausgelöst -> Off darf Negative sein");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// off zu hoch -> Länger als das write
	@Test
	void OffZuLang() {
		String s = "Hallo Welt";
		byte[] b = s.getBytes();
		int off = b.length;
		int len = b.length;
		
		try {
			A2_FileCopy.WriteCopy(b,off,len);
			fail("keine Exception ausgelöst -> Off darf b.length sein");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	// len zu lang
	@Test
	void lenZuLang() {
		String s = "Hallo Welt";
		byte[] b = s.getBytes();
		int off = 0;
		int len = b.length + 10;
		
		try {
			A2_FileCopy.WriteCopy(b,off,len);
			fail("keine Exception ausgelöst -> len darf länger als b.length sein");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	// len negative?
	@Test
	void lenNegative() {
		String s = "Hallo Welt";
		byte[] b = s.getBytes();
		int off = b.length / 2;
		int len = -1;
		
		try {
			A2_FileCopy.WriteCopy(b,off,len);
			fail("keine Exception ausgelöst -> len darf negative seinn");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
