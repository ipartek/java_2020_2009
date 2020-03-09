package com.ipartek.formacion.excepciones;

import java.util.Scanner;

/**
 * Vamos a como podemos hacer diferentes Catch<br>
 * Siempre se Captura la final la Exception que es la mas generica <br>
 * Por encima de esta podemos hacer una captura mas fina de otras Excepciones.
 * 
 * 
 * @author ur00
 *
 */
public class Teoria3VariasExcepction {

	public static void main(String[] args) {

		System.out.println("Empieza el programa");
		Scanner sc = new Scanner(System.in);

		try {

			// Null
			// Object objeto = null;
			// objeto.toString();

			// division por cero
			// int resultado = 9 / 0;

			// vigilamos el codigo por si hay laguna Exception
			System.out.println("Estamos dentro del try");
			System.out.println("Dime un numero por favor:");
			String linea = sc.nextLine();
			Float numero = Float.parseFloat(linea);
			System.out.println("Ultima linea del try, el numero es " + numero);

		} catch (NullPointerException e) {
			System.out.println("Excepcion Null");
			e.printStackTrace();

		} catch (ArithmeticException e) {
			System.out.println("Excepcion Aritmetica");
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("Excepcion General");
			e.printStackTrace();

		}
	}

}
