package com.sys4soft;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingLayoutManager {

	public static void main(String[] args) {

		// criar a janela JFrame
		JFrame janela = new JFrame("Janela de teste");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(500, 300);
		
		// label1
		JLabel label1 = new JLabel("Texto do label1.");
		
		// label2
		JLabel label2 = new JLabel("Texto do label2.");

		// label3
		JLabel label3 = new JLabel("Texto do label3.");
		
		janela.setLayout(new FlowLayout());
		janela.add(label1);
		janela.add(label2);
		janela.add(label3);
		
		janela.setVisible(true);
	}

}