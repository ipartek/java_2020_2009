package prueba.segunda;

import java.util.Scanner;

public class Concesionario {

	public static void main(String[] args) {

		// variables para recoger valores tecleados por consola
		String matricula = "";
		String marca = "";
		String modelo = "";
		String color = "";
		int potencia = 0;
		int cilindrada = 0;

		// Coche para setear las variables anteriores
		Coche coche = new Coche();

		// Array de Coches donde almacenar los coches creados
		// Solo prodemos crear 3
		Coche[] coches = new Coche[3]; // reserva 3 espacio de memoria a NULL
		int contadorCoches = 0;

		Scanner sc = new Scanner(System.in);

		// flag para saber si seguimos dentro del While
		boolean continuar = true;
		System.out.println("Recuerda que como Máximo puedes crear 3 Coches");
		do {

			System.out.println("Vamos a crear el Coche " + (contadorCoches + 1));
			// Pedir datos por consola
			System.out.println();
			System.out.println("Dime la Matricula");
			matricula = sc.nextLine();

			System.out.println("Dime la Marca");
			marca = sc.nextLine();

			System.out.println("Dime la Modelo");
			modelo = sc.nextLine();

			System.out.println("Dime Color");
			color = sc.nextLine();

			System.out.println("Dime Potencia en CV, recuerda que es un numero entero sin decimales");
			potencia = Integer.parseInt(sc.nextLine());

			System.out.println("Dime Potencia en Cilindrada, recuerda que es un numero entero sin decimales");
			cilindrada = Integer.parseInt(sc.nextLine());

			// Crear nuevo objeto Coche y seterar valores
			coche = new Coche();
			coche.setMarca(marca);
			coche.setMatricula(matricula);
			coche.setModelo(modelo);
			coche.setColor(color);
			coche.setPotencia(potencia);
			coche.setCilindrada(cilindrada);

			// guardar en Array
			coches[contadorCoches] = coche;
			contadorCoches++;

			// preguntar si desea continuar
			System.out.println("¿ Quieres crear otro coche ?  Escribe 's' para si o 'n' para terminar");
			char respuesta = sc.nextLine().charAt(0);
			if ('n' == respuesta) {
				continuar = false;
			}

		} while (continuar); // TODO comprobar que no cree mas de 3 coches

		// mostrar todos los cohes del array
		System.out.println("Los coches almacenados en el array son: ");
		for (Coche c : coches) {

			// TODO no mostrar si es NULL
			System.out.println(c);

		}

		sc.close();
		System.out.println("Fin del programa");

	}

}
