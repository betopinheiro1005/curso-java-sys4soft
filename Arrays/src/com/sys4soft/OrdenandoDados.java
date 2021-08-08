package com.sys4soft;

import java.util.Arrays;
import java.util.Collections;

public class OrdenandoDados {

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

		Arrays.sort(alunos);
		
		for(String nome:alunos){
			System.out.println(nome);
		};

		System.out.println("==============================");
		
		// array numerico
		int[] numeros = {
				45, 23, 67, 87, 42, 68
		};
		
		Arrays.sort(numeros);
		
		for(int valor:numeros){
			System.out.println(valor);
		};
		
		System.out.println("==============================");
		
		Arrays.sort(alunos, Collections.reverseOrder());
		
		for(String nome:alunos){
			System.out.println(nome);
		};
		
	}

}
