package SS14;

public class Liste
{

	private Knoten start;
	
	public Liste() {
		start = null;
	}
	
	public void insert(Knoten k) {
		if(start == null) {
			start = k;
		}else {
			insert(start, k);
		}
	}
	
	public void insert(Knoten start, Knoten k) {
		Knoten temp = start;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(k);
		
	}
	
	public void delete(int position) {
		Knoten oldtemp = start;
		Knoten temp = start.getNext();
		
		if(position == 1) {
			start = temp.getNext();
		}
		
		for (int i = 2; i < position; i++) {
			oldtemp = temp;
			temp = temp.getNext();
		}
		
		oldtemp.setNext(temp.getNext());
	}
	
	public void ausgabe() {
		Knoten temp = start;
		
		while(temp != null) {
			System.out.println(temp.getName());
			temp = temp.getNext();
		}
		
		
	}
}
