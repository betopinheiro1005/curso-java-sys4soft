package com.sys4soft;

public class MetodosParte2 {

	public static void main(String[] args) {
		String nome1 = "Jo�o";
		String nome2 = "Jo�o";
		String nome3 = "";
		
		if(nome1.equals(nome2)){
			System.out.println("os nomes s�o iguais!");
		}
		
		System.out.println("========================================");
		
		String sobrenome1 = "Ribeiro";
		
		String nome_completo = nome1.concat(" " + sobrenome1);
		
		System.out.println(nome_completo);
		
		System.out.println("========================================");
	
		int posicao1 = nome_completo.indexOf('i');
		int posicao2 = nome_completo.lastIndexOf('i');
		
		System.out.println(posicao1);
		System.out.println(posicao2);
		
		System.out.println("========================================");
		
		if(nome3.isEmpty()){
			System.out.println("Nome est� vazio!");
		}
		
	}

}
