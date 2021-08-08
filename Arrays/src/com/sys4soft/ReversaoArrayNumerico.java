package com.sys4soft;

public class ReversaoArrayNumerico {

	public static void main(String[] args) {

		// array numerico
		int[] numeros = {
				1, 3, 5, 7, 9, 11, 13
		};

		for(int i = numeros.length - 1; i >= 0; i--){
			System.out.println(numeros[i]);
		}
		
	}

}
