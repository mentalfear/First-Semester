package Lektion15;

public class A1_Abteilungsleiter extends A1_Angestellter {

	public A1_Abteilungsleiter(String vorname, String nachname, int id) {
		super(vorname, nachname, id);
		
		this.setGehaltsfaktor(2);
		
	}
	
	public void befoerdern(A1_Angestellter person) {
		
		person.setGehaltsfaktor(person.getGehaltsfaktor() + 0.1f);
		
	}
	
	

}
