package com.devarthursilva.java12.string;

public class StringExemplo {

	public static void main(String[] args) {
		String texto = "Olá mundo!\nEste é o módulo do Java12.";
		
		/**
		 * indent()
		 * Adiciona 4 espaços em branco
		 * 
		 * */
		texto = texto.indent(4); 
		System.out.println(texto);
		
		//Remove um espaço em brancos
		texto = texto.indent(-1);
		System.out.println(texto);
		
		System.out.println("==========================");
		
		texto = "Olá mundo!\nEste é o módulo do Java12.";
		/**
		 * transform()
		 * 
		 * */
		var textoInvertido = texto.transform(s -> new StringBuilder(s).reverse().toString()); // reverte um texto
		System.out.println(textoInvertido);
	}
}
