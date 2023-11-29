package com.devarthursilva.java11.files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class EscreverLerArquivosExemplo {

	public static void main(String[] args) {
		String caminho = "meutexto.txt";
		String meutexto = "Arthur Silva Prográmador Java!!";
		
		// Escreve Arquivo
		try {
			Files.writeString(new File(caminho).toPath(), meutexto, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Lê Arquivo
		try {
			var s = Files.readString(new File(caminho).toPath(), StandardCharsets.UTF_8);
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
