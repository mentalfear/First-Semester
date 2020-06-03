package Lektion19_UB3;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class Browser {

	// old back
//	public URL back() {
//		try {
//			// simulate: fetch last URL from Stack
//			return Math.random() < 0.5 ? new URL("http://google.de") : null;
//		} catch (MalformedURLException e) {
//			return null;
//		}
//	}

	// new back methode
	public Optional<URL> back() {
		Optional<URL> res = Optional.empty();
		
		try {
			if (Math.random() < 0.5) {
				res = Optional.of(new URL("http://google.de"));
			}
		} catch (MalformedURLException e) {
			
		}
		return res;
	}

	public String retrieveSite(Optional<URL> back) {
		// simulate download site:
		return back.toString();
	}

	public static void main(String[] args) {
		System.out.println("Normal back");
		Browser browser = new Browser();
		Optional<URL> back = browser.back();
		String s = browser.retrieveSite(back);
	}

}
