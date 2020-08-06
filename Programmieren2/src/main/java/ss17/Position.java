package ss17;

public class Position implements Comparable<Position>{
	
	int zeile, spalte;
	
	public Position(int zeile, int spalte) {
		this.zeile = zeile;
		this.spalte = spalte;
	}
	
	@Override
	public int compareTo(Position pos) {
		if(this.zeile < pos.zeile) return -1;
		else if(this.zeile > pos.zeile) return 1;
		else {
			if(this.spalte < pos.spalte) return -1;
			else return 1;
		}
		
		
	}

}
