package com.devarthursilva.java8.stream;

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

public class ExemploStreamList {
	
	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<Produto>();

		lista.add(new Produto("TV 42'", 2000.00));
		lista.add(new Produto("Geladeira 470L", 3200.00));
		lista.add(new Produto("Fogão 4 bocas", 900.00));
		lista.add(new Produto("Videogame", 1999.00));
		lista.add(new Produto("Geladeira 270L", 1200.00));
		lista.add(new Produto("Microondas", 500.00));
		lista.add(new Produto("Geladeira 500L", 9200.00));

		// Forma antiga de manipular listas
		
		// Obtém a lista de geladeiras
		List<Produto> listaGeladeiras = new ArrayList<>();
		for (Produto produto : lista) {
			if (produto.getNome().contains("Geladeira")) {
				listaGeladeiras.add(produto);
			}
		}
		
		// Ordena a lista de geladeiras
		Collections.sort(listaGeladeiras, new OrdenaProdutoPorPreco());
		
		// Obtém a lista do nome das geladeiras
		List<String> listaNomesGeladeiras = new ArrayList<>();
		for (Produto produto : listaGeladeiras) {
			listaNomesGeladeiras.add(produto.getNome().toUpperCase());
		}
		
		// Exibe os nomes das geladeiras
		for(String nome : listaNomesGeladeiras) {
			System.out.println(nome);
		}
		
		System.out.println("======================");
		//Forma nova de implementar usando STREAM (pipeline)
		lista.stream()
			.filter(p -> p.getNome().contains("Geladeira")) //obtém a lista das geladeiras
			.sorted((p1,p2) -> p1.getPreco().compareTo(p2.getPreco())) // ordena a lista de geladeiras
			.map(p -> p.getNome().toUpperCase()) //obtém a lista dos nomes das geladeiras
			.forEach(System.out::println); // imprime o nome das geladeiras usando method reference
		
		System.out.println("======================");
		// um outro exemplo de uso de stream, dessa vez coletando somente o objeto e não a uma String somente
		lista.stream().filter(p -> p.getNome().contains("Geladeira")).forEach(System.out::println);
	}
}
