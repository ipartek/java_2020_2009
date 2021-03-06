package app.clinica.dao;

import java.util.ArrayList;

/**
 * Clase que implementa la interfaz DaoAnimal <br>
 * Tiene un patron singleton @see https://es.wikipedia.org/wiki/Singleton
 * 
 * @author ur00
 *
 */
public class AnimalDaoImplArrayList implements DaoAnimal {

	private static ArrayList<Animal> lista;
	private static int contadorIds;

	/* PATRON SINGLETON @see https://es.wikipedia.org/wiki/Singleton */

	private static AnimalDaoImplArrayList INSTANCE = null;

	// Private constructor, no se puede hacer NEW de esta clase, hay que usar el
	// metodo GETINSTANCE() que tenemos abajo
	private AnimalDaoImplArrayList() {
		super();

	}

	public static synchronized AnimalDaoImplArrayList getInstance() {

		if (INSTANCE == null) {
			// haqui es donde se hace el new, por lo cual solo se puede crear un objeto
			INSTANCE = new AnimalDaoImplArrayList();

			// inicializamos las variables
			lista = new ArrayList<Animal>();
			contadorIds = 1;
		}
		return INSTANCE;
	}

	/* Fin patron singleton */

	@Override
	public ArrayList<Animal> getAll() {
		return lista;
	}

	@Override
	public Animal getById(int id) throws Exception {
		Animal resul = null;

		for (Animal a : lista) {
			if (id == a.getId()) {
				resul = a;
				break;
			}
		}

		if (resul == null) {
			throw new Exception("No se encontro animal con id " + id);
		}
		return resul;
	}

	@Override
	public Animal delete(int id) throws Exception {
		Animal resul = null;

		for (int i = 0; i < lista.size(); i++) {
			Animal a = lista.get(i);
			if (id == a.getId()) {
				resul = a;
				lista.remove(i);
				break;
			}
		}

		if (resul == null) {
			throw new Exception("No se encontro animal con id " + id);
		}
		return resul;
	}

	@Override
	public Animal update(Animal animal) throws Exception {
		Animal resul = null;
		int id = animal.getId();

		for (int i = 0; i < lista.size(); i++) {
			Animal a = lista.get(i);
			if (id == a.getId()) {
				resul = a;
				lista.remove(i);
				lista.add(i, animal);
				break;
			}
		}

		if (resul == null) {
			throw new Exception("No se encontro animal con id " + id);
		}
		return null;
	}

	@Override
	public Animal create(Animal animal) throws Exception {

		if (animal != null) {

			animal.setId(contadorIds);
			lista.add(animal);
			contadorIds++;

		} else {
			throw new Exception("No se puede crear NULL");
		}

		return animal;
	}

}
