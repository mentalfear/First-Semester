package Lektion17;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class A4_Main {

	
	
	
	public static void main(String[] args) {
	
		try(OutputStream fosOne = new FileOutputStream("Main1.txt");
			OutputStream fosTwo = new FileOutputStream("Main2.txt");)
		{
			String s = "Hallo Welt";
			byte[] by = s.getBytes();
			A4_OutputStreamDoubler osd = new A4_OutputStreamDoubler(fosOne ,fosTwo);
			int b;
			for(int i = 0; i < by.length; i++) {
				osd.write(by[i]);
			}
			
			
		}catch (Exception e){
			e.getStackTrace();
		}
		
	}
	
}
