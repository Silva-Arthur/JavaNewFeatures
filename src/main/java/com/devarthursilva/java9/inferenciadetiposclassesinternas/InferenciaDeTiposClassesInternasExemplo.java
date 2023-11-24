package com.devarthursilva.java9.inferenciadetiposclassesinternas;

public class InferenciaDeTiposClassesInternasExemplo {

	public static void main(String[] args) {
		
		// Classe interna anonima                   nesse ultimo operador diamond, por inferencia de tipos, não é necessário declarar String no operador diamond
		SomaTudo<String> somaString = new SomaTudo<>() {
			
			@Override
			public String soma(String a, String b) {
				return a + b;
			}
		};
		
		System.out.println(somaString.soma("Olá ", "Mundo!"));
	}
}
