package com.devarthursilva.java8.interfacefuncional;

@FunctionalInterface
interface Figura2D {
	void desenha(Double largura, Double altura);
}

class Imprime {
	void imprimir(Double largura, Double altura) {
		System.out.println(largura + " X " + altura);
	}
}

public class InterfacesFuncionais {

	public static void main(String[] args) {
		
		// Exemplo de implementação usando lambda
		Figura2D fig = (l, a) -> {
			System.out.println(l + " X " + a);
		}; 
		fig.desenha(10.0, 5.0);
		
		// Exemplo de implementação usando method references
		Imprime imprime = new Imprime();
		Figura2D fig2 = imprime::imprimir;
		fig2.desenha(9.5, 15.6);
	}
}
