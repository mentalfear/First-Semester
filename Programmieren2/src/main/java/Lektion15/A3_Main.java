package Lektion15;

public class A3_Main {
	
	public static void main(String[] args) {
		
		A3_Quizfragen[] fragebogen = new A3_Quizfragen[5];
		
		fragebogen[0] = new A3_Textfrage("Wie wird die kleinste digitale Informationseinheit bezeichnet?");
		fragebogen[1] = new A3_MultipleChoiceFrage("Wer erfand den ersten funktionsfähig programmierbaren Computer der Welt?", 
				"Konrad Zuse", "Thomas Alva Edison", "Steve Jobs", "Bill Gates");
		fragebogen[2] = new A3_MultipleChoiceFrage("Wann stellte Apple den ersten Macintosh vor?", "1984", "2001", "1992", "1972");
		fragebogen[3] = new A3_Textfrage("Wie wird ein infizierter Programmcode noch bezeichnet?");
		fragebogen[4] = new A3_Textfrage("Wie viele Bit hat ein Byte?");
		
		
		for(int i = 0; i < fragebogen.length; i++) {
			System.out.print(fragebogen[i]);
		}
	}

}
