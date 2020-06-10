package Lektion21;

import java.io.IOException;

public class A4_Main {
	
	public static void main(String[] args) {
		try {
			A4_Exam exam = new A4_Exam();
			exam.readQuestions("questions.csv");
			exam.toTest();
			
			A4_Exam2 exam2 = new A4_Exam2.QuestionBuilder("questions.csv").build();
			exam2.toTest("Test2.tex");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
