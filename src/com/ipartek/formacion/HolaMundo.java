package com.ipartek.formacion;

/*
 * Esto es un comentatio de bloque
 * podemos escribir varias lineas de codigo
 */

/**
 * JavaDoc es para documentar el codigo fuente o src
 * 
 * @author ur00
 *
 */
public class HolaMundo {

	// Las Clases empiezan con Mayuscula y CamelCase
	// las variables empiezan con minuscula y PascalCase

	// todo nuestro codigo para ejecutar debe estar dentro del MAIN
	public static void main(String[] args) {

		// String: es el tipo de la variable
		// persona: nombre de la varaiable
		// "Ander": es el valor que asignamos a la variable
		String persona = "Ander";
		int edad = 39;
		float altura = 1.70f; // hay que poner una f al final o (float) por delante
		// float otraAltura = (float) 1.70;
		boolean isGoodDay = false;

		// usamos el operador + para concatenar String o Cadenas de Texto
		System.out.println("Mi nombre es " + persona);
		System.out.println("Mi edad es " + edad);
		System.out.println("Mi altura es " + altura + " metros");

		if (isGoodDay) {
			System.out.println("Hoy tengo un dia bueno");
		} else {
			System.out.println("Hoy es un dia de malo");
		}

	}

} // final de la clase
