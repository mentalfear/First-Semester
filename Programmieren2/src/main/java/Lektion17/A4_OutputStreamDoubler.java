package Lektion17;

import java.io.IOException;
import java.io.OutputStream;

public class A4_OutputStreamDoubler {

	OutputStream fosOne = null; 
	OutputStream fosTwo = null; 
	
	
	public A4_OutputStreamDoubler(OutputStream fosOne, OutputStream fosTwo) throws IOException {
		
		this.fosOne = fosOne;
		this.fosTwo = fosTwo;
	}
	
	public void close() throws IOException {
		fosOne.close();
		fosTwo.close();
	}
	
	public void write(int b) throws IOException {
		boolean werfeException = false;
		
		try {
			fosOne.write(b);
		}catch (Exception e) {
			werfeException = true;
		}
		
		try {
			fosTwo.write(b);
		}catch (Exception e) {
			werfeException = true;
		}
		
		if(werfeException) new IOException();
		
	}
	
}
