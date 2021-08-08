package com.sys4soft;

public class ArrayCopy {

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

		String[] novo = new String[4];
		
		System.arraycopy(alunos, 2, novo, 0, 4);
		
		for(String item:novo){
			System.out.println(item);
		}
		
	}

}
