package ss17;

public class Wort implements Comparable<Wort>{

	String wort, wortTyp, sprache;
	int laenge;
	
	public Wort(String wort) {
		this.wort = wort;
	}
	
	@Override
	public int compareTo(Wort o) {
		return this.wort.compareTo(o.wort);
	}
	
}
