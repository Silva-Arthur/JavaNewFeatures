package com.devarthursilva.java8.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

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


public class ReflectExemplo {

	public static void main(String[] args) {
		
		//Instancia da classe Produto
		Produto p = new Produto("Geladeira", 3000.00);
		
		//Instancia da classe Class
		@SuppressWarnings("rawtypes")
		Class cl = p.getClass();
		
		// Todos os métodos declarados na classe Produto
		Method[] method = cl.getDeclaredMethods();
		
		for(Method m : method) {
			System.out.println(m.getName());
			Parameter[] parameter = m.getParameters();
			for(Parameter pr : parameter) {
				System.out.println(" - " + pr);
			}
		}
	}
}
