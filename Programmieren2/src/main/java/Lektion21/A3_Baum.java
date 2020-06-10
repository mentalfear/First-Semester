package Lektion21;

public class A3_Baum {
	
	private static class Knoten {
		
		String name;
		Knoten left;
		Knoten right;
		
		public Knoten(String name) {
			this.name = name;
		}
		
	}
	
	Knoten root;
	
	public void insert(String name) {
		Knoten k = new Knoten(name);
		if(root == null) root = k;
		else insert(root,k);
	}
	
	public void insert(Knoten temp, Knoten k) {
		if(k.name.compareTo(temp.name) < 0) {
			if(temp.left == null) temp.left = k;
			else insert(temp.left, k);
		}else {
			if(temp.right == null) temp.right = k;
			else insert(temp.right, k);
		}
	}
	
	public void print() {
		print(root);
	}
	
	public void print(Knoten temp) {
		if(temp.left != null) print(temp.left);
		System.out.println(temp.name);
		if(temp.right != null) print(temp.right);
	}
	
	

}
