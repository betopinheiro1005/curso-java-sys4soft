package com.sys4soft;

public class GeraTuma {

	public static void main(String[] args) {

		// criar a turma
		Aluno[] AlunosDaTurma = new Aluno[5];
		
		AlunosDaTurma[0] = new Aluno() {{
			nome = "João";
			idade = 17;
		}};
		
		AlunosDaTurma[1] = new Aluno() {{
			nome = "Rui";
			idade = 15;
		}};

		AlunosDaTurma[2] = new Aluno() {{
			nome = "Carlos";
			idade = 18;
		}};

		AlunosDaTurma[3] = new Aluno() {{
			nome = "Ernesto";
			idade = 14;		
		}};

		AlunosDaTurma[4] = new Aluno() {{
			nome = "Ricardo";
			idade = 19;		
		}};
		
		for(Aluno a: AlunosDaTurma){
			System.out.println("O aluno " + a.nome + " tem " + a.idade + " anos de idade.");
		};
		
	}

}
