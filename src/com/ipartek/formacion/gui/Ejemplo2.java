package com.ipartek.formacion.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo2 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Mi primera GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);

		JButton boton = new JButton("Presionar");
		frame.getContentPane().add(boton); // Agrega el botón al panel de contenido del marco
		frame.setVisible(true);

	}

}
