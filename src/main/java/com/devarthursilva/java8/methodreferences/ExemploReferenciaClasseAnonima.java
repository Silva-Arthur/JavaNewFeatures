package com.devarthursilva.java8.methodreferences;

interface Figura2D {
	void desenha(Double largura, Double altura);
}

class Retangulo {
	public void desenhaRetangulo(Double largura, Double altura) {
		System.out.println("Desenha retangulo de Largura: " + largura + " e Altura: " + altura);
	}
}

public class ExemploReferenciaClasseAnonima {
	
	public static void main(String[] args) {
		// Exemplo usando Lambda expression
		Figura2D fig1 = (l, a) -> System.out.println("Desenha figura de Largura: " + l + " e Altura: " + a);
		fig1.desenha(8.0, 1.5);
		
		// Exemplo usando MethodReferences
		Retangulo ret = new Retangulo();
			// método de referencia, sendo referenciado por instancia de um método de um objeto particular
		Figura2D fig2 = ret :: desenhaRetangulo;
		
		fig2.desenha(10.5, 7.0);
	}

}
