package Lektion20_UB12;


import java.util.ArrayList;

public class Deck<E> extends ArrayList<E> {

	private static final long serialVersionUID = 1L;

	int anzahlKarten = -1;

	public Deck() {
	}

	public Deck(int anzahlKarten) {
		this.anzahlKarten = anzahlKarten;
	}

	public void addCard(E card) {
		if (anzahlKarten != -1) {
			if (this.size() < anzahlKarten) this.add(card);
		}else {
			this.add(card);
		}
	}

	public void deleteCard(E card) {

		this.remove(card);

	}

}
