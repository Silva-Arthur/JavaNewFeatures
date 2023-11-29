package com.devarthursilva.java12.filesmissmatch;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MissMatchExemplo {

	public static void main(String[] args) {
		File f1 = new File("texto1.txt");
		File f2 = new File("texto2.txt");
		
		try {
			// verifica se os arquivos são do mesmo tamanho, byte por byte
			long resultado = Files.mismatch(f1.toPath(), f2.toPath()); // se retornar -1 significa que os arquivos são identicos
			
			System.out.println(resultado); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

