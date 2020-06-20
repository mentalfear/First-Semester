package Lektion22_A3_ServerThread;

import java.util.ArrayList;

public class ClientMain {
	
	public static void main(String[] args) {
		
		Client c1 = new Client(5000, "localhost", 100);
		Client c2 = new Client(5000, "localhost", 100);
		c1.run();
		c2.run();
		try{
			c1.join();
			System.out.println("Client 1: \n" + c1.p1);
			System.out.println("Client 2: \n" + c2.p1);
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	

}
