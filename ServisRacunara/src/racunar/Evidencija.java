package racunar;

import java.time.LocalDate;

public class Evidencija {
	
	private String vlasnikRacunara;
	private LocalDate datumPrijemaRacunara;
	private LocalDate datumZavrsetkaServisa;
	
	
	public Evidencija(String vlasnikRacunara, LocalDate datumPrijemaRacunara, LocalDate datumZavrsetkaServisa) {
		super();
		this.vlasnikRacunara = vlasnikRacunara;
		this.datumPrijemaRacunara = datumPrijemaRacunara;
		this.datumZavrsetkaServisa = datumZavrsetkaServisa;
	}

	public String getVlasnikRacunara() {
		return vlasnikRacunara;
	}

	public void setVlasnikRacunara(String vlasnikRacunara) {
		this.vlasnikRacunara = vlasnikRacunara;
	}

	public LocalDate getDatumPrijemaRacunara() {
		datumPrijemaRacunara = LocalDate.now();
;		return datumPrijemaRacunara;
	}

	public void setDatumPrijemaRacunara(LocalDate kadaJeRacunarPrimljen) {
		this.datumPrijemaRacunara = kadaJeRacunarPrimljen;
	}

	public LocalDate getDatumZavrsetkaServisa() {
//		datumZavrsetkaServisa = LocalDate.now();	treba dodati odredjen broj dana
		return datumZavrsetkaServisa;
	}

	public void setDatumZavrsetkaServisa(LocalDate vremePredajeRacunara) {
		this.datumZavrsetkaServisa = vremePredajeRacunara;
	}
	
	

}
