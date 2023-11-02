package com.devarthursilva.java8.lambdaExpressions;

interface Figura {
	void desenha();
}

public class ExemploLambdaSemArgumentos {

	public static void main(String[] args) {
		
		//Implementação sem lambda
		Figura fig1 = new Figura() {
			@Override
			public void desenha() {
				System.out.println("Desenha figura 1");
			}
		};
		
		fig1.desenha();
		
		//Implementação com lambda
		Figura fig2 = () -> System.out.println("Desenha figura 2");
		
		fig2.desenha();
	}
}
