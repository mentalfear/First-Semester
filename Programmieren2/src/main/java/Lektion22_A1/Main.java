package Lektion22_A1;

public class Main {
	
	public static void main(String[] args) {
		
	// Vererbung
		messageThread yinT = new messageThread("Yin");
		messageThread yangT = new messageThread("Yang");
		
		try {
			for(int i = 0; i < 3; i++) {
				yinT.run();
				yangT.run();
				messageThread.sleep(500);
							
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	//--------------------------------------------------------------------------------------	
	//lokale Klasse messageThread
		messageThread localyinT = new messageThread("Yin");
		messageThread localyangT = new messageThread("Yang");
		//localyinT.start(); //wird benötigt falls etwas in run() berechnet wird
		//localyangT.start();
		
		try {
			//localyinT.join(); // falls was berechnet wird, dann muss erst darauf gewartet werden
			//localyangT.join();
			for(int i = 0; i<3; i++) {
				System.out.println(localyinT.getMsg());
				System.out.println(localyangT.getMsg());
				Thread.sleep(500);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	//--------------------------------------------------------------------------------------	
	//Runnable-Interface
		messageRunnable yinR = new messageRunnable("Yin");
		messageRunnable yangR = new messageRunnable("Yang");
		Thread t1 = new Thread(yinR);
		Thread t2 = new Thread(yangR);
		
		try {
			for(int i=0; i<3; i++ ) {
				t1.run();
				t2.run();
				Thread.sleep(500);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	//--------------------------------------------------------------------------------------	
	//anonyme Klasse
		Thread anonymThread1 = new Thread() {
			@Override
			public void run() {
				System.out.println("Yin");
			}
		};
		Thread anonymThread2 = new Thread() {
			@Override
			public void run() {
				System.out.println("Yang");
			}
		};
		
		try {
			for(int i=0; i<3; i++ ) {
				anonymThread1.run();
				anonymThread2.run();
				Thread.sleep(500);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	

}
