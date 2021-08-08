package com.sys4soft;

import java.io.File;

public class CriandoPastas {

	public static void main(String[] args) {

		String nomePasta = "C:" + File.separator + "lixo"
				  + File.separator + "teste2"
				  + File.separator + "teste3";
		
		File pasta = new File(nomePasta);
		
		try{
			pasta.mkdirs();
			System.out.println("Pastas criadas com sucesso!");
		} catch(Exception e) {
			System.out.println("Erro ao criar as pastas!");
		}
		
	}

}