package com.devarthursilva.java13.switchexpression;

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
		
		/**
		 * 
		 * Com switch expression não é mais necessário utilizar o comando break, utilizando a palavra reservada yield para identificar o retorno
		 * 
		 * */ 
		// Executando agora com switch expression
		System.out.println("====================");
		resultado = switch (dia) {
			case "segunda": yield "dia útil";
			case "terça": yield "dia útil";
			case "quarta": yield "dia útil";
			case "quinta": yield "dia útil";
			case "sexta": yield "dia útil";
			case "sábado": yield "final de semanada";
			case "domingo": yield "final de semanada";
			default:  yield "dia inválido";
		};
		System.out.println(resultado);
	}
}
