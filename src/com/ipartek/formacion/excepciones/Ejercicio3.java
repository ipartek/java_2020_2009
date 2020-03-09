package com.ipartek.formacion.excepciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int posicion = 0;
		String frase = "";
		char letra = ' ';

		try {
			System.out.println("Dime una frase");
			frase = sc.nextLine();

			System.out.println("Dime un numero de posicion");
			posicion = Integer.parseInt(sc.nextLine());

			letra = letraDeLaPosicion(frase, posicion);

			System.out.println("La letra es " + letra);

		} catch (IndexOutOfBoundsException e) {
			System.out.println("la poscion no es correcta, por favor escribe desde el 0 al " + (frase.length() - 1));

		} catch (Exception e) {
			System.out.println("Eso no es un numero");

		} finally {
			sc.close();
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
