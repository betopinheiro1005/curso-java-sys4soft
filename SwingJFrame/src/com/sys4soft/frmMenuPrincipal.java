package com.sys4soft;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class frmMenuPrincipal extends JFrame {
	
//	public frmMenuPrincipal(){
//		// definir o t?tulo do formul?rio
//		super("Menu Principal");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(500, 300);
//		setVisible(true);
//	}

	// componentes
	JButton cmd_sair;
	JButton cmd_ajuda;
	
	// eventos
	ActionListener cmd_sair_click;
	ActionListener cmd_ajuda_click;
	
	// ===========================================================
	
	public frmMenuPrincipal(String titulo, Dimension dimensao){

		// definir o t?tulo do formul?rio
		super(titulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(dimensao);
		setLayout(null);
		
		// ======================================================
		
		// eventos
		
		// cmd_sair_click
		
		cmd_sair_click = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// System.out.println("Foi clicado o bot?o sair");
				System.exit(0);
			}
		};
		
		// cmd_ajuda_click
		
		cmd_ajuda_click = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Foi clicado o bot?o de ajuda!");
			}
		};
		
		
		// criar os bot?es
		cmd_sair = new JButton("Sair");
		cmd_sair.setBounds(50, 50, 120, 30);
		cmd_sair.addActionListener(cmd_sair_click);
		
		cmd_ajuda = new JButton("Ajuda");
		cmd_ajuda.setBounds(50, 90, 120, 30);
		cmd_ajuda.addActionListener(cmd_ajuda_click);
		
		// adicionar os bot?es ao formul?rio
		add(cmd_sair);
		add(cmd_ajuda);
		
		// centralizar o formul?rio na tela do computador
		Dimension dimensao_monitor = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dimensao_monitor.width/2 - dimensao.width/2,
					dimensao_monitor.height/2 - dimensao.height/2);
		
	}
	
}
