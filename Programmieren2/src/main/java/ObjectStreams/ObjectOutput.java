package ObjectStreams;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;


public class ObjectOutput {
	
	public static void main(String[] args) {
		
		try {
			Person person = new Person("Georg","Wolf");
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"));
			oos.writeObject(person);
			oos.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
