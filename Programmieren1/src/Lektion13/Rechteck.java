package Lektion13;

public class Rechteck
{
	
	int länge;
	int breite;
	
	public Rechteck(int länge, int breite)
	{
		super();
		this.länge = länge;
		this.breite = breite;
	}
	
	public int getLänge()
	{
		return länge;
	}
	public void setLänge(int länge)
	{
		this.länge = länge;
	}
	public int getBreite()
	{
		return breite;
	}
	public void setBreite(int breite)
	{
		this.breite = breite;
	}
	
	@Override
	public String toString() {
		return "Rechteck : \n Breite: " + breite + " Länge: "+ länge;
	}

}
