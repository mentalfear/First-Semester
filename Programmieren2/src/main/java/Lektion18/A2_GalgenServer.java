package Lektion18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class A2_GalgenServer {

	final static int PORT = 5000;

	private static InputStream is;
	private static OutputStream os;
	private static BufferedReader br;
	private static String lsgWort;
	private static char[] wortChar;
	private static char[] lsg;
	
	private static int AnzahlMaxVersuche = 15;

	public static void main(String[] args) {
		try {

			// Initalisierung
			init();
			System.out.println("Init geglückt (Server)");
			System.out.println(lsgWort);

			int versuch = 0;
			boolean spielVorbei = false;
			
			while (!spielVorbei) {
				versuch++;
				
				// Lesen
				String client_respond = br.readLine();
				System.out.println(client_respond + " " + lsgWort);
				String outputText = comp(client_respond, versuch); // Vergleicht ob das ein Buchstabe Richtig ist
				spielVorbei = IsSpielVorbei(outputText);
				outputText += "\n";
				
				// Schreiben
				os.write(outputText.getBytes());
				os.flush();
				
			}
			//Was war das Wort?
			os.write(lsgWort.getBytes());
			os.flush();
			
			// Schließen
			System.out.println("\nAlles wird geschlossen (Server)");
			close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static boolean IsSpielVorbei(String text) {
		if(text.contains("Gewonnen") || text.contains("Verloren")) return true;
		return false;
	}
	
	private static String comp(String respond, int versuch) {
		if(respond.toUpperCase().contains(lsgWort)) return "Gewonnen";	// Wort erraten
		if(versuch > AnzahlMaxVersuche) return "Verloren"; // Zu oft geraten
		
		//Nur ein Buchstaben erraten
		boolean allesGewusst = true;
		char respond_char = respond.toUpperCase().charAt(0);
		for(int i = 0; i < wortChar.length ; i++) {
			if(respond_char == wortChar[i]) lsg[i] = respond_char;
			if(lsg[i] == '_') allesGewusst = false;
		}
		if(allesGewusst) return "Gewonnen";
		
		return String.valueOf(lsg);
	}
	
	
	public static void generateWord() {
		A2_Words[] wörter = A2_Words.values();
		int randNumber = (int) (Math.random() * wörter.length);
		lsgWort = wörter[randNumber].toString();

		wortChar = lsgWort.toCharArray();
		lsg = new char[wortChar.length];
		for (int i = 0; i < lsg.length; i++)
			lsg[i] = '_';
	}

	public static void close() throws IOException {
		is.close();
		os.close();
		br.close();
	}

	public static void init() throws IOException {
		// ServerSocket
		ServerSocket server = new ServerSocket(PORT); // Auf welchen PORT definieren
		Socket connection = server.accept(); // Auf ein Einwählen warten

		// Input Stream
		is = connection.getInputStream();
		br = new BufferedReader(new InputStreamReader(is));

		// Output Stream
		os = connection.getOutputStream();

		// Lösuingswort aussuchen
		generateWord();

	}

}
