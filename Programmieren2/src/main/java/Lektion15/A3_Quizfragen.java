package Lektion15;

public abstract class A3_Quizfragen {

	String frage;

	public A3_Quizfragen(String frage) {
		super();
		this.frage = frage;
	}

	public String gibFrage() {

		return frage;

	};

	public abstract String gibAntwort();

	@Override
	public String toString() {
		String out = "Frage: \n";
		out += this.gibFrage() + "\n\nAntwort:\n";
		out += this.gibAntwort() + "\n";

		return out;

	};

}
