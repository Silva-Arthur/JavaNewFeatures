package com.devarthursilva.java14.records;

public class RecordsExemplo {

	public static void main(String[] args) {
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
		 * */
		RetanguloRecord r1 = new RetanguloRecord(300.0, 200.);
		
		System.out.println(r1.altura());
		System.out.println(r1.largura());

		r1.imprimeValores();
	}

}
