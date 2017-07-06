package it.polito.tdp.libretto.model;

import java.util.*;

public class Model {
	
	private List<Esame> esami; //deve gestire una lista di esami 
	
	public Model(){
		this.esami = new ArrayList<Esame>();
	}
	/**
	 * 
	 * aggiunge un nuovo esame all'elenco degli esami presenti,
	 * verificando che non ci sia già
	 * 
	 */
	public boolean addEsame(Esame e){ //posso anche usare un boolean true/false non conviene void potrebbe crashare
		if(!esami.contains(e)){	//verifico che la lista non contenga l'elemento
				esami.add(e);
	 			return true;
		        }else{
		 			return false;
				}
			}
	
	/**
	 * Ricerca se esiste un esame con il codice specificato 
	 * se esiste, lo restituisce, altrimenti restituisce null
	 * 
	 * @param codice codice dell'esame da ricercare
	 * @return l'esame trovato, oppure null se non trovato
	 */
	public Esame trovaEsame(String codice){ // come faccio a trovare un oggetto in una lista?
		int pos = esami.indexOf( new Esame(codice, null, null) );//creo un oggetto dello stesso tipo che sto cercando, cosi posso usare l'indexof 
		if(pos == -1){
			return null;
		}else{
			return esami.get(pos);
	    }
		
	
		
	}

}
