package Lektion22;

import java.util.ArrayList;

public class A2_Main {

	final static int maxZahl = 10;
	final static int anzahlListen = 5;
	
	public static void main(String[] args) {
		//Liste mit Threads
		ArrayList<Thread> arrThread = new ArrayList<>();
		//füllen der Thread-Liste
		for(int i = 0; i<anzahlListen; i++) {
			arrThread.add(new A2_PrimzahlThread(erzeugeArray(i)));
		}
		//starten der Thread-Liste
		for(Thread t : arrThread) {
			t.start();
		}
		
		try {
			//warten bis alle Thread vorbei sind
			for(Thread t : arrThread) {
				t.join();
			}
			//Ergebnisse Sammeln und ausgeben
			String ergAll = "";
			for( Thread t : arrThread) {
				ergAll += t.toString();
			}
			System.out.print(ergAll);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static ArrayList<Integer> erzeugeArray(int anzahl) {
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < anzahl; i++) {
			int num = (int) (Math.random() * maxZahl);
			array.add(num);
		}
		return array;
	}

}
