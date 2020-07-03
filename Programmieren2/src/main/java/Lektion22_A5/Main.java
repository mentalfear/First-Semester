package Lektion22_A5;

public class Main {
	
	public static void main(String[] args) {
		Baum<String> b = new Baum<>();
		b.einfuegen("Aallo");
		b.einfuegen("Ballo");
		b.einfuegen("Callo");
		b.einfuegen("Dallo");
		b.einfuegen("Fallo");
		b.print();
		//eigene Implementierung von size
		MyVisitor<String> v = new MyVisitor<>();
		b.traversiere(v);
		System.out.println(v.anzahlKnoten);
		//Methode size im Baum
		System.out.println(b.size());
	}

}
