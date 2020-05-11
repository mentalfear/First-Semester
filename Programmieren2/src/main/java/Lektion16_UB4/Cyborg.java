package Lektion16_UB4;

public class Cyborg implements Entscheider{

	Mensch mensch = new Mensch();
	Roboter roboter = new Roboter();
	
	@Override
	public int entschiede(int gefahrenNummer) {

		int entMensch = mensch.entschiede(gefahrenNummer);
		int entRoboter = roboter.entschiede(gefahrenNummer);
		
		if(entMensch == entRoboter) {
			return entMensch;
		}else {
			if((int) (Math.random()*2) < 1) {
				return entMensch;
			}else {
				return entRoboter;
			}
		}
		
	}
	
	

}
