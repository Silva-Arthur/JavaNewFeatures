package com.devarthursilva.java8.methodreferences;

import java.util.ArrayList;
import java.util.List;

public class ExemploReferenciaMetodoNaoEstatico {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<Produto>();

		lista.add(new Produto("TV 42'", 2000.00));
		lista.add(new Produto("Geladeira 470L", 3200.00));
		lista.add(new Produto("Fogão 4 bocas", 900.00));
		lista.add(new Produto("Videogame", 1999.00));
		lista.add(new Produto("Microondas", 500.00));

		// Method References, referencia de um objeto de intencia de uma classe arbritária
		lista.forEach(Produto::imprime);
	}
}
