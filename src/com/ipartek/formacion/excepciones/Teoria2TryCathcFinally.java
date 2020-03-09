package com.ipartek.formacion.excepciones;

import java.util.Scanner;

/**
 * Vamos a ver la estructura completa con try catch y finally ( opcional )
 * 
 * @author ur00
 *
 */
public class Teoria2TryCathcFinally {

	public static void main(String[] args) {

		System.out.println("Empieza el programa");
		Scanner sc = new Scanner(System.in);

		try {
			// vigilamos el codigo por si hay laguna Exception
			System.out.println("Estamos dentro del try");
			System.out.println("Dime un numero por favor:");
			String linea = sc.nextLine();
			Float numero = Float.parseFloat(linea);

			System.out.println("Ultima linea del try, el numero es " + numero);

		} catch (Exception e) {
			// Este codigo se ejecuta si hay Exception
			System.out.println("Lo sentimos pero tenemos un problema");

			System.out.println("Causa: " + e.getCause());
			System.out.println("Mensaje: " + e.getMessage());

			// si queremos ver la traza de la Excepcion descomentar esta linea
			// e.printStackTrace();

		} finally { // opcional
			// se ejecuta siempre haya o no haya Exception
			sc.close();
			System.out.println("Siempre se ejecuta");
		}

		System.out.println("Termina el programa");

	}

}
