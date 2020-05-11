package Lektion18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class A2_TCPServer {
	public static void main(String[] args) {

		final int PORT = 5000;

		try (ServerSocket ss = new ServerSocket(PORT);
				Socket connection = ss.accept();
				InputStream is = connection.getInputStream();
				OutputStream os = connection.getOutputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));) {
			
			String temp = br.readLine();
			System.out.println(temp);

			//os.write("OK".getBytes());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
