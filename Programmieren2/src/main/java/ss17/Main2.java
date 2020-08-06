package ss17;

import java.util.Collection;

public class Main2 {

	public static void main(String[] args) {
		Wort und = new Wort("und");
		WortVorkommen woerter = new WortVorkommen();
		
		woerter.einfuegen(und, new Position(2,1));
		woerter.einfuegen(und, new Position(2,7));
		woerter.einfuegen(und, new Position(3,3));
		woerter.einfuegen(und, new Position(3,6));
		
		Collection<Position > allePos = woerter.holeAlle(und);
		for(Position pos : allePos) {
			System.out.println(pos.spalte);
		}
		
		Position letPos = woerter.holeLetzte(und);
		System.out.println(letPos.zeile);
				
		int  anzahlVorkommen = woerter.anzahlVorkommen(und);
		System.out.println(anzahlVorkommen);
	}
}
