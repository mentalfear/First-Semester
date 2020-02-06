package KlausurUebung;

public class Fahrstrecke
{
	Zielort root;
	
	public void einfuege(Zielort ort) {
		if(root == null) {
			root = ort;
		}else {
			insert(root, ort);
		}
	}
	
	public void insert(Zielort root, Zielort ort) {
		Zielort temp = root;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = ort;
		
	}
	
	public int gesamtStrecke() {
		int gesamteDistanz = 0;
		Zielort temp = root;
		while (temp != null) {
			gesamteDistanz += temp.getDistanz();
			temp = temp.next;
		}
		return gesamteDistanz;
	}
	
	public Zielort Ankunftsort() {
		Zielort temp = root;
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp;
	}

}
