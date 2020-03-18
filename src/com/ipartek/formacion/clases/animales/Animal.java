package com.ipartek.formacion.clases.animales;

public class Animal {

	private String nombre;
	private String raza;

	public Animal() {
		super();
		this.nombre = "";
		this.raza = "";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", raza=" + raza + "]";
	}

}
