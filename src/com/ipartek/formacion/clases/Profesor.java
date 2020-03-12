package com.ipartek.formacion.clases;

public class Profesor extends Persona {

	private float sueldo;
	private String materia;

	public Profesor() {
		super();
		this.sueldo = 2000;
		this.materia = "";
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return super.toString() + " Profesor [sueldo=" + sueldo + ", materia=" + materia + "]";
	}

}
