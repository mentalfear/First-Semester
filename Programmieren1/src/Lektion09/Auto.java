package Lektion09;

public class Auto {
	
	String marke;
	int ccm;
	String farbe;
	
	public Auto(String marke, int ccm, String farbe) {
	
		this.marke = marke;
		if (ccm > 0) this.ccm = ccm;
		else this.ccm = 1600;
		this.farbe = farbe; 
	}
	
	
	public void setHubraum (int ccm) {
		if (ccm > 0) this.ccm = ccm;
	}
	public int getHubraum () {
		return ccm;
	}

}
