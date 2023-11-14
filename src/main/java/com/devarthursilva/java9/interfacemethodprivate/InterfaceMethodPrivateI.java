package com.devarthursilva.java9.interfacemethodprivate;

public interface InterfaceMethodPrivateI {

	/**
	 * 
	 * Métodos default foram introduções feitas no JAVA 8, para poder escrever interfaces que implementassem métodos
	 * fazendo com que um método somente na interface fosse abastrato, gerando assim Interfaces Funcionais
	 * 
	 * */
	default void LogInfo(String mensagem) {
		log(mensagem, "INFO");
	}
	
	default void LogWarn(String mensagem) {
		log(mensagem, "WARN");
	}
	
	default void LogError(String mensagem) {
		log(mensagem, "ERROR");
	}
	
	default void LogFatal(String mensagem) {
		log(mensagem, "FATAL");
	}
	
	/**
	 * 
	 * New feature do JAVA 9, criando métodos privados
	 * 
	 * */
	private void log(String mensagem, String tipo) {
		System.out.println("*** INÍCIO ***");
		System.out.println(tipo + " - " + mensagem);
		System.out.println("*** FIM ***");
	}
}
