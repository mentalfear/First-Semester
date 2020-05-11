package Lektion15;

public class A3_MultipleChoiceFrage extends A3_Quizfragen{

	private String[] antwort;
	
	public A3_MultipleChoiceFrage(String frage, String...antwort) {
		super(frage);
		this.antwort = antwort;
		
	}

	@Override
	public String gibAntwort() {
		String out = "";
		char antMoeg = 'A';
		for(int i = 0; i < antwort.length; i++) {
			out += Character.toString(antMoeg+i) + ": " + antwort[i] + "\n";
		}
		
		return out;
	}

}
