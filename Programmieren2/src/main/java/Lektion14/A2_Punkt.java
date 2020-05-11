package Lektion14;

public class A2_Punkt {

	int x;
	int y;
	


	public void verschiebePunkt(int zielX, int zielY) {
		if(zielX < 0 || zielY < 0) throw new RuntimeException("Koordinate negative");
		else if(zielX > 1920) throw new RuntimeException("X-Koordinate zu groß");
		else if(zielY > 1080) throw new RuntimeException("Y-Koordinate zu groß");
			
		x = zielX;
		y = zielY;		
	}

}
