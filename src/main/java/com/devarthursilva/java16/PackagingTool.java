package com.devarthursilva.java16;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PackagingTool {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Minha Janela em JAVA");
		
		frame.setMinimumSize(new Dimension(800, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lb = new JLabel("Hello World!", SwingConstants.CENTER);
		frame.getContentPane().add(lb);
		
		//empacotar e exibir o frame
		frame.pack();
		frame.setVisible(true);
		
		/**
		 * 
		 * Usando a ferramento Jpackage é possível gerar um executável segundo o ambiente operacional
		 * 
		 * deve-se abrir o terminal e rodar o comando: jpackage --verbose --type exe --name teste --input meuapp.jar --dest /d/Projetos/workspace-eclipse --main-jar minhaapp.jar --main-class com.devarthursilva.java16.PackagingTool --win-menu
		 * 
		 * */
	}
}
