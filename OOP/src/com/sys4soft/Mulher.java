package com.sys4soft;

public class Mulher extends Humano {
	boolean usa_battom;
	
	public Mulher(){
		System.out.println("Mulher");
	}
	
	public void info_battom(boolean usa_battom){
		
		String resposta;
		
		if(usa_battom){
			resposta = "sim";
		} else {
			resposta = "n�o";
		}
		
		System.out.println("Usa battom: " + resposta + "\n");
		
	}
	
}
