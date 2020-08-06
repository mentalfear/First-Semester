
public class ersetzePunkt {
	
	public static String ersetze(String name) {
		
		char[] cName = name.toCharArray();
		for(int i = 0; i<cName.length; i++) {
			
			if(cName[i] == ('.')) cName[i] = '_';
			
		}
		
		return String.valueOf(cName);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(ersetze("Hallo.Welt"));
		
	}
	
}
