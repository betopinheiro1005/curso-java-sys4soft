package com.sys4soft;

public class Socio {
	String nome;
	int idade;
	String sexo;
	boolean vip;
	
	// Construtor da classe sem par�metros
	public Socio() {
		System.out.println("Novo s�cio criado!");		
	}
	
	// construtor da classe com par�metros
	public Socio(String nome){
		// define o nome do s�cio
		this.nome = nome;
	}
	
	public void ApresentarSocio(){
		System.out.println("Nome: " + nome);
	}
	
}
