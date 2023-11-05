package com.devarthursilva.java8.methodreferences;

interface Figura2DComConstrutor {
	RetanguloComConstrutor desenha(Double largura, Double altura);
}

class RetanguloComConstrutor {
	public RetanguloComConstrutor(Double largura, Double altura) {
		System.out.println("Desenha retangulo de Largura: " + largura + " e Altura: " + altura);
	}
}

public class ExemploReferenciaConstrutor {

	public static void main(String[] args) {
		Figura2DComConstrutor fig1 = RetanguloComConstrutor::new;
		fig1.desenha(10.0, 2.5);
	}
}
