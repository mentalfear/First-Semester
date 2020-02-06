package Lektion12;

public class Baum
{
	
	Knoten root;
	
	public void insert(Knoten k) {
		if(root == null) root = k;
		else insert(root, k);
		//print();
	}
	
	public void insert(Knoten temp, Knoten k) {
		
		if(k.wort.compareTo(temp.wort) < 0) {
			if(temp.left == null) {
				temp.left = k;
			}else {
				insert(temp.left, k);
			}
		}else {
			if(temp.right == null) {
				temp.right = k;
			}else {
				insert(temp.right, k);
			}			
		}		
	}
	
	public void print() {
			print(root);
	}
	
	public void print(Knoten temp) {
		if(temp.left != null) print(temp.left);
		System.out.println(temp.wort);
		if(temp.right != null) print(temp.right);
			
	}
	
	public String search(String w) {
		return search(root, w);
	}
	
	public String search(Knoten temp, String w) {

		if(temp!=null)System.out.println(temp.wort);
		if (temp == null) return null;
		else if (temp.wort.compareTo(w) == 0) return temp.bedeutung;
		else if (temp.wort.compareTo(w) >  0) return search(temp.left, w);
		else return search(temp.right, w);
		
	}
	
	public void delete(Knoten k) {
		if(root.wort.compareTo(k.wort) == 0) {
			
		}
		else if(k.wort.compareTo(root.wort) < 0) {
			delete(root.left, root,k, false);
		}else {
			delete(root.right, root, k, true);
		}
		
		
	}
	
	public void delete(Knoten temp, Knoten oldtemp, Knoten k, boolean right) {
		if(temp.wort.compareTo(k.wort) == 0) {
			if(right) oldtemp.right = temp.left;
			else oldtemp.left = temp.left;
			//temp.right.left = null;
			insert(temp.right);
		}
		else if(k.wort.compareTo(temp.wort) < 0) {
			delete(temp.left, temp,k, false);
		}else {
			delete(temp.right, temp, k, true);
		}
		
	}

}
