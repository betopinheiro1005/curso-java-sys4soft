package com.sys4soft;

public class EstruturaCondicionalSwitch {

	public static void main(String[] args) {

		String nome = "Maria";
		String sexo = "";

		switch(nome){
			case "Jo?o":
				sexo = "masculino";
				break;
			case "Maria":
				sexo = "feminino";
				break;
			case "Manuel":	
				sexo = "masculino";
				break;
			default:
				sexo = "indefinido";
		}

		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
	}

}
