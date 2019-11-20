package org.adecco.models.abstr;

public abstract class Immobile {
	
	public String nomeProprietario;
	public int metriQ;
	public int prezzo;
	public boolean affittabile; 
	public boolean vendibile; 

	public Immobile() {
		super();
	}

	public Immobile(String nomeProprietario, int metriQ, int prezzo, boolean affittabile, boolean vendibile) {
		super();
		this.nomeProprietario = nomeProprietario;
		this.metriQ = metriQ;
		this.prezzo = prezzo;
		this.affittabile = affittabile;
		this.vendibile = vendibile;
	}


	public String getNomeProprietario() {
		return nomeProprietario;
	}


	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}


	public int getMetriQ() {
		return metriQ;
	}


	public void setMetriQ(int metriQ) {
		this.metriQ = metriQ;
	}


	public int getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}


	public boolean isAffittabile() {
		return affittabile;
	}


	public void setAffittabile(boolean affittabile) {
		this.affittabile = affittabile;
	}


	public boolean isVendibile() {
		return vendibile;
	}


	public void setVendibile(boolean vendibile) {
		this.vendibile = vendibile;
	}

	//public abstract void stampaStima();

}
