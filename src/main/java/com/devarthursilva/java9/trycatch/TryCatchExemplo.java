package com.devarthursilva.java9.trycatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchExemplo {

	public static void main(String[] args) {
		try {
			lerArquivoComBlocoTryCatchFinnaly("file.txt");
			
			System.out.println("==================");
			
			lerArquivoBlocoTryComRecurso("file.txt");
			
			System.out.println("==================");
			
			lerArquivoBlocoTryComRecursoDeclaracaoForaTry("file.txt");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Antes do JAVA 7 "modo tradicional"
	public static void lerArquivoComBlocoTryCatchFinnaly(String path) throws IOException {
		String linha = "";
		
		BufferedReader br = new BufferedReader(new FileReader(path));
		
		try {
			while((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException e) {
			throw e;
		} finally {
			if (br != null) {
				br.close();
			}
		}
	}
	
	// A partir do JAVA 7
	public static void lerArquivoBlocoTryComRecurso(String path) throws IOException {
		String linha = "";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) { // omissão da cláusula catch, pq a exceção ja é lançada no throw
			while((linha = br.readLine()) != null) {
				System.out.println(linha); // não é preciso fechar o arquivo pq o BufferReader implementa a interface autocloseble
			}
		} 
	}
	
	// A partir do JAVA 9
	public static void lerArquivoBlocoTryComRecursoDeclaracaoForaTry(String path) throws IOException {
		String linha = "";
		
		BufferedReader br = new BufferedReader(new FileReader(path)); // a variável pode ser chamada antes do try e passada como parametro
		
		try (br) { // omissão da cláusula catch, pq a exceção ja é lançada no throw
			while((linha = br.readLine()) != null) {
				System.out.println(linha); // não é preciso fechar o arquivo pq o BufferReader implementa a interface autocloseble
			}
		} 
	}
	
}
