package com.ipartek.formacion.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.clases.Persona;

public class PruebaLeerFichero {

	private static ArrayList<Persona> personas = new ArrayList<Persona>();
	private static int contadorLineasOK = 0;
	private static int contadorLineasErroneas = 0;
	private static int opcion = 0;
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		cargarDatos(); // Lee el fichero linea a linea y rellenar el ArrayList<Persona> personas

		pintarMenu();

		switch (opcion) {
		case 1:
			listarPersonas();
			break;

		case 2:
			buscarNumeroLinea();
			break;

		case 3:
			buscarPorNombre();
			break;

		case 4:
			buscarPorEmail();
			break;

		default:
			break;
		}

		sc.close();

	}

	private static void buscarPorEmail() {

		System.out.println("Dime un email para buscar:");
		String email = sc.nextLine();

		// buscar y rellenar este ArrayList
		ArrayList<Persona> personasEncontradas = new ArrayList<Persona>();

		for (Persona p : personas) {

			if (p.getEmail().equals(email)) {

				personasEncontradas.add(p);

			}

		} // for

		// pintar resultados
		System.out.println("Personas encontradas por " + email);
		System.out.println("----------------------------------------------");
		for (Persona p : personasEncontradas) {
			System.out.println(p);
		}

	}

	private static void buscarPorNombre() {
		System.out.println("Dime un nombre para buscar:");
		String nombre = sc.nextLine();

		// buscar y rellenar este ArrayList
		ArrayList<Persona> personasEncontradas = new ArrayList<Persona>();

		for (Persona p : personas) {

			if (p.getNombre().contains(nombre)) {

				personasEncontradas.add(p);

			}

		} // for

		// pintar resultados
		System.out.println("Personas encontradas por " + nombre);
		System.out.println("----------------------------------------------");
		for (Persona p : personasEncontradas) {
			System.out.println(p);
		}

	}

	private static void buscarNumeroLinea() {
		// TODO Auto-generated method stub

	}

	private static void listarPersonas() {

		System.out.println("Listado Personas");
		System.out.println("----------------------------------------------");

		for (Persona p : personas) {
			System.out.println(p);
		}

	}

	private static void pintarMenu() {
		System.out.println("Introduzca una opcion");
		System.out.println("1.-Listar personas");
		System.out.println("2.-Buscar personas por numero de linea");
		System.out.println("3.-Buscar personas por nombre");
		System.out.println("4.-Buscar personas por email");
		System.out.println("5.-Buscar duplicados de cualquier tipo");
		opcion = Integer.parseInt(sc.nextLine());

	}

	/**
	 * carga todos los datos en el ArrayList de personas
	 */
	static private void cargarDatos() {

		BufferedReader reader;
		System.out.println("Cargando datos desde el fichero al ArrayList");

		try {
			reader = new BufferedReader(new FileReader("src/com/ipartek/formacion/ficheros/personas.txt"));
			String linea;

			// leemos la primera linea que no hay datos, es la cabecera
			linea = reader.readLine();

			// leemos el fichero linea a linea hasta que llegue a la ultima == null
			while ((linea = reader.readLine()) != null) {

				String[] campos = linea.split(";");
				if (campos.length != 6) {
					contadorLineasErroneas++;

				} else {
					contadorLineasOK++;

					Persona p = new Persona();
					p.setNombre(campos[0]);
					p.setEmpresa(campos[1]);
					p.setFechaNacimiento(campos[2]);
					p.setTelefono(campos[3]);
					p.setEmail(campos[4]);
					p.setDni(campos[5]);

					personas.add(p);

				}

			}
			reader.close();

			System.out.println("Lineas Correctas " + contadorLineasOK);
			System.out.println("Lineas Erroneas " + contadorLineasErroneas);
			System.out.println("Total " + (contadorLineasOK + contadorLineasErroneas));
			System.out.println("----------------------------------------------------------");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
