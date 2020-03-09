package com.ipartek.formacion.excepciones;

import java.util.Scanner;

public class Teoria1 {

	public static void main(String[] args) {

		int[] aNumeros = new int[3];
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Te voy a pedir " + aNumeros.length + " numeros y luego los sumare");

		for (int i = 0; i < aNumeros.length; i++) {

			boolean repetir = true;
			do {
				System.out.println("Dime el numero " + (i + 1));
				String linea = sc.nextLine();

				try {
					int numero = Integer.parseInt(linea);
					suma += numero;
					repetir = false;
				} catch (Exception e) {
					System.out.println("Lo siento pero eso no es un numero");
					// descomentar esta linea para ver el fallo
					// e.printStackTrace();

				}

			} while (repetir);

		} // for

		System.out.println("La suma es " + suma);
		sc.close();

	}// main

}// clase
