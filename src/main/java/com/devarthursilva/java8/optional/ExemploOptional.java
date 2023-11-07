package com.devarthursilva.java8.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Curso {
	private String nome;
	private List<Aluno> listaAlunos;

	public Curso(String nome) {
		this.nome = nome;
		this.listaAlunos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}

}

class Aluno {
	private Optional<Matricula> matricula = Optional.empty();
	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	public Aluno(Matricula matricula, String nome) {
		this.matricula = Optional.of(matricula);
		this.nome = nome;
	}

	public Optional<Matricula> getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = Optional.of(matricula);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

class Matricula {
	private String numero;

	public Matricula(String numero) {
		super();
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}

public class ExemploOptional {
	
	public static void main(String[] args) {
		Curso cursoADM = new Curso("Administração");
		
		Aluno arthur = new Aluno(new Matricula("11100"), "Arthur");
		Aluno beatriz = new Aluno(new Matricula("21100"), "Beatriz");
		Aluno antonio = new Aluno("Antonio");
		Aluno maria = new Aluno(new Matricula("41100"), "Maria");
		
		cursoADM.getListaAlunos().addAll(Arrays.asList(arthur, beatriz, antonio, maria));
		
		// Forma sem OPTIONAL
		//cursoADM.getListaAlunos().forEach(a -> System.out.println(a.getNome() + " - " + a.getMatricula().getNumero()));
		
		// Forma usando OPTIONAL
		cursoADM.getListaAlunos()
			.stream()
			.filter(a -> a.getMatricula().isPresent())
			.forEach(a -> System.out.println(a.getNome() + " - " + a.getMatricula().get().getNumero()));
	}
}
