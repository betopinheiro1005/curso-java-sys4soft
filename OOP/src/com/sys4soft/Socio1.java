package com.sys4soft;

public class Socio1 {

	String nome;
	int idade;
	String sexo;
	boolean vip;
	
	// Construtor da classe sem par�metros
	public Socio1() {
		this("Roberto");
		System.out.println("Construtor sem par�metros");
	}
	
	// construtor da classe com par�metros
	public Socio1(String nome){
		System.out.println("Construtor com par�metro String " + nome);
	}
	
}