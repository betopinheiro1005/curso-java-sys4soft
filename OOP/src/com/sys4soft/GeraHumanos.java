package com.sys4soft;

public class GeraHumanos {

	public static void main(String[] args) {

		 Homem h1 = new Homem();
		 h1.nome = "Ricardo";
		 h1.idade = 19;
		 h1.tem_barba = false;
		 
		 Mulher m1 = new Mulher();
		 m1.nome = "Solange";
		 m1.idade = 32;
		 m1.usa_battom = true;
		 
		 h1.ApresentarHumano();
		 h1.info_barba(h1.tem_barba);
		 m1.ApresentarHumano();
		 m1.info_battom(m1.usa_battom);

	}

}
