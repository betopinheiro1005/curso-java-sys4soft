package com.sys4soft;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class frmFormulario extends JFrame {

	JPanel painel;
	JButton cmd;
	ActionListener cmd_click;
	
	// construtor
	public frmFormulario(){
		super("Formul?rio de Testes - Swing Components");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JPanel
		painel = new JPanel();
		painel.setPreferredSize(new Dimension(600,400));
		painel.setLayout(null);
		add(painel);
		pack();
		
		// componente
		
		// cmd
		cmd_click = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// c?digo a executar no evento click
			}
		};
		
		// criar cmd
		cmd = new JButton("Clique aqui");
		cmd.setBounds(400, 350, 120, 30);
		cmd.addActionListener(cmd_click);
		painel.add(cmd);
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public void Console(String str){
		// apresenta texto no console
		System.out.println(str);
	}
	
}