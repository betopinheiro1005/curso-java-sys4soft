package com.sys4soft;

public class Socio1 {

	String nome;
	int idade;
	String sexo;
	boolean vip;
	
	// Construtor da classe sem parāmetros
	public Socio1() {
		this("Roberto");
		System.out.println("Construtor sem parāmetros");
	}
	
	// construtor da classe com parāmetros
	public Socio1(String nome){
		System.out.println("Construtor com parāmetro String " + nome);
	}
	
}
