package com.sys4soft;

public class Homem extends Humano {
	boolean tem_barba;
	
	public Homem(){
		System.out.println("Homem");
	}
	
	public void info_barba(boolean tem_barba){
		String resposta;
		
		if(tem_barba){
			resposta = "sim";
		} else {
			resposta = "n�o";
		}
		
		System.out.println("Tem barba: " + resposta + "\n");
	}
}
