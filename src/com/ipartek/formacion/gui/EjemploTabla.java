package com.ipartek.formacion.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;

public class EjemploTabla {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploTabla window = new EjemploTabla();
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
	public EjemploTabla() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// headers for the table
		String[] columns = new String[] { "Id", "Name", "Hourly Rate", "Part Time" };

		Object[][] data = new Object[][] { 
				{ 1, "John", 40.0, false }, 
				{ 2, "Rambo", 70.0, false },
				{ 3, "Zorro", 60.0, true }, 
			};
				
		// create table with data
		JTable table = new JTable(data, columns);

		frame.getContentPane().add(table, BorderLayout.CENTER);

	}
}
