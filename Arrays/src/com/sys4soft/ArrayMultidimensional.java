package com.sys4soft;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		
		// array multidimensional
		int[][] numeros = {
				{1,2,3,4,5,6,7},
				{7,6,5,4,3,2,1}
		};

		for(int i = 0; i < numeros[1].length; i++){
			System.out.println(numeros[1][i]);
		}
		
	}

}
