package Lektion16_UB2;

public class BetterChangeCalculator implements ChangeCalculator {

	@Override
	public int[] getChange(int euros, int cent) {

		int[] ruckgabe = new int[] { 0, // 0: alles in 1-Cent-Muenzen
				0, // 1: keine 2-Cent-Muenzen
				0, // 2 keine 5-Cent-Muenzen
				0, // 3 keine 10-Cent-Muenzen
				0, // 4 keine 20-Cent-Muenzen
				0, // 5 keine 50-Cent-Muenzen
				0, // 6 keine 1-Euro-Muenzen
				0 // 7 keine 2-Euro-Muenzen
		};

//		while (euros > 0) {
//			if (euros >= 2) {
//				ruckgabe[7] += 1;
//				euros -= 2;
//				continue;
//			}
//			if (euros >= 1) {
//				ruckgabe[6] += 1;
//				euros -= 1;
//				continue;
//			}
//		}

		int nCent = euros * 100 + cent;
		Coin[] c = Coin.values();
		int counter = c.length-1;

		while (nCent > 0) {
			if (nCent >= c[counter].value) {
				ruckgabe[counter] += 1;
				nCent -= c[counter].value;
			} else {
				counter--;

			}

		}

		return ruckgabe;
	}

}
