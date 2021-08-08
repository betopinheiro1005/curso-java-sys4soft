package com.sys4soft;

public class MetodosParte1 {

	public static void main(String[] args) {

		String nome = "João";
		String sobrenome = "Ribeiro";
		String nome_completo = nome + " " + sobrenome;
		
		System.out.println(nome_completo + " tem " + nome_completo.length() + " caracteres");

		System.out.println("=======================================================");
		
		String texto = "Frase de testes.";

		for(int index =0; index < texto.length(); index++){
			char c = texto.charAt(index);
			System.out.println(c);
		}

		System.out.println("=======================================================");
		
		String teste_substring1 = texto.substring(9);
		String teste_substring2 = texto.substring(6, 15);

		System.out.println(teste_substring1);
		System.out.println(teste_substring2);
		
		System.out.println("=======================================================");
		
	}

}
