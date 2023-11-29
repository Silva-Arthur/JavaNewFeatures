package com.devarthursilva.java10;

import java.util.List;

public class InferenciaDeTiposEmVariaveisLocaisExemplo {
	
	public static void main(String[] args) {
		
		var a1 = "Arthur Silva";
		
		String a2 = "Programador";
		
		System.out.println(a1 + " " + a2);
		
		System.out.println("==========");
		
		var listaDeFrutas = List.of("banana", "maçã", "abacaxi");
		
		//enhanced for
		for(var fruta : listaDeFrutas) {
			System.out.println(fruta);
		}
		
		System.out.println("==========");
		
		// for tradicional
		for(var i = 0; i < listaDeFrutas.size(); i++) {
			System.out.println(listaDeFrutas.get(i));
		}
	}
}
