package com.sys4soft;

public class PrecedenciaAlgebraAritmetica {

	public static void main(String[] args) {
		
		int calculo = 20 + 30 * 10;
		System.out.println(calculo);
		
		calculo = (20 + 30) * 10;
		System.out.println(calculo);
		
		calculo = 20 + 30 * 10 + 20;
		System.out.println(calculo);
		
		calculo = (20 + 30) * (10 + 20);
		System.out.println(calculo);
		
	}

}
