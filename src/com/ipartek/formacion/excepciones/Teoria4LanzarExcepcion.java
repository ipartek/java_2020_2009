package com.ipartek.formacion.excepciones;

import java.util.Scanner;

/**
 * Vamos aprender a Lanzar nosotros una Excepcion
 * 
 * 
 * @author ur00
 *
 */
public class Teoria4LanzarExcepcion {

	public static void main(String[] args) throws Exception {

		System.out.println("Empieza el programa");
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime tu dni sin letra:");
		String linea = sc.nextLine();
		Float numero = Float.parseFloat(linea);

		// try {
		System.out.println("La letra del DNI es " + calcularLetra(linea));
//		} catch (Exception e) {

		// System.out.println("Mensaje: " + e.getMessage());

		// }

	}

	/**
	 * Metodo de palo para probar como Lanzar un Expcecion nostros.
	 * 
	 * @param dniSinLetra
	 * @return siempre retorna una 'x'
	 * @throws Exception si null o lentgh != 8
	 */
	static char calcularLetra(String dniSinLetra) throws Exception {

		if (dniSinLetra == null || dniSinLetra.length() != 8) {

			// lanzar nuestra Excepcion
			throw new Exception("DNI nulo o no tiene longitud de 8");

		} else {
			// TODO hacer la logica para calcular la letra
		}

		return 'x';
	}

}
