package com.devarthursilva.java14.instanceofexemplo;

interface Animal {

}

class Dog implements Animal {
	void latir() {}
}

class Cat implements Animal {
	void miar() {}
}

public class InstanceOfExemplo {

	public static void main(String[] args) {
		/**
		 * 
		 * Não é mais necessário fazer cast dentro do instanceof para poder acessar métodos proprios
		 * 
		 * */
		
		Animal animal = null;

		if (animal instanceof Dog dog) {
			dog.latir();
			
		} else if (animal instanceof Cat cat) {
			cat.miar();
		}
		
		
	}
}
