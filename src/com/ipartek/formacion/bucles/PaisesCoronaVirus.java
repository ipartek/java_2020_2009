package com.ipartek.formacion.bucles;

import java.util.Scanner;

public class PaisesCoronaVirus {

	public static void main(String[] args) {

		final String[] PAISES = { "Noruega", "Alemania", "Republica Txeka", "Italia" };
		boolean[] paisesInfectados = { false, false, false, false };
		int[] numeroInfectados = { 0, 0, 0, 0 };
		int total = 0;
		Scanner sc = new Scanner(System.in);

		// recorrer paises y preguntar si existe algun caso de corona virus
		for (int i = 0; i < PAISES.length; i++) {

			System.out.println("¿ Tiene algun caso de CV " + PAISES[i] + " ?   Si o No");
			String pregunta1 = sc.nextLine();

			if ("si".equalsIgnoreCase(pregunta1)) {

				System.out.println("¿Cuantos casos?");
				int pregunta2 = Integer.parseInt(sc.nextLine());
				total += pregunta2;

				// actualizar arrays
				paisesInfectados[i] = true;
				numeroInfectados[i] = pregunta2;

			}

		} // for de las preguntas

		// finalmente

		// 1: mostrar paises libres de corona virus
		System.out.println("Paises NO Infectados:");
		System.out.println("------------------------------------");
		for (int i = 0; i < PAISES.length; i++) {

			if (!paisesInfectados[i]) {
				System.out.println(PAISES[i]);
			}

		}

		// 2: mostrar paises infectados junto con su numero de casos
		System.out.println("");
		System.out.println("");
		System.out.println("Paises Infectados:");
		System.out.println("------------------------------------");
		for (int i = 0; i < PAISES.length; i++) {

			if (paisesInfectados[i] && numeroInfectados[i] > 10) {
				System.out.println("*** " + PAISES[i] + " " + numeroInfectados[i]);

			} else if (paisesInfectados[i] && numeroInfectados[i] > 5) {
				System.out.println("** " + PAISES[i] + " " + numeroInfectados[i]);

			} else if (paisesInfectados[i]) {
				System.out.println("*" + PAISES[i] + " " + numeroInfectados[i]);

			}

		} // for

		// 3: total numero de personas infectadas

		System.out.println("TOTAL Infectados: " + total);

		sc.close();

	}
}
