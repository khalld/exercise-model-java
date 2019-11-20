package org.adecco.models.impl;

import org.adecco.models.abstr.Immobile;
import org.adecco.models.interf.Stimabile;

public class Villetta extends Immobile implements Stimabile {
	
	public int mqGiardino;

	public int getMqGiardino() {
		return mqGiardino;
	}

	public void setMqGiardino(int mqGiardino) {
		this.mqGiardino = mqGiardino;
	}

	public Villetta(String nomeProprietario, int metriQ, int prezzo, boolean affittabile, boolean vendibile, int mqGiardino) {
		super(nomeProprietario, metriQ, prezzo, affittabile, vendibile);
		this.mqGiardino = mqGiardino;
	}

	public Villetta() {
		super();
	}

	@Override
	public String toString() {
		return "\nVilletta [mqGiardino=" + mqGiardino + ", nomeProprietario=" + nomeProprietario + ", metriQ=" + metriQ
				+ ", prezzo=" + prezzo + ", affittabile=" + affittabile + ", vendibile=" + vendibile + "]";
	}

	@Override
	public int stima() {
		int mq = getMqGiardino();
		int tot = 0;
		for(int i = 0; i<=getMqGiardino();i++) {
			tot+=300;
		}
		return tot;
		
		
	}

	@Override
	public void stampaStima() {
		if(stima() == 0)
			System.out.println("La stima non e' disponibile");
		System.out.println("La stima e': " + stima());
	}


	
	
	

}
