package com.sys4soft;

public class GeraSocio {

	public static void main(String[] args) {
		
		Socio s1 = new Socio("Jo�o");
		s1.ApresentarSocio();

		Socio s2 = new Socio("Paula");
		s2.ApresentarSocio();

		Socio s3 = new Socio("Carlos");
		s3.ApresentarSocio();
		
		System.out.println("========================================");

		Socio1 s4 = new Socio1("Carlos");
		System.out.println("");
		
		Socio1 s5 = new Socio1();

	}

}