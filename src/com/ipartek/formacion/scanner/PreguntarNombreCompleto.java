package com.ipartek.formacion.scanner;

import java.util.Scanner;

public class PreguntarNombreCompleto {

	public static void main(String[] args) {

		System.out.println("Dime tu nomnbre:");

		Scanner teclado = new Scanner(System.in);

		String nombre = teclado.nextLine();

		System.out.println("Dime tu 1º Apellido:");
		String ape1 = teclado.nextLine();

		System.out.println("Dime tu 2º Apellido:");
		String ape2 = teclado.nextLine();

		// mostrar por consola nombre completo

		System.out.println(nombre + ", " + ape1 + " " + ape2);

		teclado.close();

	}

}
