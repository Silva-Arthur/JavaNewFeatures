package com.devarthursilva.java8.annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// como criar minha própria anotação
@Repeatable(Voltagens.class) // indica que pode ser duplicada no mesmo código
@interface Voltagem {
	String tensao(); // métodos não podem conter parâmetros
}

@Retention(RetentionPolicy.RUNTIME) // informa ao compilador que essa anotação vai estar disponível durante todo o tempo de execução da JVM
@interface Voltagens {
	Voltagem[] value();
}


@Voltagem(tensao = "110")
@Voltagem(tensao = "220")
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


public class AnnotationsExemplo {

	public static void main(String[] args) {
		//obtém os valores possíveis anotados no produto
		Voltagem[] volts = Produto.class.getAnnotationsByType(Voltagem.class);
		
		// a partir do java 8 pode-se repetir anotações no mesmo trecho de código
		for (Voltagem voltagem : volts) {
			System.out.println(voltagem.tensao());
		}
	}
	
}
