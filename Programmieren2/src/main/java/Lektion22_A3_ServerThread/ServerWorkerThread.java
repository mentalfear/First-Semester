package Lektion22_A3_ServerThread;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class ServerWorkerThread extends Thread {

	ObjectInputStream ois;
	ObjectOutputStream oos;
	Socket connection;
	Primzahlen p1;

	public ServerWorkerThread(Socket connection, ObjectInputStream ois, ObjectOutputStream oos) {
		this.connection = connection;
		this.ois = ois;
		this.oos = oos;
	
	}

	@Override
	public void run() {
		try {
			System.out.println("Server gestartet!");

			p1 = (Primzahlen) ois.readObject();

			// Berechnung
			for (Integer num : p1.arr) {
				boolean isPrim = testeObPrimzahl(num);
				p1.map.put(num, isPrim);
			}

			oos.writeObject(p1);
			oos.flush();
			System.out.println("Server geschlossen!");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			this.ois.close();
			this.oos.close();
			this.connection.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private boolean testeObPrimzahl(int num) {
		if (num < 2)
			return false;
		for (int divisor = 2; divisor < num; divisor++) {
			if (num % divisor == 0)
				return false;
		}
		return true;
	}

}
