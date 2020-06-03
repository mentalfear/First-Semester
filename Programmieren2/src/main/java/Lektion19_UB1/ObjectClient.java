package Lektion19_UB1;

import java.net.Socket;
import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.*;


public class ObjectClient {

	public static void main(String[] args) {
		final int PORT = 5000;
		final String HOST = "localhost";
		
		try(Socket connection = new Socket(HOST, PORT);
				InputStream is = connection.getInputStream();
				OutputStream os = connection.getOutputStream();				
				ObjectOutputStream oos = new ObjectOutputStream(os);
				ObjectInputStream ois = new ObjectInputStream(is); // ACHTUNG! Erst oos
				Scanner scanner = new Scanner(System.in);
				)
		{
			System.out.println("Client gestartet!");
			
			Message startmsg = (Message) ois.readObject();
			System.out.println(startmsg.message);
			
			while (true) {
				// Eingabe
				String eingabe = scanner.nextLine();
				
				// Schreiben
				Message msg = new Message(eingabe);
				oos.writeObject(msg);
				oos.flush();
				
				// Lesen
				Message msg_respond = (Message) ois.readObject();
				System.out.println(msg_respond.message);
				if(msg_respond.erraten) break;
			}
			
			// schließen
			System.out.println("\nAlles wird geschlossen (Client)");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
