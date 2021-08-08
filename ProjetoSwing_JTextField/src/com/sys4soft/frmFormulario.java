package com.sys4soft;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class frmFormulario extends JFrame {

	JPanel painel;
	JButton cmd;
	ActionListener cmd_click;
	
	JTextField textbox1;
	JTextField textbox2;
	
	// construtor
	public frmFormulario(){
		super("Formulário de Testes - Swing Components");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JPanel
		painel = new JPanel();
		painel.setPreferredSize(new Dimension(600,400));
		painel.setLayout(null);
		add(painel);
		pack();
		
		// componente
		
		textbox1 = new JTextField();
		textbox1.setBounds(50, 50, 250, 30);
		textbox1.setHorizontalAlignment(JTextField.LEFT);

		textbox2 = new JTextField();
		textbox2.setBounds(50, 100, 250, 30);
		textbox2.setHorizontalAlignment(JTextField.LEFT);
		
		// cmd
		cmd_click = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// código a executar no evento click
				String texto = textbox1.getText() + " " + textbox2.getText();
				Console(texto);
			}
		};
		
		// criar cmd
		cmd = new JButton("Clique aqui");
		cmd.setBounds(400, 350, 120, 30);
		cmd.addActionListener(cmd_click);
		painel.add(cmd);
		painel.add(textbox1);
		painel.add(textbox2);
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public void Console(String str){
		// apresenta texto no console
		System.out.println(str);
	}
	
}