package com.ipartek.formacion.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ejemplo1 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Mi primera GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);

		JButton boton = new JButton("Presionar");
		frame.getContentPane().add(boton); // Agrega el botón al panel de contenido del marco
		frame.setVisible(true);

		JTextField texto = new JTextField();
		texto.setText("Hola soy un JTextField");
		frame.getContentPane().add(texto); // Agrega el botón al panel de contenido del marco
		frame.setVisible(true);

	}

}
