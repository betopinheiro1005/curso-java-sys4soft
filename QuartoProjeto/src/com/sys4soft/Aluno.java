package com.sys4soft;

public class Aluno {
	public String nome;
	public int idade;
	private String sexo;
	
	public void ApresentaAluno(){
		System.out.println("O aluno chama-se " + nome + ", tem " + idade + " anos de idade e é do sexo " + sexo);
	}
	
	public void DefineSexo(String s){
		// Define o valor de sexo do aluno
		sexo = s;
	}
	
}
