package Lektion8;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Aufgabe4_Stringmethoden {
	
	public static void main(String[] args) throws IOException
	{
		String seite = "<body id=\"www-wikipedia-org\">"
				+ "<div class=\"central-textlogo\">"
				+ "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
				+ "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">"
				+ "</div>"
				+ "</body>";
		
		//img rausfinden
				
		String downloadUrl = ausschneiden(seite);
		
		System.out.println(downloadUrl);
		
		URL url = new URL(downloadUrl);
		BufferedImage image = ImageIO.read(url);
		ImageIO.write(image, "png", new File("bild.png"));
	}
	
	public static String ausschneiden(String seite)
	{
		int stelle = seite.indexOf("<img");
		seite = seite.substring(stelle);
		//Stelle von " finden
		stelle = seite.indexOf("\"");
		seite = seite.substring(stelle+1,12);
		//Ende finden
		int endstelle = seite.indexOf("\"");

		return seite.substring(0,endstelle);
	}

}
