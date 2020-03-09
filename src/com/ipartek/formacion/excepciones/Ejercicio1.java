package com.ipartek.formacion.excepciones;

import java.util.Scanner;

/**
 * Implemente un programa que lea un n�mero �a� y otro n�mero �b� y luego
 * calcule �a/b�. Pruebe a introducir b=0 y ver que hace el programa con la
 * divisi�n por cero. Pruebe a introducir b=�Carlos� para ver c�mo se comporta
 * el programa. A�ada excepciones para recoger estas excepciones y avisar del
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

			System.out.println("1� numero:");
			linea = sc.nextLine();
			a = Integer.parseInt(linea);

			System.out.println("2� numero:");
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
