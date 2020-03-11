package com.ipartek.formacion.clases;

public class Vehiculo {

	// 1. Atributos
	private String color;
	private String matricula;
	private int numeroRuedas;
	private int numeroPuertas;
	private float potencia; // cv

	// 2. Constructores
	public Vehiculo() {
		super();
		this.color = "";
		this.matricula = "";
		this.numeroRuedas = 0;
		this.numeroPuertas = 0;
		this.potencia = 0;
	}

	// Constructor sobrecargado
	public Vehiculo(String color, String matricula) {
		// super();
		this(); // llamamos al constructor por defecto
		this.color = color;
		this.matricula = matricula;
	}

	public Vehiculo(String color, String matricula, int numeroPuertas) {

		// this.color = color;
		// this.matricula = matricula;
		this(color, matricula);
		this.numeroPuertas = numeroPuertas;
	}

	// 3. Getters y setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	// 4. toString
	// sobreescritura el metodo del padre
	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", matricula=" + matricula + ", numeroRuedas=" + numeroRuedas
				+ ", numeroPuertas=" + numeroPuertas + ", potencia=" + potencia + "]";
	}

	// 5. Resto de [ metedos || funciones || comportamientos ] si hiciesen falta

}
