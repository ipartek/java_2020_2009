package com.ipartek.formacion.excepciones;

import java.util.Scanner;

/**
 * Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego
 * calcule “a/b”. Pruebe a introducir b=0 y ver que hace el programa con la
 * división por cero. Pruebe a introducir b=”Carlos” para ver cómo se comporta
 * el programa. Añada excepciones para recoger estas excepciones y avisar del
 * problema al usuario
 * 
 * @author ur00
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int resultado = 0;
		String linea = "";

		try {

			System.out.println("1º numero:");
			linea = sc.nextLine();
			a = Integer.parseInt(linea);

			System.out.println("2º numero:");
			linea = sc.nextLine();
			b = Integer.parseInt(linea);

			resultado = a / b;
			System.out.println(" el resultad de a/b=" + resultado);

		} catch (ArithmeticException e) {
			System.out.println("division por cero no permitido");

		} catch (NumberFormatException e) {
			System.out.println("Lo sentimos pero solo numeros");

		} catch (Exception e) {
			System.out.println("Excepcion no controlada");

		} finally {
			sc.close();
		}

	}// main

}// clase
