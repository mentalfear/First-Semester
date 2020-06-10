package Lektion21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class A4_Exam {

	ArrayList<A4_Question> questions = new ArrayList<>();

	public void readQuestions(String file) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		do {
			line = br.readLine();
			if (line != null)
				questions.add(A4_Question.toQuestion(line));
		} while (line != null);
		br.close();
	}

	void toTest() throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter("test.tex"));
		String header = readHeaderFromFile();
		bw.write(header);

		// Fragen schreiben
		for (A4_Question quest : questions) {
			String line = "\\textbf{";
			line += quest.text;
			line += "}\\\\ \n";
			bw.write(line);
		}

		bw.write("\\end{document}");
		bw.flush();

	}

	public String readHeaderFromFile() {
		try (BufferedReader br = new BufferedReader(new FileReader("header"));) {
			String header = "";
			String s;
			do {
				s = br.readLine();
				if (s != null)
					header += s + "\n";
			} while (s != null);

			return header;
		} catch (IOException e) {
			System.out.println("Header konnte nicht gefunden werden!");
			return "";
		}
	}

}
