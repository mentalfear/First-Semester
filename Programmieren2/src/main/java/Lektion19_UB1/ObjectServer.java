package Lektion19_UB1;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;

public class ObjectServer {
	
	public static void main(String[] args) {
		final int PORT = 5000;
		final String HOST = "localhost";
		
		String lsgWort = "BADEMANTEL";
		
		try(ServerSocket ss = new ServerSocket(PORT);
				Socket connection = ss.accept();
				InputStream is = connection.getInputStream();
				ObjectInputStream ois = new ObjectInputStream(is);
				OutputStream os = connection.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				)
		{
			System.out.println("Server gestartet!");
			
			//Anfangsworte
			Message startmsg = new Message("Das Spiel beginnt - Gib dein erste Wort ein: ");
			oos.writeObject(startmsg);
			oos.flush();
			
			//Eigentliche Spiel
			int versuch = 0;
			
			while (true) {
				versuch++;
				
				// Lesen
				Message msg = (Message) ois.readObject();
				//Vergleichen
				if(msg.message.toUpperCase().equals(lsgWort)) {
					break;
				}
				
				// Schreiben
				Message respond = new Message("Leider nicht gewonnen. Versuche es mit einer anderen Wort:");
				oos.writeObject(respond);
				oos.flush();
			}
			
			//Gewonnen
			Message respond = new Message("Gewonnen!");
			respond.erraten = true;
			oos.writeObject(respond);
			oos.flush();
			
			// Schließen
			System.out.println("\nAlles wird geschlossen (Server)");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
