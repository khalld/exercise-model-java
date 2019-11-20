package org.adecco.models.impl;

import org.adecco.models.abstr.Immobile;
import org.adecco.models.interf.Stimabile;

public class Magazzino extends Immobile implements Stimabile{
	public int numPorte;

	public int getNumPorte() {
		return numPorte;
	}

	public void setNumPorte(int numPorte) {
		this.numPorte = numPorte;
	}


	public Magazzino(String nomeProprietario, int metriQ, int prezzo, boolean affittabile, boolean vendibile, int numPorte) {
		super(nomeProprietario, metriQ, prezzo, affittabile, vendibile);
		this.numPorte = numPorte;
	}

	public Magazzino() {
		super();
	}
	
	
	public void stampaDettagli() {
		System.out.println("L'immobile è un magazzino, nome propietario " + getNomeProprietario() + " mq: " +  getMetriQ() + " prezzo: " +  getPrezzo() + " prezzo: " + getNumPorte() + " ");
		System.out.println("E' vendibile: " + isVendibile() + " affittabile: " + isAffittabile() );
	}

	@Override
	public String toString() {
		return "\nMagazzino [numPorte=" + numPorte + ", nomeProprietario=" + nomeProprietario + ", metriQ=" + metriQ
				+ ", prezzo=" + prezzo + ", affittabile=" + affittabile + ", vendibile=" + vendibile + "]";
	}

	@Override
	public int stima() {
		int mq = getNumPorte();
		int tot = 0;
		for(int i = 0; i<=getNumPorte();i++) {
			tot+=1000;
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
