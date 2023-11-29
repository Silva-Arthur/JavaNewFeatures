package com.devarthursilva.java12.compactnumberformat;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;

public class CompactNumberFormatExemplo {

	public static void main(String[] args) {
		/**
		 * Escreve o numero formatado conforme o local escolhido
		 * 
		 * */
		NumberFormat nf = CompactNumberFormat.getCompactNumberInstance(Locale.US, Style.LONG);
		
		System.out.println(nf.format(50000));
		
		nf = CompactNumberFormat.getCompactNumberInstance(Locale.US, Style.SHORT);
		
		System.out.println(nf.format(50000));
		
		nf = CompactNumberFormat.getCompactNumberInstance(new Locale("pt", "BR"), Style.LONG);
		
		System.out.println(nf.format(50000));
	}

}
