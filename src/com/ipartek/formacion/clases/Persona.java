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
	private String empresa;
	private String fechaNacimiento;
	private String telefono;
	private String email;
	private String dni;
	private int altura; // cm
	private int edad;
	private char genero;
	private String raza;

	public Persona() {
		super();
		this.nombre = "anonimo";
		this.empresa = "";
		this.fechaNacimiento = "";
		this.telefono = "";
		this.email = "";
		this.dni = "";
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

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", empresa=" + empresa + ", fechaNacimiento=" + fechaNacimiento
				+ ", telefono=" + telefono + ", email=" + email + ", dni=" + dni + ", altura=" + altura + ", edad="
				+ edad + ", genero=" + genero + ", raza=" + raza + "]";
	}

}
