package Lektion18;

import java.io.IOException;
import java.io.Writer;

public class A3_ToUpperCaseWriter extends A3_DecoraterWriter{


	public A3_ToUpperCaseWriter(Writer writer) {
		super(writer);
		// TODO Auto-generated constructor stub
	}

	public void write(char c) throws IOException {
		writer.write(Character.toUpperCase(c));
	}
	
	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		for(int i = 0; i < cbuf.length; i++) {
			this.write(cbuf[i]);
		}
	}

	@Override
	public void flush() throws IOException {
		writer.flush();
		
	}

	@Override
	public void close() throws IOException {
		writer.close();
	}

	



}
