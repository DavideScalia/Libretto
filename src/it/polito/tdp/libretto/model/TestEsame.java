package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestEsame {

	public static void main(String[] args) {
		Esame tdp= new Esame("03FYZ", "Tecniche di Programmazione", "Fulvio Corno") ;
		System.out.println(tdp);
		Esame ami = new Esame("01QZP", "Ambient Intelligence", "Fulvio corno") ;
		System.out.println(ami);
		System.out.println(ami.equals(tdp)); //vedo se percaso li considera uguali 
		
		tdp.supera(30, LocalDate.now());
		System.out.println(tdp);
		tdp.supera(18, LocalDate.now());// mi dice che gi� � stato superato quindi bisogna mettere un try catch 
	}

}