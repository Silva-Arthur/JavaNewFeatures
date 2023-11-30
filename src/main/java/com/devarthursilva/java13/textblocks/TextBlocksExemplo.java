package com.devarthursilva.java13.textblocks;

public class TextBlocksExemplo {

	public static void main(String[] args) {
		/**
		 * 
		 * TextBlocks cria uma nova forma de concatenação
		 * 
		 * */
		
		//forma antiga
		String text = "Olá Mundo!\n" + "Este é o módulo\n" + "Java 13";
		System.out.println(text);
		
		System.out.println("======================");
		
		//forma com text blocks, mas não é aplicável a string de uma unica linha
		text =
			"""
			Olá Mundo!
			Este é o módulo
			Java 13
			Arthur Silva
			""";
		System.out.println(text);
	}
}
