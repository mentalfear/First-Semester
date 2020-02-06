package Lektion10;

public class Uhr
{
	private int stunden = 12;
	private int minuten = 0;
	private int sekunden = 0;
	
	public Uhr(int stunden, int minuten, int sekunden) {
		if(vergleich(stunden, 0, 23) && vergleich(minuten, 0, 59) && vergleich(sekunden, 0, 59)) {
			this.stunden = stunden;
			this.minuten = minuten;
			this.sekunden = sekunden;
		}
		
	}
	
	private boolean vergleich(int wert, int untergrenze, int obergrenze) {
		if (wert >= untergrenze && wert<= obergrenze) return true;
		return false;
	}
	
	public int getStd() {
		return stunden;
	}
	
	public int getMin() {
		return minuten;
	}
	public int getSek() {
		return sekunden;
	}

	public void naechsteSek() {
		sekunden++;
		if (sekunden > 59) {
			sekunden = 0;
			minuten++;
		}
	}
	
}
