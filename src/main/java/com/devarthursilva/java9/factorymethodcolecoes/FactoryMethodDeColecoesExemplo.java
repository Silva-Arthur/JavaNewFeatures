package com.devarthursilva.java9.factorymethodcolecoes;

import java.util.List;
import java.util.Set;

public class FactoryMethodDeColecoesExemplo {

	public static void main(String[] args) {
		// lista ordenada
		List<String> lista = List.of("Banana", "Maçã", "Pera");
		
		lista.forEach(s -> System.out.println(s));
		
		// lista sem ordenação definida
		Set<String> listaSet = Set.of("Banana", "Maçã", "Pera");
		
		listaSet.forEach(s -> System.out.println(s));
	}
}
