package com.sys4soft;

public class GeraPessoas {

	public static void main(String[] args) {
		 Pessoas p1 = new Pessoas();
		 p1.nome = "João";
		 
		 Pessoas.idade = 25;
		 
		 p1.ApresentarNome(p1.nome);
		 Pessoas.ApresentarIdade(Pessoas.idade);
		 Pessoas.ApresentarIdade(Pessoas.idade2);
		 
	}

}
