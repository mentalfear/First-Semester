package Lektion17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class A3_MusikdateiBuffered {
	
	static BufferedInputStream fis = null;
	static BufferedOutputStream fos = null;
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Gibe den Path ein:");
			String path = scanner.nextLine();
			//System.out.println(path);
			try
			{
				fis = new BufferedInputStream(new FileInputStream(path));
				fos = new BufferedOutputStream(new FileOutputStream("copy.mp3"));
			} catch (Exception e) {
				System.out.println("Ungültig! Versuche es nochmal: ");
				
			} 
			
		}while(fis == null);
		
		
		//Copy gebuffert
		try {
			long startTime = System.currentTimeMillis();
			
			for(int i = 0; i < 100; i++) {
				copy(fis, fos);
			}
			
			
			long endTime = System.currentTimeMillis();
			long durationCopyArray = endTime - startTime;
		
			System.out.println(durationCopyArray);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//Schließen der Streams
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scanner.close();
	}
	
	public static void copy(BufferedInputStream bis, BufferedOutputStream bos) throws IOException {
		int i;
		do {
			i = bis.read();
			if(i != -1) bos.write(i);
		} while(i != -1);
	}

}
