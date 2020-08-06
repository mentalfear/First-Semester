package ss17;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class Main1 {

	public static boolean ibanCheck(String iban) throws Exception {
		if(iban.length() > 22) throw new FalscheIBANException("Die IBAN: " + iban + " ist zu lange");
		if(iban.length() < 22) throw new FalscheIBANException("Die IBAN: " + iban + " ist zu kurz");
		
		char[] cIban = iban.toCharArray();
		if(cIban[0] >= 'A' && cIban[0] <= 'Z') {
			if(cIban[1] >= 'A' && cIban[1] <= 'Z') return true;
		}else {
			throw new FalscheIBANException("Ländercode stimmt nicht");
		}

		return true;
	}
	
	public static void ibanAusDateiLesen(String datei) throws Exception {
		
		try(BufferedReader br = new BufferedReader(new FileReader(datei));) {
			String line = "ini";
			while(true) {
				line = br.readLine();
				if(line == null) break;
				System.out.println(line);
				ibanCheck(line);
			}
			
			
			
		}catch(FalscheIBANException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void dateienTest(String... dateien) {
		for(String str : dateien) {
			try {
				ibanAusDateiLesen(str);	
			}catch(Exception e) {
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		//ibanAusDateiLesen();
	}
	
}
