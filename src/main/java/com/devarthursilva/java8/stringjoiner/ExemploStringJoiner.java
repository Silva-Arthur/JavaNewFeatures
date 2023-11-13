package com.devarthursilva.java8.stringjoiner;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class ExemploStringJoiner {

	public static void main(String[] args) {
		String nomes = " Arthur, Beatriz, Maria, Antonio, Mayara, Maria Cecília, Luiza, Hugo";
		
		// O StringTokenizer é o oposto do StringJoiner
		StringTokenizer st = new StringTokenizer(nomes, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("================");
		
		//Emprego do StringJoiner
		StringJoiner sj = new StringJoiner(", ");
		sj.add("Arthur");
		sj.add("Beatriz");
		sj.add("Maria");
		sj.add("Antonio");
		sj.add("Mayara");
		sj.add("Maria Cecília");
		sj.add("Luiza");
		sj.add("Hugo");
		
		System.out.println(sj);
		
	}
}
