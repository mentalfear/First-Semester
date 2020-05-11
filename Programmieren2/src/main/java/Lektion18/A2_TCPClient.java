package Lektion18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class A2_TCPClient {

	public static void main(String[] args) {

		final int PORT = 5000;
		final String HOST = "localhost";

		try (Socket connection = new Socket(HOST, PORT);
				InputStream is = connection.getInputStream();
				OutputStream os = connection.getOutputStream();
				A3_ToUpperCaseWriter writer = new A3_ToUpperCaseWriter(new OutputStreamWriter(os));
//				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				Scanner scanner = new Scanner(System.in);) {

			
			writer.write("Hallo Server !111!1!\n");
			writer.write("Hallo Server");
			writer.flush();
			//String ant = br.readLine();
			//System.out.println(ant);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
