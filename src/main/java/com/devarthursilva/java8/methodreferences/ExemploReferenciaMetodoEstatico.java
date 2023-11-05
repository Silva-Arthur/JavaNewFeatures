package com.devarthursilva.java8.methodreferences;

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

class Impressora {
	public static void imprime(Produto p) {
		System.out.println(p.getNome() + " = " + p.getPreco());
	}
}

public class ExemploReferenciaMetodoEstatico {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<Produto>();

		lista.add(new Produto("TV 42'", 2000.00));
		lista.add(new Produto("Geladeira 470L", 3200.00));
		lista.add(new Produto("Fogão 4 bocas", 900.00));
		lista.add(new Produto("Videogame", 1999.00));
		lista.add(new Produto("Microondas", 500.00));

		// Method References, neste caso não precisa paassar uma variável p como em lambda, porque o produto p já está sendo tratado no método referenciado
		lista.forEach(Impressora::imprime);
	}

}
