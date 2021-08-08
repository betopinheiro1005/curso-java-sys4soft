package com.sys4soft;

public class Calculo2 {

	public int Operacao(int num1, int num2, String operacao){
		
		int resultado = 0;
		
		switch(operacao){
			case "somar":
				resultado = num1 + num2;
				break;
			case "subtrair":
				resultado = num1 - num2;
				break;
			case "multiplicar":
				resultado = num1 * num2;
				break;
			case "dividir":
				resultado = num1 / num2;
				break;
		}
		
		return resultado;
	}
	
}
