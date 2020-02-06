package WS1516;

public class Schlie�fach
{
	int nummer;
	boolean open;
	
	public Schlie�fach(int nummer, boolean open) {
		this.nummer = nummer;
		this.open = open;
	}
	
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	public int getNummer() {
		return nummer;
	}
	
	public boolean isOpen() {
		return open;
	}
	
	@Override
	public String toString() {
		if(open) return "o";
		else return "z";
	}

}
