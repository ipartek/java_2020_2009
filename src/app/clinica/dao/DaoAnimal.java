package app.clinica.dao;

import java.util.ArrayList;

public interface DaoAnimal {

	/**
	 * 
	 * @return listado de animales
	 */
	ArrayList<Animal> getAll();

	/**
	 * Busca Animal por su identificador
	 * 
	 * @param id int identificador del animal
	 * @return Animal buscado
	 * @throws Exception si no encuentra el Animal por su id
	 */
	Animal getById(int id) throws Exception;

	/**
	 * Elimina Animal
	 * 
	 * @param id int identificador del animal
	 * @return Animal que acaba de eliminar
	 * @throws Exception lanza excepcion si no lo encuentra o no puede eliminar
	 */
	Animal delete(int id) throws Exception;

	/**
	 * Actualiza el animal
	 * 
	 * @param animal Animal a modificar, es importante que tenga id
	 * @return Animal modificado
	 * @throws Exception si no encuentra o no puede modificar el Animal
	 */
	Animal update(Animal animal) throws Exception;

	/**
	 * Crea un nuevo animal y actualiza su id
	 * 
	 * @param animal Animal a crear sin el id actualizado
	 * @return Animal a creado con el id actualizado
	 * @throws Exception Si no puede crear el animal
	 */
	Animal create(Animal animal) throws Exception;;

}
