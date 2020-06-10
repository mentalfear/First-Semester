package Lektion21;

public class Naehrstoffangaben {
	
	//verpflichtende Felder
	int portionGroesse;
	int anzahlPortionen;
	
	//freiwillige Felder
	int eiweiss;
	int fett;
	int kohlenhydrate;
	int natrium;
	
	private Naehrstoffangaben(int portionGroesse, int anzahlPortionen, int eiweiss, int fett, int kohlenhydrate, int natrium) {
		this.portionGroesse = portionGroesse;
		this.anzahlPortionen = anzahlPortionen;
		this.eiweiss = eiweiss;
		this.fett  = fett;
		this.kohlenhydrate = kohlenhydrate;
		this.natrium = natrium;
	}
	
	public static class NaehrstoffBuilder {
		
		//verpflichtende Felder
		int portionGroesse;
		int anzahlPortionen;
		
		//freiwillige Felder
		int eiweiss;
		int fett;
		int kohlenhydrate;
		int natrium;
		
		public NaehrstoffBuilder(int portionGroesse, int anzahlPortionen) {
			this.portionGroesse = portionGroesse;
			this.anzahlPortionen = anzahlPortionen;
		}
		
		public NaehrstoffBuilder eiweiss(int eiweiss) {
			this.eiweiss = eiweiss;
			return this;
		}
		
		public NaehrstoffBuilder fett(int fett) {
			this.fett = fett;
			return this;
		}
		
		public NaehrstoffBuilder kohlenhydrate(int kohlenhydrate) {
			this.kohlenhydrate = kohlenhydrate;
			return this;
		}
		
		public NaehrstoffBuilder natrium(int natrium) {
			this.natrium = natrium;
			return this;
		}
		
		public Naehrstoffangaben build() {
			return new Naehrstoffangaben(portionGroesse, anzahlPortionen, eiweiss, fett, kohlenhydrate, natrium);
		}
		
		
	}

}
