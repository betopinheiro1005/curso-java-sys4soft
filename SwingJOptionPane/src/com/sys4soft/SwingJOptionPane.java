package com.sys4soft;

import javax.swing.JOptionPane;

public class SwingJOptionPane {

	public static void main(String[] args) {

		// solicitar a primeira parcela
		String primeira_parcela = JOptionPane.showInputDialog("Insira a primeira parcela");
		
		// solicitar a segunda parcela
		String segunda_parcela = JOptionPane.showInputDialog("Insira a segunda parcela");
		
		// converter as variáveis string em int
		int parcela1 = Integer.parseInt(primeira_parcela);
		int parcela2 = Integer.parseInt(segunda_parcela);
		
		int resultado = parcela1 + parcela2;
		
		JOptionPane.showMessageDialog(null, "O resultado é " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
