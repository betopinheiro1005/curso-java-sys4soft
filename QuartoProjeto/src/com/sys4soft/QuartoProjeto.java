package com.sys4soft;

public class QuartoProjeto {

	public static void main(String[] args) {
		
		Aluno aluno_1 = new Aluno();
		aluno_1.nome = "Jo�o";
		aluno_1.idade = 20;
		aluno_1.DefineSexo("masculino");
		
		Aluno aluno_2 = new Aluno();
		aluno_2.nome = "Carlos";
		aluno_2.idade = 25;
		aluno_2.DefineSexo("masculino");
		
		// Apresentando os alunos
		aluno_1.ApresentaAluno();
		aluno_2.ApresentaAluno();
		
		Matematica.Adicao(20, 30);
	}

}
