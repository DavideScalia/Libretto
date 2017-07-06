package it.polito.tdp.libretto.model;

public class TestModel {
	
	public static void main(String[] args){
		Model m = new Model();
		
		m.addEsame(new Esame("03FYZ", "Tecniche di Programmazione", "Fulvio Corno"));
		m.addEsame(new Esame("01QZP", "Ambient Intelligence", "Fulvio corno"));
		m.addEsame(new Esame("03FYZ", "Tecniche di Programmazione", "Fulvio Corno"));//provo ad inserire due volte lo stesso esame 
		
		
		System.out.println(m.trovaEsame("03FYZ"));
		System.out.println(m.trovaEsame("01QZP"));
		System.out.println(m.trovaEsame("99ddd"));

	}

}
