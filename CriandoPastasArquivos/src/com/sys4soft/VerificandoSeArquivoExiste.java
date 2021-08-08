package com.sys4soft;

import java.io.File;

public class VerificandoSeArquivoExiste {

	public static void main(String[] args) {
		
		String nomeArquivo = "C:" + File.separator + "lixo"
				  + File.separator + "teste.txt";

		File arquivo = new File(nomeArquivo);
		
		// determinar a exist�ncia de um arquivo espec�fico
		System.out.println("Arquivo " + arquivo + " existe? " + arquivo.exists());
		
	}

}
