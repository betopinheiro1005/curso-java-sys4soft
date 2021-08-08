package com.sys4soft;

import java.io.File;

public class CriandoPasta {

	public static void main(String[] args) {

		String nomePasta = "C:" + File.separator + "lixo"
				  + File.separator + "teste1";
		
		File pasta = new File(nomePasta);
		
		try{
			pasta.mkdir();
			System.out.println("Pasta criada com sucesso!");
		} catch(Exception e) {
			System.out.println("Erro ao criar a pasta!");
		}
		
	}

}
