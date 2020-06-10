package Lektion21;

public class A4_Question {
	
	String text;
	
	public A4_Question(String text) {
		this.text = text;
	}
	
	public static A4_Question toQuestion(String line) {
		A4_Question qest = new A4_Question(line);
		return qest;
	}

}
