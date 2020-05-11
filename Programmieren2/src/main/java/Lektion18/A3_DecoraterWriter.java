package Lektion18;

import java.io.IOException;
import java.io.Writer;

public abstract class A3_DecoraterWriter extends Writer{

	Writer writer;
	
	public A3_DecoraterWriter(Writer writer) {
		this.writer = writer;
	}

	public abstract void write(char c)throws IOException;

	@Override
	public abstract void write(char[] cbuf, int off, int len) throws IOException;

	@Override
	public abstract void flush() throws IOException;

	@Override
	public abstract void close() throws IOException;
	
	


}
