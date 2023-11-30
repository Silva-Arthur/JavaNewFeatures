package com.devarthursilva.java14.nullpointerexception;

class Aluno {
	private String nome = null;
	
	public Aluno() {
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}

public class NullPointExceptionExemplo {
	
	

	public static void main(String[] args) {
		/***
		 * 
		 * Produz uma mensagem mais detalhada relacionada com nullpointer, mostrando qual variavel etc
		 * 
		 * 
		 * */
		var a = new Aluno();
		a.getNome().substring(0, 1);
	}
}
