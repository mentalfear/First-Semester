package Lektion14;

public class A3_Person {
	
	String vorname;
	String nachname;
	A3_Adresse addr;
	
	public A3_Person(String vorname, String nachname, A3_Adresse adr) {
		char firstVorname = vorname.charAt(0);
		
		
		if(Character.isLowerCase(firstVorname)) throw new RuntimeException("Vorname");
		if(Character.isLowerCase(adr.strasse.charAt(0))) throw new RuntimeException("Straße");
		if(Character.isLowerCase(adr.ort.charAt(0))) throw new RuntimeException("Ort");
		if(!Character.isDigit(adr.hausnummer.charAt(0))) throw new RuntimeException("Hausnummer");
		
		this.vorname = vorname;
		this.nachname = nachname;
		this.addr = adr;
	}

}
