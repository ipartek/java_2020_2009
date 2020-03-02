package com.ipartek.formacion.scanner;

import java.util.Scanner;

public class PreguntarNumero {

	public static void main(String[] args) {

		System.out.println("Dime un numero:");

		Scanner teclado = new Scanner(System.in);

		int numero = teclado.nextInt(); // lee un numero introducido por el usuario

		if (numero == 0) {
			System.out.println("Es Cero");

		} else if (numero % 2 == 0) {
			System.out.println("Par");

		} else {
			System.out.println("Impar");
		}

		teclado.close(); // cerramos el teclado

	}

}
