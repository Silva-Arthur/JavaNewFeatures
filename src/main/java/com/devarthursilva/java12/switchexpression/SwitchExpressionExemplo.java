package com.devarthursilva.java12.switchexpression;

import java.util.Scanner;

public class SwitchExpressionExemplo {

	public static void main(String[] args) {
		
		System.out.println("Digite o dia da semana: ");
		
		//obtém os dados do console
		Scanner input = new Scanner(System.in);
		
		String dia = input.nextLine();
		String resultado = "";
		
		// fecha o fluxo de dados
		input.close();
		
		switch(dia) {
			case "segunda":
				resultado = "dia útil";
				break;
			case "terça":
				resultado = "dia útil";
				break;
			case "quarta":
				resultado = "dia útil";
				break;
			case "quinta":
				resultado = "dia útil";
				break;
			case "sexta":
				resultado = "dia útil";
				break;
			case "sábado":
				resultado = "final de semanada";
				break;
			case "domingo":
				resultado = "final de semanada";
				break;
			default:
				resultado = "dia inválido";
		}
		
		System.out.println(resultado);
		System.out.println("====================");
		
		/**
		 * 
		 * Com switch expression não é mais necessário utilizar o comando break
		 * 
		 * */ 
		// Executando agora com switch expression
		resultado = "";
		resultado = switch (dia) {
			case "segunda"-> "dia útil";
			case "terça"-> "dia útil";
			case "quarta"-> "dia útil";
			case "quinta"-> "dia útil";
			case "sexta"-> "dia útil";
			case "sábado"-> "final de semanada";
			case "domingo"-> "final de semanada";
			default -> "dia inválido";
		};
		System.out.println(resultado);
		System.out.println("====================");
		
		// Executando o código com switch expression ainda mais refatorado
		resultado = "";
		resultado = switch (dia) {
			case "segunda", "terça", "quarta", "quinta", "sexta" -> "dia útil";
			case "sábado", "domingo"-> "final de semanada";
			default -> "dia inválido";
		};
		System.out.println(resultado);
 	}
}
