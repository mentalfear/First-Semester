package Lektion15;

public class Wochentage {

	public static final String MONTAG = "Montag";
	public static final String DIENSTAG = "Dienstag";
	public static final String MITTWOCH = "Mittwoch";
	public static final String DONNERSTAG = "Donnerstag";
	public static final String FREITAG = "Freitag";
	public static final String SAMSTAG = "Samstag";
	public static final String SONNTAG = "Sonntag";
	public static final String[] wochentage = { MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG };

	public static String welcherWochentagIstInXTagen(String wochentag, int anzahlTage) {
		for (int i = 0; i < wochentage.length; i++) {
			if (wochentag.equals(wochentage[i])) //wochentage[i] == wochentag
				return wochentage[(i + anzahlTage) % 7];
		}
		return "fehlerhafterTag";
	}

	public static void main(String[] args) {
		System.out.println(welcherWochentagIstInXTagen(Wochentage.MONTAG, 10));
	}

}
