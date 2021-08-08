package com.sys4soft;

public class PassagemParametros {
	int num1 = 0;
	String nome;
	
	public void nota(int num1, String nome){
		this.num1 = num1;
		this.nome = nome;
		
		System.out.println(nome + " - Nota: " + num1);
	}
}
