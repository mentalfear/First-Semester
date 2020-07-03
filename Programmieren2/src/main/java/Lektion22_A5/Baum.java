package Lektion22_A5;

public class Baum<E extends Comparable<E>> {

	public static class Knoten<E> {
		Knoten<E> left;
		Knoten<E> right;
		E content;
		
		public Knoten(E content) {
			this.content = content;
		}
	}

	Knoten<E> root;

	public void einfuegen(E content) {
		Knoten<E> nKnoten = new Knoten(content);
		if(root == null) root = nKnoten;
		else einfuegen(nKnoten, root);
		
	}
	
	public void einfuegen(Knoten<E> k, Knoten<E> temp) {
		
		if(k.content.compareTo(temp.content) < 0) {
			if(temp.left == null) temp.left = k;
			else einfuegen(k, temp.left);
		}
		else {
			if(temp.right == null) temp.right = k;
			else einfuegen(k, temp.right);
		}
	}

	protected void traversiere(Visitor<E> visitor) {
		if (root == null)
			return;
		else
			traversiere(root, visitor);
	}

	protected void traversiere(Knoten<E> current, Visitor<E> visitor) {
		if (current.left != null)
			traversiere(current.left, visitor);
		visitor.visit(current);
		if (current.right != null)
			traversiere(current.right, visitor);
	}
	
	protected int size() {
		MyVisitor<E> v = new MyVisitor<>();
		this.traversiere(v);
		return v.anzahlKnoten;
	}
	
	public void print() {
		print(root);
	}
	
	public void print(Knoten<E> temp) {
		if(temp.left != null) print(temp.left);
		System.out.println(temp.content);
		if(temp.right != null) print(temp.right);
	}

}
