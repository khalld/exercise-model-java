package org.adecco.models.impl;

import org.adecco.models.abstr.Immobile;
import org.adecco.models.interf.Stimabile;

public class Appartamento extends Immobile{
	
	public int mqBalcone;

	public int getMqBalcone() {
		return mqBalcone;
	}

	public void setMqBalcone(int mqBalcone) {
		this.mqBalcone = mqBalcone;
	}

	
	
	
	public Appartamento(String nomeProprietario, int metriQ, int prezzo, boolean affittabile, boolean vendibile, int mqBalcone) {
		super(nomeProprietario, metriQ, prezzo, affittabile, vendibile);
		this.mqBalcone = mqBalcone;
	}

	public Appartamento() {
		super();
	}

	@Override
	public String toString() {
		return "\nAppartamento [mqBalcone=" + mqBalcone + ", nomeProprietario=" + nomeProprietario + ", metriQ=" + metriQ
				+ ", prezzo=" + prezzo + ", affittabile=" + affittabile + ", vendibile=" + vendibile + "]";
	}

//	@Override
//	public int stima() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void stampaStima() {
//		if(stima() == 0)
//			System.out.println("La stima non e' disponibile");
//		System.out.println("La stima e': " + stima());
//	}



	
}
