package com.ipartek.formacion.clases;

public class Persona {

	public static final char GENERO_FEMENINO = 'f';
	public static final char GENERO_MASCULINO = 'm';
	public static final char GENERO_INDEFINIDO = 'i';

	// ATRIBUTOS
	// siempre son 'private' para que no se puedan manipular desde fuera de esta
	// clase, para poder manipular los atributos hay que crear metodos 'publicos'
	// denominados getters y setters. Ha esto se le llama 'encapsulacion'
	private String nombre;
	private int altura; // cm
	private int edad;
	private char genero;
	private String raza;

	public Persona() {
		super();
		this.nombre = "anonimo";
		this.altura = 0;
		this.edad = 0;
		this.genero = GENERO_INDEFINIDO;
		this.raza = "";
	}

	public Persona(String nombre, char genero) {
		this();
		this.nombre = nombre;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", genero=" + genero + ", raza="
				+ raza + "]";
	}

}
