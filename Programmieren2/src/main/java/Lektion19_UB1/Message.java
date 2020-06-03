package Lektion19_UB1;

import java.io.Serializable;

public class Message implements Serializable {
	
	String message;
	boolean erraten = false;
	
	
	public Message(String message) {
		this.message = message;
		
	}
	
}
