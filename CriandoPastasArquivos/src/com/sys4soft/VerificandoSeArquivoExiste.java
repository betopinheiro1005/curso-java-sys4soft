package com.sys4soft;

import java.io.File;

public class VerificandoSeArquivoExiste {

	public static void main(String[] args) {
		
		String nomeArquivo = "C:" + File.separator + "lixo"
				  + File.separator + "teste.txt";

		File arquivo = new File(nomeArquivo);
		
		// determinar a existência de um arquivo específico
		System.out.println("Arquivo " + arquivo + " existe? " + arquivo.exists());
		
	}

}
