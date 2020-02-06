package Lektion02;

import java.time.LocalTime;

public class Aufgabe3_Uhrzeit {
	
	public static void main(String[] args)
	{
		final int sekundenTag = 60*60*24;
		int stunden = 12;
		int minuten = 30;
		int sekunden = 0;
		boolean systemTime = true;
		LocalTime time = LocalTime.now();
		
		if (systemTime == true) {
			stunden = time.getHour();
			minuten = time.getMinute();
			sekunden = time.getSecond();
		}
		
		// Anzahl Sekunden seit Mitternacht
		int sekundenvergangen = sekunden + 60*minuten + 60*60*stunden;
		System.out.println(sekundenvergangen);
		
		// Anzahl Sekunden bis Mitternacht
		int sekundenBisMitternacht = sekundenTag - sekundenvergangen;
		System.out.println(sekundenBisMitternacht);
		
		//Prozent wie viel Prozent vom tag vorbei?
		float prozentVorbei = ((float)sekundenvergangen/sekundenTag * 100);
		System.out.println(prozentVorbei);
		
		
			
	}

}
