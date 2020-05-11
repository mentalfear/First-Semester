package Lektion18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class A2_GalgenClient {

	final static int PORT = 5000;
	final static String HOST = "localhost";

	static InputStream is;
	static OutputStream os;
	static BufferedReader br;
	static Scanner scanner;

	public static void main(String[] args) {
		try {
			// Initalisierung
			init();
			System.out.println("Init geglückt! (Client)");

			boolean spielVorbei = false;
			
			while (!spielVorbei) {
				// Eingabe
				System.out.println("Gebe dein Wort ein: ");
				String eingabe = scanner.nextLine();
				eingabe += " \n"; // Trick, da ein Leerzeichen drin ist muss kein if gemacht werden

				// Schreiben
				os.write(eingabe.getBytes());
				os.flush();

				// Lesen
				String server_respond = br.readLine();
				System.out.println(server_respond);
				spielVorbei = IsSpielVorbei(server_respond); // ist das Spiel vorbei?

			}
			//Was war das Wort?
			System.out.println("Das Wort war: " + br.readLine());
			
			// schließen
			System.out.println("\nAlles wird geschlossen (Client)");
			close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean IsSpielVorbei(String respond) {
		if(respond.contains("Gewonnen")) {
			System.out.printf("Glückwunsch sie haben das Wort erraten!\n");
			return true;
		}
		if(respond.contains("Verloren")) {
			System.out.printf("Glückwunsch, dass Männchen hängt wegen Ihnen!\n");
			return true;
		}
		return false;
		
	}

	public static void close() throws IOException {

		is.close();
		os.close();
		br.close();
		scanner.close();

	}

	public static void init() throws IOException {
		// Socket
		Socket connection = new Socket(HOST, PORT); // Einwählen auf den Server

		// Input Stream
		is = connection.getInputStream();
		br = new BufferedReader(new InputStreamReader(is));
		scanner = new Scanner(System.in);

		// Output Stream
		os = connection.getOutputStream();

	}

}
