package org.adecco.models.impl;

import java.util.List;

import org.adecco.models.abstr.Immobile;
import org.adecco.models.interf.Stimabile;

//Ragione sociale
//Citta 
//Lista immobili
//stampa dettagli agenzia
//stampa lista immobili 


public class Agenzia {
	
	public String ragioneSociale;
	public String citta;
	public List<Immobile> listaImm;
	
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public List<Immobile> getListaImm() {
		return listaImm;
	}
	public void setListaImm(List<Immobile> listaImm) {
		this.listaImm = listaImm;
	}
	
	public Agenzia() {
		super();
	}
	
	public Agenzia(String ragioneSociale, String citta, List<Immobile> listaImm) {
		super();
		this.ragioneSociale = ragioneSociale;
		this.citta = citta;
		this.listaImm = listaImm;
	}
	
	@Override
	public String toString() {
		return "Agenzia [ragioneSociale=" + ragioneSociale + ", citta=" + citta + ", listaImmobili =\n" + listaImm + "]\n";
	}
	
	//devo inserire stampaStimabili
	//lista di immobili, devo riconsoscere se è stimabile o meno. Con l'istance of , se
	
	
	public void valutazione(List<Immobile> listaImm) {
		
		for (Immobile immobile : listaImm) {
			
			if(immobile instanceof Stimabile) {
				//((Stimabile)immobile).stampaStima();
				((Stimabile) immobile).stampaStima();
			}
		}
		
	}
	
	
	
	
	

}
