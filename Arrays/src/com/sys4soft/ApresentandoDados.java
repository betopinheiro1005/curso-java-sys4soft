package com.sys4soft;

public class ApresentandoDados {

	public static void main(String[] args) {

		// array
		String[] alunos = {
			"João",
			"Rui",
			"Francisco",
			"Raquel",
			"Ana",
			"Clara",
			"Carlos"
		};
		
		for(int i = 0; i < alunos.length; i++){
			System.out.println(alunos[i]);
		}

		System.out.println("=============================");
		
		for(int i = alunos.length-1; i >= 0; i--){
			System.out.println(alunos[i]);
		}

	}

}
