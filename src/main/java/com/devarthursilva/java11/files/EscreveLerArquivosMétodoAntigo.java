package com.devarthursilva.java11.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

class EscreveArquivo {

	public static void main(String[] args) {
		String caminho = "meutexto.txt";
		String meutexto = "Arthur Silva Programador Java";
		
		/*********************************************************************************/
		
		/*
		 * Escreve fluxos de caracteres (string) em arquivo.
		 * Maneira mais simples at� ent�o. 
		 * Indicado para poucas opera��es de escrita.
		 */
		
		try(FileWriter myWriter = new FileWriter(caminho)) { 
			myWriter.write(meutexto);
		} 
		catch (IOException e) {
		}
		
		/*********************************************************************************/
		
		/*
		 * Grava o texto em uma stream de sa�da, usando mecanismo de buffer
		 * para grava��o mais eficiente de caracteres.
		 */
		
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(caminho))) {
		    bufferedWriter.write(meutexto);
		} 
		catch (IOException e) {
		}
		
		/*********************************************************************************/
		
		try {
			Files.writeString(new File(caminho).toPath(), meutexto, StandardCharsets.ISO_8859_1);
		} 
		catch (IOException e) {
		}

	}

}

class LeArquivo {

	public static void main(String[] args) {
		String caminho = "meutexto.txt";
		
		/*********************************************************************************/
		
		/*
		 * Leitura fluxos de caracteres (string).
		 * Maneira mais simples at� ent�o. 
		 * Indicado para poucas opera��es de leitura.
		 */
		
		try(FileReader myReader = new FileReader(caminho)) { 
			int i;
			
	        while((i=myReader.read())!=-1) //-1 = EOF   
	        	System.out.print((char)i);   
	        
	        System.out.println();
		} 
		catch (IOException e) {
		}
		
		/*********************************************************************************/
		
		/*
		 * L� o texto em uma stream de entrada, usando mecanismo de buffer
		 * para leitura mais eficiente de caracteres.
		 */
		
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(caminho))) {
			String s;
			
			while ((s = bufferedReader.readLine()) != null) { //null = EOF
				System.out.println(s);
			}
		} 
		catch (IOException e) {
		}
		
		/*********************************************************************************/
		
		String s;
		try {
			s = Files.readString(new File(caminho).toPath(), StandardCharsets.ISO_8859_1);
			System.out.println(s);
		} 
		catch (IOException e) {
			System.out.println(e);
		}
		
		
	}

}
