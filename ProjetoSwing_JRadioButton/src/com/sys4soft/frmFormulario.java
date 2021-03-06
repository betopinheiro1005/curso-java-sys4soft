package com.sys4soft;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class frmFormulario extends JFrame {

	JPanel painel;
	JButton cmd;
	ActionListener cmd_click;
	
	JRadioButton r1;
	JRadioButton r2;
	JRadioButton r3;
	JRadioButton r4;
	
	ButtonGroup grupo1;
	
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
		r1 = new JRadioButton("Solteiro");
		r1.setActionCommand("solteiro");
		r1.setSelected(true);
		r1.setBounds(20, 20, 200, 30);
		
		r2 = new JRadioButton("Casado");
		r2.setActionCommand("casado");
		r2.setBounds(20, 40, 200, 30);

		r3 = new JRadioButton("Divorcidado");
		r3.setActionCommand("divorciado");
		r3.setBounds(20, 60, 200, 30);
		
		r4 = new JRadioButton("Vi?vo");
		r4.setActionCommand("vi?vo");
		r4.setBounds(20, 80, 200, 30);
		
		painel.add(r1);
		painel.add(r2);
		painel.add(r3);
		painel.add(r4);

		// grupo1
		
		grupo1 = new ButtonGroup();
		grupo1.add(r1);
		grupo1.add(r2);
		grupo1.add(r3);
		grupo1.add(r4);
		
		// cmd
		cmd_click = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// c?digo a executar no evento click
				String item = grupo1.getSelection().getActionCommand(); 
				Console(item);
				
				if(item == "casado"){
					Console("Este indiv?duo ? casado.");
				}
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