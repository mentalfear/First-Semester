package Lektion20_UB12;

import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//generierung des MauMau Decks
		String[] farbe = {"Karo","Herz","Pik","Kreuz"};  
		String[] werte = {"7","8","9","10","Bube","Dame","König","Ass"};
		
		Deck<MauMau> mauDeck = new Deck<MauMau>();
		
		for(int i = 0; i < farbe.length; i++) {
			for (int j = 0; j < werte.length; j++) {
				mauDeck.add(new MauMau(farbe[i], werte[j]));
			}
		}
		
		//Generierung der Hand
		Hand<MauMau> hand = new Hand<>(5);
		int durchlauf = 0;
		while(!hand.isHandVoll()) {
			durchlauf++;
			
			int randZahl = (int) (Math.random()*mauDeck.size());
			hand.add(mauDeck.get(randZahl));
		}
		
		//Ausgabe der Hand und durchläufe der While Schleife
		System.out.println("While-Schleife ist " + durchlauf + " durchgelaufen.");
		System.out.println("Handkarten:");
		for (MauMau mau : hand) {
			System.out.println(mau);
		}
		
		//Deck nach gewichtung sortieren
		System.out.println("sortieres Deck:");
		Collections.sort(mauDeck);
		for (MauMau mau : mauDeck) {
			System.out.println(mau);
		}
		
		
		
	}
	
}
