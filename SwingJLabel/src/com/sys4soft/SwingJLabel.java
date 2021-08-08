package com.sys4soft;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingJLabel {

	public static void main(String[] args) {

		// criar a janela JFrame
		JFrame janela = new JFrame();
		janela.setTitle("T�tulo da janela");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(500, 300);
		
		// criar o JLabel
		JLabel label1 = new JLabel("Este texto pertence a um label.");
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setVerticalAlignment(JLabel.TOP);
		
		janela.add(label1);
		janela.setVisible(true);
	}

}
