package com.sys4soft;

public class MetodosParte3 {

	public static void main(String[] args) {

		String texto = "Frase de testes de strings no Java";
		String texto2 = texto.toLowerCase();
		String texto3 = texto.toUpperCase();
		String subtexto1 = "testes";
		String subtexto2 = "java";
		String subtexto3 = "JAVA";
		
		if(texto.contains(subtexto1)){
			System.out.println(texto + " ==> CONTÉM a string " + subtexto1 );
		} else {
			System.out.println(texto + " ==> NÃO CONTÉM a string " + subtexto1 );
		}

		if(texto.contains(subtexto2)){
			System.out.println(texto + " ==> CONTÉM a string " + subtexto2);
		} else {
			System.out.println(texto + " ==> NÃO CONTÉM a string " + subtexto2);
		}

		if(texto2.contains(subtexto2)){
			System.out.println(texto2 + " ==> CONTÉM a string " + subtexto2);
		} else {
			System.out.println(texto2 + " ==> NÃO CONTÉM a string " + subtexto2);
		}

		if(texto3.contains(subtexto3)){
			System.out.println(texto3 + " ==> CONTÉM a string " + subtexto3);
		} else {
			System.out.println(texto3 + " ==> NÃO CONTÉM a string " + subtexto3);
		}
		
		
		System.out.println("====================================================================");
		
		String novo_texto = texto.replace('J', 'j');
		System.out.println(novo_texto);
		
		System.out.println("====================================================================");

		String texto4 = "    Textes com strings    "; 
		
		System.out.println(texto4.trim());

		System.out.println("====================================================================");

		
	}

}
