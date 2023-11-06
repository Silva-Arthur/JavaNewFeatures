package com.devarthursilva.java8.base64;

import java.util.Base64;

public class ExemploBase64 {

	public static void main(String[] args) {
		
		try {
			String texto = "A classe Base 64 no JAVA 8!";
			System.out.println(texto);
			
			//encode Base64
			String textoCodificado = Base64.getEncoder().encodeToString(texto.getBytes("UTF-8"));
			System.out.println(textoCodificado);
			
			//decode Base64
			String textoDecodificado = new String(Base64.getDecoder().decode(textoCodificado), "UTF-8");
			System.out.println(textoDecodificado);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
