package Lektion13;

public class Rechteck
{
	
	int l�nge;
	int breite;
	
	public Rechteck(int l�nge, int breite)
	{
		super();
		this.l�nge = l�nge;
		this.breite = breite;
	}
	
	public int getL�nge()
	{
		return l�nge;
	}
	public void setL�nge(int l�nge)
	{
		this.l�nge = l�nge;
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
		return "Rechteck : \n Breite: " + breite + " L�nge: "+ l�nge;
	}

}
