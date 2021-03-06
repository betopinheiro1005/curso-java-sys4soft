package com.sys4soft;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class frmFormulario extends JFrame {

	JPanel painel;
	JButton cmd;
	ActionListener cmd_click;
	JCheckBox check;
	ItemListener check_selected;
	
	// construtor
	public frmFormulario(){
		super("Formul?rio de Testes - JCheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JPanel
		painel = new JPanel();
		painel.setPreferredSize(new Dimension(600,400));
		painel.setLayout(null);
		add(painel);
		pack();
		
		// componente
		check_selected = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					Console("Sim");					
				} else {
					Console("N?o");
				}
			}
		};
		
		check = new JCheckBox("Gravar tudo ao sair");
		check.setBounds(50,50,200,30);
		check.addItemListener(check_selected);
		painel.add(check);
		
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