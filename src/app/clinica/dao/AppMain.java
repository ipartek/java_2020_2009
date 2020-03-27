package app.clinica.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AppMain {

	static private Scanner sc;

	// Esto lo gestiona el AnimalDaoImplArrayList
	// static private int ids = 2; // Nos va a servir para gestionar los IDs para
	// los animales
	// static private ArrayList<Animal> animales;
	static private AnimalDaoImplArrayList dao;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		dao = AnimalDaoImplArrayList.getInstance(); // no se puede hacer new, patron singleton
		int opcion = 0;

		crearAnimales();

		do {
			System.out.println("Bienvenido a la aplicacion gestion de mascotas");
			System.out.println("Introduzca una opcion");
			System.out.println("0.- Ver Mascotas");
			System.out.println("1.- Registrar nueva mascota");
			System.out.println("2.- Buscar mascotas por id");
			System.out.println("3.- Ver historial de la mascota");
			System.out.println("4.- Nueva Revision para la mascota");
			System.out.println("5.- Salir");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {
			case 0:
				verMascotas();
				break;

			case 1:
				registrarMascota();

				break;

			case 2:
				Animal buscado = buscarPorId();
				if (buscado != null) {
					System.out.println(buscado);
				} else {
					System.out.println("Lo sentimos pero no hemos encontrado la mascota");
				}
				break;

			case 3:
				verHistorialMascota();
				break;

			case 4:
				nuevaRevision();
				break;

			default:
				break;
			}
		} while (opcion != 5);
		System.out.println("Salio del programa");

	}

	private static void crearAnimales() {

		System.out.println("Creamos unos animales de prueba.......");

		Animal perro = new Animal();
		perro.setEdad(1);
		perro.setEspecie("can");
		perro.setId(1);
		perro.setRaza("labrador");

		Revision r1 = new Revision();
		r1.setDiagnostico("tiene pulgas");
		r1.setFechaRevisión(new Date());
		r1.setIdDoctor("Dr 123");
		r1.setMotivo("parece que no lo cuidan");
		r1.setTratamiento("pepeta antiparasitos");

		perro.getRevisiones().add(r1);

		// TODO llamar al dao
		// dao.create(animal)
		// animales.add(perro);

	}

	private static void verMascotas() {

		// Usamos el dao
		ArrayList<Animal> animales = dao.getAll();

		System.out.println("-----------  MASCOTAS  ---------------------------");
		System.out.println("---- Tenemos " + animales.size() + " mascotas en nuestra clinica ---------");
		System.out.println("------------------------------------------------");

		for (Animal animal : animales) {
			System.out.println(animal);
		}

		System.out.println("------------------------------------------------");

	}

	/**
	 * Método que muestra una mascota buscando por su id
	 */
	private static Animal buscarPorId() {
		int id = 0;

		System.out.println("Introduzca id a buscar");
		id = Integer.parseInt(sc.nextLine());

		// TODO llamar al DAO, cuidadin con la exception
		// Animal animalEncontrado = dao.getById(id);

		return null;
	}

	/**
	 * Método que añade un registro nuevo de un ingreso de una mascota
	 */
	private static void nuevaRevision() {

		Animal animal = buscarPorId();

		// Crear nueva revision
		Revision revision = new Revision();
		System.out.println("Introduzca diagnostico");
		revision.setDiagnostico(sc.nextLine());
		System.out.println("Introduzca id Veterinario");
		revision.setIdDoctor(sc.nextLine());
		System.out.println("Introduzca motivo");
		revision.setMotivo(sc.nextLine());
		System.out.println("Introduzca tratamiento");
		revision.setTratamiento(sc.nextLine());

		// añadir revision al animal, lo hacemos en una sola linea, pero son dos
		// operaciones
		// 1. Conseguimos el ArrayList de las revisiones => animal.getRevisiones()
		// 2. Añadimos una nueva revision en el ArrayList => add(revision)
		animal.getRevisiones().add(revision);

	}

	/**
	 * Método que muestra el historial de ingresos de una mascota
	 */
	private static void verHistorialMascota() {
		String nombre = "";
		System.out.println("Intoduzca nombre de la mascota para ver su id");
		nombre = sc.nextLine();

		// TODO recuperar Animal por id con el dao y hacer getRevisiones();
	}

	/**
	 * Método que da de alta una mascota
	 */
	private static void registrarMascota() {
		Animal animal = new Animal();
		System.out.println("Introduzca nombre");
		animal.setNombre(sc.nextLine());
		System.out.println("Introduzca especie");
		animal.setEspecie(sc.nextLine());
		System.out.println("Introduzca raza");
		animal.setRaza(sc.nextLine());
		System.out.println("Introduzca edad");
		animal.setEdad(Integer.parseInt(sc.nextLine()));

		// ya no hace falta lo hace el dao
		// animal.setId(ids);
		// animales.add(animal);
		// ids++;

		// TODO crear Animal y mostrar por pantalla para ver el id nuevo, cuidadin con
		// la Excepcion
		// dao.create(animal);

	}

}
