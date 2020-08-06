package Lektion15;

public enum Wochentag {
	Montag(1), Dienstag(2), Mittwoch(3), Donnerstag(4), Freitag(5), Samstag(6), Sonntag(7);
	
	int value;
	
	Wochentag(int value) {
		this.value = value;
	}

}
