package com.sys4soft;

import java.awt.Dimension;

public class SwingJFrame {

//	public static void main(String[] args) {
//		frmMenuPrincipal formulario = new frmMenuPrincipal();
//	}

	public static void main(String[] args) {
		frmMenuPrincipal formulario = new frmMenuPrincipal("Menu Principal", new Dimension(500, 300));
		formulario.setVisible(true);
	}
	
}
