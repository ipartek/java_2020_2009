package com.ipartek.formacion.excepciones;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO capturar Excepciones

		// mostrar la frase por pantalla

		// pedir posicion

		letraDeLaPosicion("LA slluevi en SEcvilla es una maraibvilla", 0);

		letraDeLaPosicion("LA slluevi en SEcvilla es una maraibvilla", -3);

		letraDeLaPosicion(null, 0);

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
