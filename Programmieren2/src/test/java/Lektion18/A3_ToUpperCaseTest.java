package Lektion18;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;


// https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests
// Link zur Doku -> Unter ParameterizedTest -> SourcesOfValues
// @ValueSource(ints = { 1, 2, 3 })
// @NullSource: provides a single null argument to the annotated @ParameterizedTest method.
// @EmptySource: == bspw char[][];
// @NullAndEmptySource: a composed annotation that combines the functionality of @NullSource and @EmptySource.
// @EnumSource(names = { "DAYS", "HOURS" })
// @MethodSource allows you to refer to one or more factory methods of the test class or external classes.
// @CsvSource({ "apple, banana" }) --> geht auch noch weiter
// @CsvFileSource(resources = "/two-column.csv", numLinesToSkip = 1)


class A3_ToUpperCaseTest {

	@DisplayName("Should pass a non-null message to our test method")
    @ParameterizedTest
    @ValueSource(strings = {"Hello", "World"})
    void shouldPassNonNullMessageAsMethodParameter(String message) {
        
    }
	
	@DisplayName("ValueSource Test")
	@ParameterizedTest
	@ValueSource(strings = {"a", "1"})
	void writeCharTest(String c) {
		try(ByteArrayOutputStream baos = new ByteArrayOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(baos);
				A3_ToUpperCaseWriter writer = new A3_ToUpperCaseWriter(osw);){
			
			writer.write(c.charAt(0));
			writer.flush();
			String respond = baos.toString();
			assertEquals(c.toUpperCase(), respond);
			
		
		}catch (IOException e) {
			
			fail("IOException ausgelöst: " + e.getMessage());
		}
	}
	
	@DisplayName("MethodeSource Test")
	@ParameterizedTest
	@MethodSource("range")
	void writeCharTestArray(char c) {
		try(ByteArrayOutputStream baos = new ByteArrayOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(baos);
				A3_ToUpperCaseWriter writer = new A3_ToUpperCaseWriter(osw);){
			
			writer.write(c);
			writer.flush();
			String respond = baos.toString();
			assertEquals(String.valueOf(c).toUpperCase(), respond);
			
		
		}catch (IOException e) {
			
			fail("IOException ausgelöst: " + e.getMessage());
		}
	}
	
	static char[] range() {
		char[] cArray = new char[128];
		
		
		for(int i = 0; i < cArray.length; i++) {
			
			cArray[i] = (char) i;
		}
		
		return cArray;
	}
	
}
