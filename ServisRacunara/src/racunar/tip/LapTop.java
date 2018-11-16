package racunar.tip;

import racunar.Racunar;

public class LapTop extends Racunar {
	
	String velicinaDispleja;

	public LapTop(String velicinaDispleja, Double brzinaProcesora, String marka) {
		super(velicinaDispleja, brzinaProcesora, marka);
		this.velicinaDispleja = velicinaDispleja;
	}

	public String getVelicinaDispleja() {
		return velicinaDispleja;
	}

	public void setVelicinaDispleja(String velicinaDispleja) {
		this.velicinaDispleja = velicinaDispleja;
	}
	
	

}
