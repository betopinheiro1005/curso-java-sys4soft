package com.sys4soft;

public class GeraCalculo {

	public static void main(String[] args) {
		
		Calculo1 operacao_1 = new Calculo1();
		Calculo1 operacao_2 = new Calculo1();
		Calculo1 operacao_3 = new Calculo1();
		Calculo1 operacao_4 = new Calculo1();

		int resultado1 = operacao_1.Somar(16, 73);
		int resultado2 = operacao_2.Subtrair(87, 78);
		int resultado3 = operacao_3.Dividir(120, 5);
		int resultado4 = operacao_4.Multiplicar(4, 8);
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);
		System.out.println(resultado4);
		
		System.out.println("================================");
		
		Calculo2 calc = new Calculo2();
		
		int result1 = calc.Operacao(45, 30, "somar");
		int result2 = calc.Operacao(45, 30, "subtrair");
		int result3 = calc.Operacao(4, 30, "multiplicar");
		int result4 = calc.Operacao(48, 4, "dividir");

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		System.out.println("================================");
		
		Overloading calculo = new Overloading();
		
		calculo.soma(14, 85);
		calculo.soma(25, 17, 63);
		
		System.out.println("================================");
		
		PassagemParametros param = new PassagemParametros();
		
		param.nota(5, "Joaquim");
		param.nota(8, "Jo?o");
		param.nota(10, "Maria");
		
	}

}
