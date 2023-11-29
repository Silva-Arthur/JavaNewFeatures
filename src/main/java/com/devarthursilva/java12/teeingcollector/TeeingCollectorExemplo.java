package com.devarthursilva.java12.teeingcollector;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollectorExemplo {

	public static void main(String[] args) {
		
		//Collectors.teeing(soma, qtd, media);
		
		/**
		 * Obtém duas coleções e une elas em um resultado da união das duas collections principais
		 * 
		 * */
		double resultado = Stream.of(50, 10, 3, 19, 11, 22, 19).collect(
					Collectors.teeing(Collectors.summingDouble(i -> i), Collectors.counting(), (soma, qtd) -> soma / qtd)
		);
		
		System.out.println(resultado);
	}
}
