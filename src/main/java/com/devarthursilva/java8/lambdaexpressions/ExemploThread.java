package com.devarthursilva.java8.lambdaexpressions;

public class ExemploThread {
	
	/***
	 * 
	 * Sintaxe do lambda: parametros -> ação
	 * 
	 * Simplificação das interfaces funcionais
	 * 
	 * **/
	
	public static void main(String[] args) {
		
		//Thread implementada da forma antiga
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread 1 em execução");
			}
		});
		t1.start();
		
		// Thread implementada com lambda, deixando o código mais limpo
		Thread t2 = new Thread( () -> System.out.println("Thread 2 em execução"));
		t2.start();
	}

}
