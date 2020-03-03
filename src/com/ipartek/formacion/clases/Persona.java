package com.ipartek.formacion.clases;

public class Persona {

	// ATRIBUTOS
	// siempre son 'private' para que no se puedan manipular desde fuera de esta
	// clase, para poder manipular los atributos hay que crear metodos 'publicos'
	// denominados getters y setters. Ha esto se le llama 'encapsulacion'
	private String nombre;
	private int edad;

	// CONSTRUCTORES
	// constructor porque se llama igual que la clase
	public Persona() {
		super();
		this.nombre = "Anonimo";
		this.edad = 18;
	}

	// GETTERS y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {

		if (edad < 0) {
			this.edad = 0;
		} else {
			this.edad = edad;
		}
	}

	// OTRAS FUNCIONES

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
