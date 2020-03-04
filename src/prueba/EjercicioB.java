package prueba;

import java.util.Scanner;

/**
 * Comentar la jugada....
 * 
 * @author ur00
 *
 */
public class EjercicioB {

	public static void main(String[] args) {

		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;

		do {

			System.out.println("1. Calcular letra DNI");
			System.out.println("2. Convertir de pies a metros");
			System.out.println("3. salir");
			System.out.println("Por favor selecciona una opcion del 1 al 3");

			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				System.out.println("pedir DNI para calcular letra");
				// TODO pedir DNI para calcular letra
				break;

			case 2:
				System.out.println("pedir pies para convetior a metros");
				// TODO pedir pies para convetior a metros
				break;

			case 3:
				System.out.println("Hasta pronto");
				continuar = false;
				break;

			default:
				System.out.println("Por favor selecciona una opcion valida");
				break;

			}// switch

		} while (continuar);

		sc.close();

	}// main

}// clase
