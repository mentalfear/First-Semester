package Lektion17;

import java.util.Scanner;

public class ExceptionI {

	public static void main(String[] args) {
		System.out.println("Die Zahl die du eingegeben hast ist " + readNumber());
	}

	public static int readNumber() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		do {
			try {

				String s = scanner.nextLine();
				int zahl = Integer.valueOf(s);
				return zahl;

			} catch (Exception e) {
				System.out.println("Gib eine ZAHL ein!");
			}

		} while (true);

	}

}
