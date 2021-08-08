package com.sys4soft;

import java.io.File;

public class ApagandoPasta {

	public static void main(String[] args) {

		String nomePasta = "C:" + File.separator + "lixo"
				  + File.separator + "teste2" + File.separator + "teste3";
		
		File pasta = new File(nomePasta);

		boolean existe = pasta.exists();
		
		if(existe){
			pasta.delete();
			System.out.println("Pasta deletada com sucesso!");
		} else {
			System.out.println("Pasta não encontrada!");
		}
	
	}

}
