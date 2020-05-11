package Lektion17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class A2_FileCopy {
	
	public static void main(String[] args) throws IOException {
		copyFileWithErrorHandling();
		
		String s = "Hallo Welt";
		byte[] b = s.getBytes();
		WriteCopy(b,0,b.length);
		
	}

	public static void copyFileWithErrorHandling() {
		InputStream fis = null;
		OutputStream fos = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\Matte\\OneDrive\\Studium\\Programmieren 2\\workspace\\UnitTest\\src\\main\\java\\Lektion17\\A2_Test.txt");
			fos = new FileOutputStream("A2_Test_Copy.txt");
			
			copyBinary(fis, fos);
//			copyArray(fis, fos, 8000);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				
			}
			try {
				fos.close();
			}catch (IOException e) {
				
			}
		}
		
	}
	
	public static void copyBinary(InputStream is, OutputStream os)  throws IOException{
		int b;
		do {
			b = is.read();
			if (b != -1) os.write(b);
		}while(b != -1);
		
	}
	
	public static void copyArray(InputStream is, OutputStream os, int ubertragung) throws IOException {
		byte[] b = new byte[ubertragung];
		int n;
		do {
			n = is.read(b);
			if(n != -1) os.write(b, 0, n);
		}while(n != -1);
		
	}
	
	public static void WriteCopy(byte[] b,int off, int len) throws IOException{
		try(OutputStream fos = new FileOutputStream("A2_Test_WriteCopy.txt");
		){
			fos.write(b,off,len);
		}
		
		
	}
}
