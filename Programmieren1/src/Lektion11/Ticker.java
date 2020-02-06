package Lektion11;

public class Ticker
{
	char[] nachricht;
	
	public Ticker(int laengeNachricht) {
		
		if(laengeNachricht <=0) {
			nachricht = new char[200];
		}else {
			nachricht = new char[laengeNachricht];
		}
		
		for(int i = 0; i<nachricht.length; i++) {
			nachricht[i] = ' ';
		}
		
	}
	
	public int getGroesse() {
		return nachricht.length;
	}
	
	public void setNachricht(char[] nachricht) {
		
		for(int i = 0; i<this.nachricht.length; i++) {
			if(nachricht.length > i) {
				this.nachricht[i] = nachricht[i];
			}else {
				this.nachricht[i] = '+';
			}
		}
		
	}
	
	public char[] getNachricht() {
		return nachricht;
	}
	
	public void resetNachricht(char zeichen) {
		for (int i = 0; i <nachricht.length; i++) {
			nachricht[i] = zeichen;
		}
	}
	
	public void resetNachricht() {
		for (int i = 0; i <nachricht.length; i++) {
			nachricht[i] = '+';
		}
	}
	
	public void rotateNachricht(int stellen) {
		
		char[] nNachricht = new char[nachricht.length];

		for(int i = 0; i < nachricht.length;i++) {
			if (i+stellen < nachricht.length) {
				nNachricht[i] = nachricht[i+stellen]; 
			}else {
				nNachricht[i] = nachricht[i+stellen - nachricht.length];
			}
		}
		
		nachricht = nNachricht;
		
	}

}
