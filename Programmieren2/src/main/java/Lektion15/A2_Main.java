package Lektion15;

public class A2_Main {
	
	public static void main(String[] args) {
		
		A2_Person[] pArray = new A2_Person[100];
		
		for(int i = 0; i < 100; i=i+2) {
			pArray[i] = new A2_Student();
			pArray[i+1] = new A2_Professor();
		}
		
//		System.out.println(pArray[0].gibTaetigkeitAus());
		
		for(int i = 0; i < 100; i++) {
			System.out.println(pArray[i].gibTaetigkeitAus());
		};
		
	}

}
