package Lektion22_A3_ServerThread;

import java.net.Socket;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Client extends Thread{

	
	int PORT = 5000;
	String HOST = "localhost";
	Primzahlen p1;
	
	public Client(int PORT, String HOST, int sizeArr) {
		this.PORT = PORT;
		this.HOST = HOST;
		p1 = new Primzahlen();
	}

	public void run() {
		try (Socket connection = new Socket(HOST, PORT);
				OutputStream os = connection.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				InputStream is = connection.getInputStream();
				ObjectInputStream ois = new ObjectInputStream(is);
				
				
				) {

			oos.writeObject(p1);
			oos.flush();

			p1 = (Primzahlen) ois.readObject();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
