package com.ipartek.formacion.excepciones;

import java.util.Scanner;

/**
 * Realizar un programa que lance un número aleatorio del 1 al 6. Según el
 * número sacado, se lanzara una excepción u otra de la siguiente lista: • 1:
 * ArithmeticException • 2: NullpointerException • 3: NumberFormatException • 4:
 * SecurityException • 5: NegativeArrayException • 6: IOException
 * 
 * @author ur00
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		try {

			System.out.println("Escribe un numero entre 1 y 6");
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				int resultado = 3 / 0;
				break;
			case 2:
				Object objetoNulo = null;
				objetoNulo.toString();
				break;
			case 3:
				Integer.parseInt("Esto no es un numero");
				break;
			case 4:
				throw new SecurityException(
						"La lanzamos nosotros, si alguien la ve de aqui al final del curso 1 punto extra");
			// break;

			default:
				throw new Exception("No has elgido bien");
			// break;
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.printStackTrace();

		}

	}

	/**
	 * Conseguimos la letra de la posicion indicada de la frase
	 * 
	 * @param frase    String
	 * @param posicion int
	 * @return char letra de la posicion indicada de la frase
	 */
	static char letraDeLaPosicion(String frase, int posicion) {
		return frase.charAt(posicion);
	}

}
