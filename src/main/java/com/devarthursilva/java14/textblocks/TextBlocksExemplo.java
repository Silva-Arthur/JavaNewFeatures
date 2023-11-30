package com.devarthursilva.java14.textblocks;

public class TextBlocksExemplo {
	
	public static void main(String[] args) {
		/**
		 * 
		 * Adiciona o \s para adioconar espaços entre as palavras
		 * Adiciona o \ para quebra linhas que sao escritas dentro das aspas triplas serem escritas como uma linha só
		 * 
		 * */
		String texto = 
				"""
				Olá\s\s\s Mundo!
				Este é o módulo Java 14. \
				\
				Dev Arthur Silva
				""";
		
		System.out.println(texto);
	}
}
