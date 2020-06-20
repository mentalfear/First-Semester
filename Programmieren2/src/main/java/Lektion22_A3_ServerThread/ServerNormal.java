package Lektion22_A3_ServerThread;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerNormal {
	private final static int PORT = 5000;
	static Primzahlen p1;

	public static void main(String[] args) {
		try(ServerSocket ss = new ServerSocket(PORT);
				Socket connection = ss.accept();
				OutputStream os = connection.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				InputStream is = connection.getInputStream();
				ObjectInputStream ois = new ObjectInputStream(is);
				
				){
			
			System.out.println("Server gestartet!");
			
			p1 = (Primzahlen) ois.readObject();
			
			//Berechnung
			for(Integer num : p1.arr) {
				boolean isPrim = testeObPrimzahl(num);
				p1.map.put(num, isPrim);
			}
			
			oos.writeObject(p1);
			oos.flush();
			System.out.println("Server geschlossen!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static boolean testeObPrimzahl(int num) {
		if (num < 2) return false;
		for(int divisor = 2; divisor < num; divisor++) {
			if(num % divisor == 0) return false;
		}
		return true;
	}
	
}
