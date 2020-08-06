package KlausurAufgaben1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserManager<T> implements ObjectManager<T> {

	@Override
	public void serialize(List<T> object) throws RuntimeException {
		int index = 0;

		for (T obj : object) {
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Klasur1" + index + ".txt"));) {

				oos.writeObject(obj);
				oos.flush();

			} catch (Exception e) {
				throw new RuntimeException();
			}
			index++;

		}

	}

	@Override
	public List<T> deserialize() throws RuntimeException {
		List<T> array = new ArrayList<T>();
		int index = 0;
		while(true)
		{
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Klasur1" + index + ".txt"));)
			{
				T user = (T) ois.readObject(); 
				array.add(user);
				index++;
				
			}catch (FileNotFoundException e) {
				return array;
			}catch (Exception e) {
				throw new RuntimeException();
			}
			
		}
		
	}

}
