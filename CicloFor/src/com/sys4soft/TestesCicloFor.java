package com.sys4soft;

public class TestesCicloFor {

	public static void main(String[] args) {
		for(int i = 0; i <= 100; i+=10){
			
			if(i == 40) continue;
			
			if(i == 80) break;
			
			System.out.println(i);
		}
	}

}
