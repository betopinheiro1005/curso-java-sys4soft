package com.sys4soft;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class frmFormulario extends JFrame {

	JPanel painel;
	JButton cmd;
	
	ActionListener cmd_click;
	ActionListener combo_selected_changed;
	
	JComboBox combo;
	
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
		
		combo_selected_changed = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox temp = (JComboBox)e.getSource();
				String valor = temp.getSelectedItem().toString();
				Console(valor);
			}
		};
		
		// componente
		String[] array_itens = {"Primeiro", "Segundo", "Terceiro", "Quarto"};
		combo = new JComboBox(array_itens);
		combo.setBounds(50, 50, 150, 20);
		combo.addActionListener(combo_selected_changed);
		// combo.setEditable(true);
		// combo.setSelectedIndex(2);
		painel.add(combo);
		
		// cmd
		cmd_click = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// código a executar no evento click
				Console(combo.getSelectedItem().toString());
				// Console(String.valueOf(combo.getSelectedIndex()));
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