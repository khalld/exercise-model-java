package org.adecco.models.utils;

import java.util.LinkedList;
import java.util.List;

import org.adecco.models.abstr.Immobile;
import org.adecco.models.impl.Agenzia;
import org.adecco.models.impl.Appartamento;
import org.adecco.models.impl.BoxAuto;
import org.adecco.models.impl.Magazzino;
import org.adecco.models.impl.Villetta;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Immobile magazzino = new Magazzino("PAPERINO", 40, 4000, true, false, 22);
		Immobile villetta = new Villetta("TOPOLINO", 40, 4000, false, false, 6);
		Immobile appartamento = new Appartamento("PLUTO", 430, 4000, false, false, 2);
		Immobile boxauto = new BoxAuto("MINNIE",1,1,true,true,100);
//		System.out.println(magazzino.toString());
//		System.out.println(villetta.toString());
//		System.out.println(appartamento.toString());
		
		
		
		List<Immobile> patatino = new LinkedList<Immobile>();
		
		patatino.add(magazzino);
		patatino.add(villetta);
		patatino.add(appartamento);
		patatino.add(boxauto);
		
		Agenzia bastardiladri = new Agenzia("LADRI","BOLOGNA",patatino);
		
		System.out.println(bastardiladri.toString());
		
//		villetta.stampaStima();		//per farmelo vedere devo mettere public abstract void su immobile
//		//si de
//									//dopo me lo implemento con l'interfaccia stimabile, è corretto?
//		magazzino.stampaStima();	
//		boxauto.stampaStima();		//perché mi stampa la stima è 0? Non dovrebbe uscire direttamente dopo il controllo?
		
		//devo farmi l'istance of
		
		bastardiladri.valutazione(patatino);
	}

}
