package Lektion13;

public class Punkt
{
	double[] points;
	
	public Punkt(double...ds) {
		this.points = ds;
	}
	
	public double berechneAbstand() {
		double result = 0;
		
		for(int i = 0; i < points.length; i++) {
			result += Math.pow(points[i],2);
		}
		result = Math.sqrt(result);
		
		return result;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		for (int i = 0; i < points.length; i++) {
			result += "a"+i+"="+points[i];
			if(i != points.length -1) result += ",";
		}
		
		return result;
	}

}
