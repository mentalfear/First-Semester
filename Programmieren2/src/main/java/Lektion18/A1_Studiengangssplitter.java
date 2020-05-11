package Lektion18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class A1_Studiengangssplitter {
	
	public static void main(String[] args) {
		
		splitStudiengaenge("MarNr.txt");
		
	}
	
	public static void splitStudiengaenge(String dateiname) {
		
		try(BufferedReader br = new BufferedReader(new FileReader(dateiname));
				BufferedWriter bwWInf = new BufferedWriter(new FileWriter("WinfNr.txt"));
				BufferedWriter bwInf = new BufferedWriter(new FileWriter("InfNr.txt"));
				BufferedWriter bwEC = new BufferedWriter(new FileWriter("ECNr.txt"));){
			
			do {
				String line = br.readLine();
				if(line == null) break;
				int intline = Integer.parseInt(line);
				if(intline >= 5000000 && intline < 5100000) bwWInf.write(line+ "\n");
				else if(intline >= 5100000 && intline < 5200000) bwInf.write(line+"\n");
				else if(intline >= 6100000 && intline < 6200000) bwEC.write(line+"\n");
				else {
					throw new MartrikelNummerException();
				}
			}while(true);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

class MartrikelNummerException extends Exception{
	
	MartrikelNummerException() {
		super("Matrikelnummer fehlerhaft");
	}
	
}
