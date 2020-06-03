package ObjectStreams;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class ObjectInput {
	
	public static void main(String[] args) {
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"));
			Person p = (Person) ois.readObject();
			
			System.out.println("Vorname: " + p.vorname + " Nachname: " + p.nachname);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
