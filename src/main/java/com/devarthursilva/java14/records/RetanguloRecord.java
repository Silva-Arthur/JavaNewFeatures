package com.devarthursilva.java14.records;

interface Figura2D {
	
}

/**
 * Simplificar a implementação de POJO
 * 
 * gerar automaticamente metodos get, equls, hashCode e toString
 * 
 * Um record não pode extender e nem ser extendido, o compilador entender ele como sendo uma classe final
 * Um record não pode ser abstrato
 * Não pode haver variáveis de instancia na estrutura, pois todos os atributos são definidos como privados e finais
 * Não pode haver setAltura e setLargura
 * Record permite a implementação de interfaces
 * A estrutura permite métodos estáticos
 * */
public record RetanguloRecord(double largura, double altura) implements Figura2D{

	public static void imprimeValores() {
		System.out.println("Eu sou um retangulo");
	}
}
