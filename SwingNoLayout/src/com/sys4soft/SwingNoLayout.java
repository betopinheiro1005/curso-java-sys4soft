package com.sys4soft;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingNoLayout {

	public static void main(String[] args) {

		// criar a janela JFrame
		JFrame janela = new JFrame("Sem Layout");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(500, 300);
		
		// comandos
		JButton cmd1 = new JButton("Comando 1");
		cmd1.setBounds(10, 10, 120, 30);

		JButton cmd2 = new JButton("Comando 1");
		cmd2.setBounds(10, 50, 120, 30);

		JButton cmd3 = new JButton("Comando 3");
		cmd3.setBounds(10, 90, 120, 30);
		
		JButton cmd4 = new JButton("Comando 4");
		cmd4.setBounds(150, 100, 150, 90);
		
		janela.setLayout(null);
		janela.add(cmd1);
		janela.add(cmd2);
		janela.add(cmd3);
		janela.add(cmd4);
		janela.setVisible(true);

	}

}
