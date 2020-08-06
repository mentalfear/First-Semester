package KlausurAufgaben1;

import java.io.Serializable;

public class User implements Serializable, Comparable<User> {
	
	private String name;
	private String passwort;
	
	public User(String name, String passwort) {
		this.name = name;
		this.passwort = passwort;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPasswort() {
		return passwort;
	}
	
	@Override
	public int compareTo(User u) {
		return this.name.compareTo(u.name);
	}

}
