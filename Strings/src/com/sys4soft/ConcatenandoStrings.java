package com.sys4soft;

public class ConcatenandoStrings {

	public static void main(String[] args) {

		char[] caracteres = {'J','o','�','o'};
		String nome = new String(caracteres);

		System.out.println(nome);
		System.out.println(nome + " tem " + nome.length() + " letras.");

		StringBuilder str = new StringBuilder();
		str.append("Jo�o");
		str.append(" tem ");
		str.append(17);
		str.append(" anos de idade.");

		System.out.println(str);

	}

}
