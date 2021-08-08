package com.sys4soft;

public class TestesOperadoresAritmeticos {

	public static void main(String[] args) {
		int valor1 = 10;
		int valor2 = 3;
		int soma, subtracao, multiplicacao, divisao, resto;
		
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		multiplicacao = valor1 * valor2;
		divisao = valor1 / valor2;
		resto = valor1 % valor2;
		
		System.out.println(valor1 + " + " +  valor2 + " = " + soma);
		System.out.println(valor1 + " - " +  valor2 + " = " + subtracao);
		System.out.println(valor1 + " x " +  valor2 + " = " + multiplicacao);
		System.out.println("Quociente de " + valor1 + "/" +  valor2 + " = " + divisao);
		System.out.println("Resto de " + valor1 + "/" +  valor2 + " = " + resto);

	}

}
