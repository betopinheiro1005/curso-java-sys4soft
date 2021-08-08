package com.sys4soft;

public class Socio {
	String nome;
	int idade;
	String sexo;
	boolean vip;
	
	// Construtor da classe sem parâmetros
	public Socio() {
		System.out.println("Novo sócio criado!");		
	}
	
	// construtor da classe com parâmetros
	public Socio(String nome){
		// define o nome do sócio
		this.nome = nome;
	}
	
	public void ApresentarSocio(){
		System.out.println("Nome: " + nome);
	}
	
}
