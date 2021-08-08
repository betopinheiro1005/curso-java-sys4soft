package com.sys4soft;

public class Pessoas {
	public String nome;
	public static int idade = 38;
	public static final int idade2 = 54;
	
	public void ApresentarNome(String nome){
		this.nome = nome;
		System.out.println("Nome: " + nome);
	}
	
	public static void ApresentarIdade(int idade){
		System.out.println("Idade: " + idade);
	}
	
}
