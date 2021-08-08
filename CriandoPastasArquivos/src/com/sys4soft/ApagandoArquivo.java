package com.sys4soft;

import java.io.File;

public class ApagandoArquivo {

	public static void main(String[] args) {

		String nomeArquivo = "C:" + File.separator + "lixo"
				  + File.separator + "teste.txt";

		File arquivo = new File(nomeArquivo);

		boolean existe = arquivo.exists();

		if(existe){
			arquivo.delete();
			System.out.println("Arquivo deletado com sucesso!");
		} else {
			System.out.println("O arquivo não existe!");
		}
		
	}

}
