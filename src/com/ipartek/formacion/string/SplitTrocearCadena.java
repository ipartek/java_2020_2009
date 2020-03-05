package com.ipartek.formacion.string;

public class SplitTrocearCadena {

	public static void main(String[] args) {
		// numero de palabras

		String palabras = "hola mi nombre es Ander";
		String[] arrayPalabras = palabras.split(" ");

		System.out.println("Tenemos " + arrayPalabras.length + " palabras en la frase");

	}

}
