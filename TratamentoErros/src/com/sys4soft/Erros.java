package com.sys4soft;

public class Erros {

	public static void main(String[] args) {

		int[] valores = new int[5];
		
		try {
			System.out.println(valores[5]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("N�o existe este aluno!");
		} finally {
			System.out.println("Executado sempre, quer exista erro ou n�o.");
		}

	}

}
