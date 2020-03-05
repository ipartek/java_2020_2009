package app.perrera;

import java.util.ArrayList;

public interface PerroDAO {

	ArrayList<Perro> getAll();

	ArrayList<Perro> buscarPorNombre(String nombre);

	ArrayList<Perro> buscarPorRaza(String nombre);

	Perro getById(int id);

	boolean delete(int id);

	/**
	 * Creamos un nuevo Perro y genera el nuevo IDentificador
	 * 
	 * @param p
	 * @return
	 */
	Perro crear(Perro p);

	boolean update(Perro p);

}
