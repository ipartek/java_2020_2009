package prueba.segunda;

import java.util.ArrayList;
import java.util.Scanner;

public class ConcesionarioArrayList {

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

		// ArrayList es dinamico la reserva de espacios, no como un array que es
		// estatico
		// prodemos almacenar todos los que queramos sin reservaar espacio
		// Coche[] coches = new Coche[3]; // reserva 3 espacio de memoria a NULL
		ArrayList<Coche> coches = new ArrayList<Coche>();
		int contadorCoches = 0;

		Scanner sc = new Scanner(System.in);

		// flag para saber si seguimos dentro del While
		boolean continuar = true;
		System.out.println("Recuerda que como M�ximo puedes crear 3 Coches");
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
			// coches[contadorCoches] = coche;
			coches.add(coche);
			contadorCoches++;

			// preguntar si desea continuar
			System.out.println("� Quieres crear otro coche ?  Escribe 's' para si o 'n' para terminar");
			char respuesta = sc.nextLine().charAt(0);
			if ('n' == respuesta) {
				continuar = false;
			}

		} while (continuar);

		// mostrar todos los cohes del array
		System.out.println("Los coches almacenados en el array son: ");
		for (Coche c : coches) {

			System.out.println(c);

		}

		sc.close();
		System.out.println("Fin del programa");

	}

}
