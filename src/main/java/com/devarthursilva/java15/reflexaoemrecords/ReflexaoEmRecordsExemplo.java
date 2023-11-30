package com.devarthursilva.java15.reflexaoemrecords;

import java.lang.reflect.Field;

class Produto {
	private final Integer codigo = 12345;
	
	public Integer getCodigo() {
		return codigo;
	}
}

public class ReflexaoEmRecordsExemplo {

	public static void main(String[] args) {
		var geladeira = new Produto();
		System.out.println(geladeira.getCodigo());
		
		try {
			//obtém o atributo (Field) da classe
			Field atributo = geladeira.getClass().getDeclaredField("codigo");
			
			//alterar o modificador de acesso para o atributo se tornar acessível
			atributo.setAccessible(true);
			
			atributo.set(geladeira, 54321);
			System.out.println(geladeira.getCodigo());
			
			/**
			 * 
			 * Caso eu tente fazer isso com um record, a partir do JAVA 15 a Exceção IllegalAccessException será lançada
			 * 
			 * */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
