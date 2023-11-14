package com.devarthursilva.java8.inferenciadetipos;

import java.util.ArrayList;
import java.util.List;

class Produto {
	private String nome;
	private Double preco;

	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void imprime() {
		System.out.println(getNome() + " = " + getPreco());
	}
}

class Imprime {
	public static void imprimir(List<Produto> lista) {
		if (lista.isEmpty()) {
			System.out.println("Lista vazia!");
		} else {
			lista.forEach(p -> System.out.println(p.getNome()));
		}
	}
}


public class ExemploInferenciaDeTipos {
	
	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<Produto>();

		lista.add(new Produto("TV 42'", 2000.00));
		lista.add(new Produto("Geladeira 470L", 3200.00));
		lista.add(new Produto("Fogão 4 bocas", 900.00));
		lista.add(new Produto("Videogame", 1999.00));
		lista.add(new Produto("Geladeira 270L", 1200.00));
		lista.add(new Produto("Microondas", 500.00));
		lista.add(new Produto("Geladeira 500L", 9200.00));
		
		// Inferencia de tipos, ele vai atribuir que esse parametro é uma lista do tipo Produto, porque o metodo receptor tem no argumento uma lista do tipo Produto
		Imprime.imprimir(new ArrayList<>());
		
		System.out.println();
	}
}
