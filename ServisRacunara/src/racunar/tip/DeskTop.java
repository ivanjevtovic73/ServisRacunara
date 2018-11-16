package racunar.tip;

import racunar.Racunar;

public class DeskTop extends Racunar {
	
	TipKucista tipKucista;
	
	public DeskTop(String serijskiBroj, Double brzinaProcesora, String marka, TipKucista tipKucista) {
		super(serijskiBroj, brzinaProcesora, marka);
		this.tipKucista = tipKucista;
	}

	public TipKucista getTipKucista() {
		return tipKucista;
	}

	public void setTipKucista(TipKucista tipKucista) {
		this.tipKucista = tipKucista;
	}
	
	

	


	
		
}
