package com.sys4soft;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class frmMenu extends JFrame {

	JButton cmd1;
	JLabel label1;
	ActionListener cmd1_click;
	
	public frmMenu(){
		super("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// definir JPanel
		JPanel painel = new JPanel();
		painel.setPreferredSize(new Dimension(600,400));
		painel.setLayout(null);
		add(painel);
		pack();
		
		// centralizar formul?rio
		setLocationRelativeTo(null);

		int largura = getContentPane().getSize().width;
		int altura = getContentPane().getSize().height;
		
		// criar o evento que permite alterar o conte?do do label1
		cmd1_click = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label1.setText("Foi alterado o texto do label");
				label1.setForeground(Color.RED);
				label1.setOpaque(true);
				label1.setBackground(Color.WHITE);
			}
		};
		
		// bot?o
		cmd1 = new JButton("Alterar label");
		cmd1.setBounds(largura - 130,altura - 40,120,30);
		cmd1.addActionListener(cmd1_click);
		painel.add(cmd1);
		
		// label
		label1 = new JLabel("Texto do label.");
		label1.setBounds(50,50,200,20);
		painel.add(label1);
		
		setResizable(false);
		
		setVisible(true);

	}
	
}
