package com.sys4soft;

public class OrdenarArrayInt {

	public static void main(String[] args) {

		// array numerico
		int[] numeros = {
				2, 5, 4, 9, 7, 3, 8, 1, 6
		};
		
		numeros = MetodoOrdenarArrayInt.OrdemAsc(numeros);

		for(int valor:numeros){
			System.out.println(valor);
		}
		

		System.out.println("=====");
		
		numeros = MetodoOrdenarArrayInt.OrdemDesc(numeros);
		
		for(int valor:numeros){
			System.out.println(valor);
		}
		
	}

}
