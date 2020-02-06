package Lektion12;

public class Liste
{
	
	Personenknoten start = null;
	
	public void setNewKnoten(String nachname, int alter) {
		Personenknoten knoten = new Personenknoten(nachname, alter);
		
		if(start == null) {
			start = knoten;
			return;
		}
		
		//vor dem startKnoten?
		if(knoten.getAlter() < start.getAlter()) {
			knoten.next = start;
			start.prev = knoten;
			start = knoten;
			return;
		}
		
		//danach irgendwann
		Personenknoten temp = start;
		while(temp.next != null) {
			
			if(knoten.getAlter() < temp.getAlter()) {
				temp.prev = knoten;
				knoten.prev = temp.prev;
				knoten.next = temp;
				temp.prev.next = knoten;
				break;
			}else {
				temp = temp.next;
			}
		}
		
		temp.next = knoten;
		knoten.prev = temp;

	}
	
	public Personenknoten searchPerson(String nachname) {
		Personenknoten temp = start;
		while(temp.next != null) {
			if(temp.getNachname() == nachname) {
				break;
			}else {
				temp = temp.next;
			}
		}
		
		return temp;	
	}
	
	public void listeDurchlaufen() {
		Personenknoten temp = start;
		boolean rückwärts = false;
		while(temp != null) {
			System.out.println(temp.getNachname());
			
			if(temp.next == null) {
				rückwärts = true;
			}
			
			if(rückwärts) {
				temp = temp.prev;
			}else {
				temp = temp.next;
			}
		}

	}

}
