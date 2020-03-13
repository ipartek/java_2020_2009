package com.ipartek.formacion.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextPane;

public class AppSWing {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppSWing window = new AppSWing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppSWing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnNewButton = new JButton("Pulsame");
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);

		JTextPane txtpnAlgoSaldra = new JTextPane();

		txtpnAlgoSaldra.setText("Algo saldra");
		txtpnAlgoSaldra.setToolTipText("Pulsa el boton de abajo");
		frame.getContentPane().add(txtpnAlgoSaldra, BorderLayout.NORTH);

		String week[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

		JList list = new JList(week);
		frame.getContentPane().add(list, BorderLayout.WEST);

		Panel panel = new Panel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		Label label = new Label("Nombre");
		label.setBounds(21, 5, 51, 22);
		panel.add(label);

		Label lNombre = new Label("");
		lNombre.setBounds(78, 5, 62, 22);
		panel.add(lNombre);

		// listeners

		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (list.getSelectedValue() != null) {
					String diaSeleccionado = list.getSelectedValue().toString();
					txtpnAlgoSaldra.setForeground(Color.GREEN);
					txtpnAlgoSaldra.setText("Muy bien has pulsado el botón, hoy es " + diaSeleccionado);

					lNombre.setText(diaSeleccionado);

				} else {
					txtpnAlgoSaldra.setForeground(Color.RED);
					txtpnAlgoSaldra.setText("Selecciona un dia de la lista por favor");

				}

			}
		});

	}
}
