package Lektion22_A3_ServerThread;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		final int PORT = 5000;

		boolean isStopped = false;

		ServerSocket ss = new ServerSocket(PORT);

		System.out.println("Main-Server gestartet");

		while (!isStopped) {
			System.out.println("neue Anfrage?");
			Socket connection = null;

			try {
				connection = ss.accept();
				
				System.out.println("A new client is connected : " + connection); 
				
				OutputStream os = connection.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				InputStream is = connection.getInputStream();
				ObjectInputStream ois = new ObjectInputStream(is);
				
				ServerWorkerThread swt = new ServerWorkerThread(connection, ois, oos);
				swt.start();

				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		

	}

}
