package com.sys4soft;

public class Animal {
	public String nome;
	public String especie;
	public String cor;
	public String sexo;
	public String som;
	public String raca;
	
	public void voz_animal(){
		System.out.println("O " + especie + " " + som);
	}
	
	public void definir_raca(String raca_animal){
		raca = raca_animal;
	}
	
	public String exibir_dados_animal(){
		String dados = "";
		dados = "Nome: " + nome + "\n" 
				+ "Espécie: " + especie + "\n"
				+ "Raça: " + raca + "\n" 
				+ "Cor: " + cor + "\n"
				+ "Sexo: " + sexo + "\n";
		return dados;
	}
	
}
