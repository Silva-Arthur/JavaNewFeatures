package com.devarthursilva.java11.string;

import java.util.stream.Collectors;

public class StringExemplo {

	public static void main(String[] args) {
		
		String str1 = "    ";
		String str2 = "";
		String str3 = "Arthur\nSilva\nProgramador\nJava";
		String str4 = "Arthur Silva";
		
		System.out.println(str1.isBlank());
		System.out.println(str2.isBlank());
		System.out.println(str3.isBlank());
		
		System.out.println(str3.lines().collect(Collectors.toList()));
		
		System.out.println(str4.repeat(4));
	}
}
