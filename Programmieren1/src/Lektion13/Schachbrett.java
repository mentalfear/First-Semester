package Lektion13;

public class Schachbrett
{
	
	boolean[][] brett = new boolean[7][8];
	
	public void setzeTurm(int x, int y) {
		
		for(int i = 0; i< brett.length; i++) {
			
			brett[i][y] = true;
		}
		for(int i = 0; i< brett[x].length; i++) {
			
			brett[x][i] = true;
		}
		
		
		
		
	}
	
	@Override
	public String toString() {
		String result = "";
		
		for(int i = 0; i<brett.length; i++) {
			for(int j = 0; j<brett[i].length; j++) {
				if(brett[i][j]) result += "x ";
				else result += "o ";
			}
			result += "\n";
		}
		
		return result;
	}

}
