package Lektion20_UB12;

import java.util.HashSet;



public class Hand<E> extends HashSet<E>{

	private static final long serialVersionUID = 1L;
	
	int maxKarten;
	
	public Hand(int maxKarten) {
		this.maxKarten = maxKarten;
	}
	
	public boolean isHandVoll() {
		if(this.size() >= maxKarten) return true;
		return false;
	}
	
	public void zurHand(E e) {
		if(this.size() <= maxKarten) this.add(e);
	}
	
	public void ausspielen(E e) {
		this.remove(e);
	}
	

	
	
}
