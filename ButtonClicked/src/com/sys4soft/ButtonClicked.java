package com.sys4soft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonClicked {

	public static void main(String[] args) {

		// janela
		JFrame janela = new JFrame("Evento");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(500,300);
		janela.setLayout(null);

		// bot?o
		JButton cmd1 = new JButton("Clique aqui");
		cmd1.setBounds(100, 100, 120, 30);
		
		janela.add(cmd1);
		janela.setVisible(true);
		
		// eventos
		
		// cmd1 (click)
		cmd1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e){
					System.out.println("Bot?o clicado!");
				}
			
			}
		);
		
	}

}
