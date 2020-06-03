package Lektion20_UB4;

import java.io.IOException;
import java.util.HashMap;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class SMS {

	static HashMap<String, Integer> map = new HashMap<>();

	public static void main(String[] args) {

		init();

		int ascii = 0;
		try (FileInputStream fis = new FileInputStream("Zeichenkontakte.txt");
				FileOutputStream fos = new FileOutputStream("Nummernkontakte.txt");) {

			do {
				ascii = fis.read();
				try {
					writeFile(fos, ascii);
				} catch (IllegalTelephoneNumberException e) {
					if (ascii == -1) System.out.println("Ende des Streams erreicht!");
					else System.out.println("Buchstaben " + (char) (ascii) + " ist ungültig");

				}

			} while (ascii != -1);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeFile(FileOutputStream fos, int ascii) throws IllegalTelephoneNumberException {

		try {
			int tastendruck = map.get(String.valueOf(ascii));
			fos.write(tastendruck);
		} catch (Exception e) {
			throw new IllegalTelephoneNumberException("Buchstabe illegal");
		}

	}

	public static void init() {

		// txt-File Zeichenkontakte erstellen
		try (FileWriter fos = new FileWriter("Zeichenkontakte.txt");) {
			String text = "FAKULTAET123ab";
			fos.write(text);
			fos.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

		// HashMap anlegen
		int taste = 50;
		for (int i = 'A'; i <= 'Z'; i++) {
			if (i == 'D' || i == 'G' || i == 'J' || i == 'M' || i == 'P' || i == 'T' || i == 'W')
				taste++;
			map.put(String.valueOf(i), taste);
		}

	}

}
