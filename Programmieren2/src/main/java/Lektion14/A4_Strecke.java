package Lektion14;

public class A4_Strecke {
	
	public int a;
	public int b;
	
	public A4_Strecke(int a, int b) {
	
		if(a < b) {
			this.a = a;
			this.b = b;
		}else {
			this.a = b;
			this.b = a;
		}
	}
	
	public static boolean überschneidung(A4_Strecke str1, A4_Strecke str2) {
		if(str1.b <= str2.a) return false;
		if(str2.b <= str1.a) return false;
		return true;
	}
	
	@Override
	public String toString() {
		String out = "";
		if(a == b) return out + a;
		
		out += a;
		for(int i = a; i < b; i++) {
			out += "-";
		}
		out += b;
		return out;
	}

}
