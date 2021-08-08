package com.sys4soft;

import java.io.File;

public class CriandoArquivo {

	public static void main(String[] args) {

		// String nomeArquivo = "C:\\lixo\\teste.txt";
		String nomeArquivo = "C:" + File.separator + "lixo"
								  + File.separator + "teste.txt";
		
		File arquivo = new File(nomeArquivo);

		try{
			arquivo.createNewFile();
			System.out.println("Arquivo " + arquivo.getPath() + " criado com sucesso!");
		} catch(Exception e) {
			System.out.println("Erro! " + arquivo.getPath());
		}
		
	}

}
