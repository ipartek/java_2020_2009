package app.perrera;

public class Perro {

	int id;
	String nombre;
	String raza;

	public Perro() {
		super();
		// TODO Auto-generated constructor stub
		// un peroo inicialmente
		// id 0
		// nombre ""
		// raza "cruce"
	}

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}

	// Constructor

	// GETERS seTTERS

	// TOSTRING
	@Override
	public String toString() {
		return "Perro [id=" + id + ", nombre=" + nombre + ", raza=" + raza + "]";
	}

}
