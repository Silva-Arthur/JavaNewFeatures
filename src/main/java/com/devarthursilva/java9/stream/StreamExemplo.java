package com.devarthursilva.java9.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

class OrdenaProdutoPorPreco implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		return p1.getPreco().compareTo(p2.getPreco());
	}
	
}

public class StreamExemplo {
	
	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<Produto>();

		lista.add(new Produto("Geladeira 470L", 3200.00));
		lista.add(new Produto("TV 42'", 2000.00));
		lista.add(new Produto("Fogão 4 bocas", 900.00));
		lista.add(new Produto("Videogame", 1999.00));
		lista.add(new Produto("Geladeira 270L", 1200.00));
		lista.add(new Produto("Microondas", 500.00));
		lista.add(new Produto("Geladeira 500L", 9200.00));
		
		lista.stream()
			.takeWhile(p -> p.getNome().contains("Geladeira")) // quando o primeiro match nao acontece ele corta a impressão da lista
			.map(p -> p.getNome())
			.forEach(System.out::println);
		
		System.out.println("==========");
		
		lista.stream()
			.dropWhile(p -> p.getNome().contains("Geladeira")) // é o oposto do takeWhile, despreza o primiero match e o resto dos elementos é exibido
			.map(p -> p.getNome())
			.forEach(System.out::println);

	}

}
