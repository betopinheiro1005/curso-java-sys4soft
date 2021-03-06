package com.sys4soft;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingGridLayout {

	public static void main(String[] args) {

		// criar a janela JFrame
		JFrame janela = new JFrame("Exemplo");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(500, 300);
		
		// label1
		JLabel label1 = new JLabel("Texto do label1.");
		// label1.setHorizontalAlignment(JLabel.CENTER);
		
		// label2
		JLabel label2 = new JLabel("Texto do label2.");

		// label3
		JLabel label3 = new JLabel("Texto do label3.");

		// GridLayout
		GridLayout esquema = new GridLayout(2,2);
		
		janela.setLayout(esquema);
		janela.add(label1);
		janela.add(label2);
		janela.add(label3);
		
		janela.setVisible(true);

	}

}
