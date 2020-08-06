package Mitarbeiter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Mitarbeiter m1 = new Mitarbeiter("a1","b1",1,1000);	
		Mitarbeiter m2 = new Mitarbeiter("a2","b2",5,1000);	
		Mitarbeiter m3 = new Mitarbeiter("a3","b3",3,1000);	
		
		try(ObjectOutputStream bow = new ObjectOutputStream(new FileOutputStream("mitarbeiter.dat"));){
			
			bow.writeObject(m1);
			bow.flush();
			bow.writeObject(m2);
			bow.flush();
			bow.writeObject(m3);
			bow.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Collection<Mitarbeiter> col = new HashSet<>();
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mitarbeiter.dat"));){
			Mitarbeiter temp;
			while((temp = (Mitarbeiter) ois.readObject()) != null)
			{
				col.add(temp);
			}
			
			
		}catch(Exception e) {
			//e.printStackTrace();
		}
		
		List<Mitarbeiter> list = new ArrayList<>();
		for(Mitarbeiter m : col) {
			System.out.println(m);
			list.add(m);
		}
		
		class VergleichPersonalNummer implements Comparator<Mitarbeiter>{

			@Override
			public int compare(Mitarbeiter m1, Mitarbeiter m2) {
				return Integer.compare(m1.nummer, m2.nummer);
			}
			
		}
		
		VergleichPersonalNummer comp = new VergleichPersonalNummer();
		Collections.sort(list, comp);
		for(Mitarbeiter m : list) System.out.println(m);
		
	}
	
	
	
	
}
