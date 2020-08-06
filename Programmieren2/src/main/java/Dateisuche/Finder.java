package Dateisuche;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Finder {

	public BufferedReader getSystemInAsBufferedReader() {	
		return new BufferedReader(new InputStreamReader(System.in));
	}

	public void findStringInFiles(String searchString, String[] filenames) {
		for(String file : filenames) {
			try(BufferedReader br = new BufferedReader(new FileReader(file));)
			{
				int zeile = 0;
				String line;
				while((line = br.readLine()) != null) {
					if(line.contains(searchString)) 
						System.out.println("datei: " + file + "Zeile = " + zeile);
					zeile++;
				}
				
				
			}catch(FileNotFoundException e) {
				System.out.println("File: " + file+ " konnte nicht gerfunden werden");
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		Finder finder = new Finder();
		BufferedReader br = finder.getSystemInAsBufferedReader();
		String searchString = null;
		try {
			searchString = br.readLine();
			finder.findStringInFiles(searchString, args);
			br.close();
		} catch (IOException ex) {
			System.out.println("Einlesen fehlgeschlagen.");
		}
		
		//System.out.println(searchString);
		
	}

}
