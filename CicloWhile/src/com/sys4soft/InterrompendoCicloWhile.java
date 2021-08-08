package com.sys4soft;

public class InterrompendoCicloWhile {

	public static void main(String[] args) {
		int valor = 1;
		int ultimo = 5;

		while(valor <= 10){
			System.out.println(valor);
			
			if(valor == 5){
				break;
			}
			
			valor++;
		}
	}

}
