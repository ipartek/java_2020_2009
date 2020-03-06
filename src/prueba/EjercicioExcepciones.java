package prueba;

import java.util.Scanner;

/**
 * Ejercicio para Lorem Ipsum....
 * 
 * @author ur00
 *
 */
public class EjercicioExcepciones {

	public static void main(String[] args) {

		System.out.println("Empezamos");
		int[] alturas = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < alturas.length; i++) {

			System.out.println("Dime un numero:");
			int altura = -1;

			do {
				try {
					altura = Integer.parseInt(sc.nextLine());
				} catch (Exception e) {
					System.out.println("Por favor introduce un numero valido");
				}
			} while (altura == -1);

			alturas[i] = altura;

		} // for

		System.out.println("Agur Venur");

		sc.close();

	}// main

}// clase
