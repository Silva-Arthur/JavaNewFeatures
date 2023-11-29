package com.devarthursilva.java11.variaveislocaisemlambda;

import java.util.function.Function;

public class VariaveisLocaisEmLambdaExemplo {
	
	public static void main(String[] args) {
		String variavel = "Arthur Silva Programador Java";
		
		Function<String, String> concatena = (var s) -> s + ". ";
	}
}
