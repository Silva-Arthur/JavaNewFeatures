package com.devarthursilva.java15.classesseladas;

/**
 * Restringe a hierarquia de classes, definindo quais classes podem ser subclasses de outras
 * 
 * */


abstract sealed class Carnivoro permits Leao {
	public void euSou() {
		System.out.print("Eu sou carnívoro\n");
	}
}

abstract sealed class Herbivoro permits Coelho {
	public void euSou() {
		System.out.print("Eu sou herbívero\n");
	}
}

non-sealed class Leao extends Carnivoro {
	@Override
	public void euSou() {
		System.out.print("Eu sou um leão, ");
		super.euSou();
	}
}

non-sealed class Coelho extends Herbivoro {
	@Override
	public void euSou() {
		System.out.print("Eu sou um coelho, ");
		super.euSou();
	}
}

/*
class Geladeira extends Carnivoro {
	
	@Override
	public void euSou() {
		System.out.print("Eu sou uma geladeira, ");
		super.euSou();
	}
}
*/

public class SealedExemplo {

	public static void main(String[] args) {
		var l = new Leao();
		l.euSou();
		
		var c = new Coelho();
		c.euSou();
	}
}
