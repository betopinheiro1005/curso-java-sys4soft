package com.sys4soft;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class InserirTexto {

	public static void main(String[] args) {

		try {
			BufferedWriter escrever = new BufferedWriter(new FileWriter("C:\\lixo\\teste.txt", true));
			escrever.write("Primeira frase.");
			escrever.newLine();
			escrever.write("Segunda frase.");
			escrever.newLine();
			escrever.write("Terceira frase.");
			escrever.newLine();
			escrever.write("Quarta frase.");
			escrever.newLine();
			escrever.close();
			System.out.println("Escrita realizada com sucesso!");
		} catch(Exception e) {
			System.out.println("Erro! " + e);
		}
		
	}

}
