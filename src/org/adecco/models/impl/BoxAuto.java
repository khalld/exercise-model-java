package org.adecco.models.impl;

import org.adecco.models.abstr.Immobile;
import org.adecco.models.interf.Stimabile;

public class BoxAuto extends Immobile {

	public int mqBox;

	public int getMqBox() {
		return mqBox;
	}

	public void setMqBox(int mqBox) {
		this.mqBox = mqBox;
	}

	

	public BoxAuto(String nomeProprietario, int metriQ, int prezzo, boolean affittabile, boolean vendibile, int mqBox) {
		super(nomeProprietario, metriQ, prezzo, affittabile, vendibile);
		this.mqBox = mqBox;
	}

	public BoxAuto() {
		super();
	}

	@Override
	public String toString() {
		return "\nBoxAuto [mqBox=" + mqBox + ", nomeProprietario=" + nomeProprietario + ", metriQ=" + metriQ + ", prezzo="
				+ prezzo + ", affittabile=" + affittabile + ", vendibile=" + vendibile + "]";
	}

//	@Override
//	public int stima() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void stampaStima() {
//		if(stima() == 0) {
//			System.out.println("La stima non e' disponibile");
//		}
//		System.out.println("La stima e': " + stima());
//	}
	
	

	
}
