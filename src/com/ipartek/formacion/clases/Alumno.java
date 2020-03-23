package com.ipartek.formacion.clases;

public class Alumno extends Persona {

	public static final int NOTA_MIN = 0;
	public static final int NOTA_MAX = 10;

	private String github;
	private int nota;

	public Alumno() {
		super();

		this.github = "";
		this.nota = 5;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return super.toString() + " Alumno [github=" + github + ", nota=" + nota + "]";
	}

}
