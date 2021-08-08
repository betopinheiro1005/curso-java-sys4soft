package com.sys4soft;

import java.io.BufferedReader;
import java.io.FileReader;

public class LerArquivo {

	public static void main(String[] args) {

		try {
			BufferedReader bf = new BufferedReader(new FileReader("C:\\lixo\\teste.txt"));
			StringBuilder str = new StringBuilder();
			String linha = bf.readLine();
			while(linha != null){
				str.append(linha);
				str.append(System.lineSeparator());
				linha = bf.readLine();
			}
			String texto_final = str.toString();
			System.out.println(texto_final);
		} catch(Exception e) {
			System.out.println("Erro!");
		}

	}

}
