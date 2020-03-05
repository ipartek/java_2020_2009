package prueba;

import java.util.Scanner;

/**
 * Comentar la jugada....
 * 
 * @author ur00
 *
 */
public class EjercicioB {

	static Scanner sc;

	public static void main(String[] args) {

		int opcion = 0;
		sc = new Scanner(System.in);
		boolean continuar = true;

		do {
			pintarMenu();
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				calcularDNI();
				break;

			case 2:
				convertirMetrosApies();
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

	private static void pintarMenu() {
		System.out.println("1. Calcular letra DNI");
		System.out.println("2. Convertir de pies a metros");
		System.out.println("3. salir");
		System.out.println("Por favor selecciona una opcion del 1 al 3");

	}

	private static void convertirMetrosApies() {
		// TODO Auto-generated method stub

	}

	private static void calcularDNI() {
		System.out.println("Dime tu dni");
		String dni = sc.nextLine();
		System.out.println(dni);

	}

}// clase
