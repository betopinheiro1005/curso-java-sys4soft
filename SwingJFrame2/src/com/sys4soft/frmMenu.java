package com.sys4soft;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class frmMenu extends JFrame {
	
	public frmMenu(){
		super("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// definir JPanel
		JPanel painel = new JPanel();
		painel.setPreferredSize(new Dimension(500,300));
		add(painel);
		pack();
		
		// centralizar formul?rio
		setLocationRelativeTo(null);
		setVisible(true);
		
		// apresentar duas dimens?es de JFrame
		Dimension exterior = getSize();
		Dimension interior = getContentPane().getSize();

		System.out.println(exterior);
		
		System.out.println("Dimens?o exterior = " + exterior.width + " x " + exterior.height);
		System.out.println("Dimens?o interior = " + interior.width + " x " + interior.height);		
	}

}
