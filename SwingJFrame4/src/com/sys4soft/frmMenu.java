package com.sys4soft;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class frmMenu extends JFrame {

	JButton cmd1;
	JLabel label1;
	
	public frmMenu(){
		super("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// definir JPanel
		JPanel painel = new JPanel();
		painel.setPreferredSize(new Dimension(600,400));
		painel.setLayout(null);
		add(painel);
		pack();
		
		// centralizar formul�rio
		setLocationRelativeTo(null);

		int largura = getContentPane().getSize().width;
		int altura = getContentPane().getSize().height;
		
		// bot�o
		cmd1 = new JButton("Sair");
		cmd1.setBounds(largura - 110,altura - 40,100,30);
		painel.add(cmd1);
		
		// label
		label1 = new JLabel("Texto do label.");
		label1.setBounds(50,50,200,20);
		painel.add(label1);
		
		setResizable(false);
		
		setVisible(true);

	}
	
}
