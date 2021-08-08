package com.sys4soft;

public class CondicaoIfElse {

	public static void main(String[] args) {

		String resposta = "";
		int idade;
		
		idade = 15;
		resposta = situacao_voto(idade);
		System.out.println(resposta);

		idade = 17;
		resposta = situacao_voto(idade);
		System.out.println(resposta);
		
		idade = 30;
		resposta = situacao_voto(idade);
		System.out.println(resposta);
		
		idade = 70;
		resposta = situacao_voto(idade);
		System.out.println(resposta);

		idade = 105;
		resposta = situacao_voto(idade);
		System.out.println(resposta);
		
	}
	
	public static String situacao_voto(int idade){
		String resultado = "";
		
		if(idade < 16){
			resultado = idade + " anos: N�o pode votar!";
		} else if (idade >= 18 && idade < 70) {
			resultado = idade + " anos: O voto � obrigat�rio!";
		} else if ((idade >= 16 && idade < 18) || (idade >= 70 && idade <= 100)) {
			resultado = idade + " anos: O voto � opcional!";
		} else {
			resultado = "Idade muito alta para votar";
		}
		return resultado;
	}

}
