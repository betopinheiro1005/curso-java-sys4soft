package com.sys4soft;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingBorderLayout {

	public static void main(String[] args) {

		// criar a janela JFrame
		JFrame janela = new JFrame("BorderLayout");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(500, 300);
		
		// comandos
		JButton cmd1 = new JButton("Page Start");
		JButton cmd2 = new JButton("Line Start");
		JButton cmd3 = new JButton("Center");
		JButton cmd4 = new JButton("Line End");
		JButton cmd5 = new JButton("Page End");
		
		// layout de janela
		janela.setLayout(new BorderLayout());
		
		// adicionar os componentes ? janela
		janela.add(cmd1, BorderLayout.PAGE_START);
		janela.add(cmd2, BorderLayout.LINE_START);
		janela.add(cmd3, BorderLayout.CENTER);
		janela.add(cmd4, BorderLayout.LINE_END);
		janela.add(cmd5, BorderLayout.PAGE_END);
		
		janela.setVisible(true);

	}

}
