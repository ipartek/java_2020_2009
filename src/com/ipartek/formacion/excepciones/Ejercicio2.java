package com.ipartek.formacion.excepciones;

import java.util.Scanner;

/**
 * Realice un programa que nos solicite por teclado dos n�meros, y leerlos
 * usando la clase Scanner mediante la funci�n nextLine(). Transformar ambos
 * strings a n�meros enteros usando la siguiente sentencia
 * Integer.parseInt(numeroLeido). Agrupar el c�digo entre un bloque try catch y
 * procesar para que no se produzca una interrupci�n y finalizaci�n del programa
 * si alguno de los n�meros le�dos no puede convertirse, retomando el control en
 * el punto del fallo, hasta que se solucione
 * 
 * 
 * @author ur00
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String linea = "";
		boolean repetir = true;

		do {

			try {

				System.out.println("1� numero:");
				linea = sc.nextLine();
				a = Integer.parseInt(linea);

				System.out.println("2� numero:");
				linea = sc.nextLine();
				b = Integer.parseInt(linea);

				System.out.println("1� numero=" + a + " 2� numero=" + b);
				repetir = false;

			} catch (Exception e) {
				System.out.println("Por favor introduce de nuevo dos numeros validos");

			}
		} while (repetir);

		System.out.println("Termina App");
		sc.close();

	}// main

}// clase
