package com.sys4soft;

public class GeraAnimal {

	public static void main(String[] args) {

		Animal gato_1 = new Animal();
		gato_1.nome = "Fred";
		gato_1.especie = "gato";
		gato_1.cor = "branco";
		gato_1.sexo = "macho";
		gato_1.definir_raca("SRD");
		gato_1.som = "mia";
		
		Animal cachorro_1 = new Animal();
		cachorro_1.nome = "Silloeh";
		cachorro_1.especie = "cachorro";
		cachorro_1.cor = "branca";
		cachorro_1.sexo = "femea";
		cachorro_1.definir_raca("Pug");
		cachorro_1.som = "late";
		
//		System.out.println("Nome: " + gato_1.nome + "\n" 
//							+ "Esp?cie: " + gato_1.especie + "\n"
//							+ "Ra?a: " + gato_1.raca + "\n" 
//							+ "Cor: " + gato_1.cor + "\n"
//							+ "Sexo: " + gato_1.sexo + "\n");
//
//		System.out.println("Nome: " + cachorro_1.nome + "\n"
//							+ "Esp?cie: " + cachorro_1.especie + "\n"
//							+ "Ra?a: " + cachorro_1.raca + "\n" 
//							+ "Cor: " + cachorro_1.cor + "\n"
//							+ "Sexo: " + cachorro_1.sexo + "\n");

		String resultado1 = gato_1.exibir_dados_animal();
		String resultado2 = cachorro_1.exibir_dados_animal();
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		gato_1.voz_animal();
		cachorro_1.voz_animal();
		
		MethodStatic.saltar();
		
	}

}
