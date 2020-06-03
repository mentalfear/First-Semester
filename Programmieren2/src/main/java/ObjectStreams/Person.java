package ObjectStreams;
import java.io.Serializable;

public class Person implements Serializable {

	String vorname;
	String nachname;
	
	public Person(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
}
