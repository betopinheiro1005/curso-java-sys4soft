package com.sys4soft;

import java.util.Scanner;

public class TerceiroProjeto {

	public static void main(String[] args) {
		// fazer a adi��o de duas parcelas
		System.out.println("Adicionar duas parcelas.");
		
		// definir vari�veis
		int parcela1;
		int parcela2;
		int resultado;
		
		// criar o objeto de inser��o de parcelas
		Scanner input = new Scanner(System.in);
		
		// pedido da primeira parcela
		System.out.println("Informe o valor da primeira parcela");
		parcela1 = input.nextInt();
		
		// pedido da segunda parcela
		System.out.println("Informe o valor da segunda parcela");
		parcela2 = input.nextInt();
		
		// realiza��o da adi��o
		resultado = parcela1 + parcela2;
		
		// apresenta��o do resultado
		System.out.printf("A adi��o de %d + %d = %d", parcela1, parcela2, resultado);
	}

}
