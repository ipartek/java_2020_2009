package com.ipartek.formacion.bucles;

import java.util.Scanner;

/**
 * 
 * Ejercicio para pedir 3 numeros por pantalla y sacar la media
 *
 */
public class MediaNumerosBucle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean terminar = true;
		float numero, total = 0;
		float contador = 0;

		do {

			System.out.println("Dime un numero");
			numero = Float.parseFloat(sc.nextLine());
			// total = total + numero;
			total += numero;

			// preguntar si quiere terminar o 'SI' o 'Si' o 'sI' ");
			String linea = sc.nextLine();
			if (linea.equalsIgnoreCase("si")) {
				terminar = false;
			}

			// contador = contador + 1;
			contador++;

		} while (terminar);

		System.out.println("El total es " + total);
		System.out.println("La media es " + (total / contador));

		sc.close();

	}

}
