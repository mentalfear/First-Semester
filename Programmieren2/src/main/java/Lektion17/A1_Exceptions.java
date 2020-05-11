package Lektion17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A1_Exceptions {

	public static void main(String[] args) throws FileNotFoundException {

//		NumberFormatException();
//		ArrayException();
//		NullPointer();
//		OutOfMemoryError();
//		FileNotFound();
		ArithmeticException();

	}

	public static void NumberFormatException() {
		String s = "Hallo";
		int i = Integer.parseInt(s, 0);
	}

	public static void ArrayException() {
		int[] zahl = new int[2];
		zahl[2] = 2;
	}

	public static void NullPointer() {
		Object obj = null;
		obj.hashCode();
	}

	public static void OutOfMemoryError() {
		int[] zahl = new int[1024];
		OutOfMemoryError();
	}

	public static void FileNotFound() throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("pic.jpg");
	}

	public static void ArithmeticException() {
		int i = 10/0;
	}
}
