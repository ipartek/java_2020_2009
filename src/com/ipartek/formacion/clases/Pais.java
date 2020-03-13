package com.ipartek.formacion.clases;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Pais {

	@NotBlank
	private String nombre;

	@Min(0)
	private int infectados;

	public Pais() {
		super();
		this.nombre = "";
		this.infectados = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getInfectados() {
		return infectados;
	}

	public void setInfectados(int infectados) {
		this.infectados = infectados;
	}

	public boolean isInfectado() {

		return this.infectados > 0;
	}

	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", infectados=" + infectados + "]";
	}

}
