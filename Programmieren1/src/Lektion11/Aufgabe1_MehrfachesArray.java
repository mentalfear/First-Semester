package Lektion11;

public class Aufgabe1_MehrfachesArray
{

	public static void main(String[] args) {
		
		double[][] arr = new double[][] {{1.1, 1.2, 1.4},{2.2, 2.5, 2.8}};
		
		double[] nArr = umwandlung(arr);
		
		for(int i = 0; i<nArr.length; i++) {
			System.out.println(nArr[i]);
		}
		
	}
	
	public static double[] umwandlung(double[][] oArray) {
		double[] nArray = new double[oArray.length];
		
		for(int i = 0; i<oArray.length;i++) {
			
			for(int j=0; j<oArray[i].length;j++) {
				
				if (nArray[i] < oArray[i][j]) {
					nArray[i] = oArray[i][j];
				}
				
			}
			
		}
		
		return nArray;
	}
	
}
