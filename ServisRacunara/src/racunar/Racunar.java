package racunar;

public class Racunar {
	
	String serijskiBroj;
	Double brzinaProcesora;
	String marka;
	
	public Racunar(String serijskiBroj, Double brzinaProcesora, String marka) {
		super();
		this.serijskiBroj = serijskiBroj;
		this.brzinaProcesora = brzinaProcesora;
		this.marka = marka;
				
	}

	public String getSerijskiBroj() {
		return serijskiBroj;
	}

	public void setSerijskiBroj(String serijskiBroj) {
		this.serijskiBroj = serijskiBroj;
	}

	public Double getBrzinaProcesora() {
		return brzinaProcesora;
	}

	public void setBrzinaProcesora(Double brzinaProcesora) {
		this.brzinaProcesora = brzinaProcesora;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	

}
