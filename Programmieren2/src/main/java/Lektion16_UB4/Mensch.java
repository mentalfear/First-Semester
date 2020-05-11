package Lektion16_UB4;

public class Mensch implements Entscheider{

	@Override
	public int entschiede(int gefahrenNummer) {
		if((int) (Math.random()*4+1) > 3) return 4;
		return gefahrenNummer;
	}}
