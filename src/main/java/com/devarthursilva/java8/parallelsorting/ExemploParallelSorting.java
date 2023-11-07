package com.devarthursilva.java8.parallelsorting;

import java.util.Arrays;

public class ExemploParallelSorting {

	public static void main(String[] args) {
		int[] meuArray = {5, 8, 1, 0, 6, 9, 50, -3};
		
		for (int i : meuArray) {
			System.out.print(i + " ");
		}

		System.out.println("======================");
		
		// Ordenando de forma crescendo usando ParallelSort apartir de um trecho do array, mas pode ser aplicado para o array todo, é só tirar os dois ultimos parametros
		Arrays.parallelSort(meuArray, 0, 5 );
		
		for (int i : meuArray) {
			System.out.print(i + " ");
		}
	}
}
