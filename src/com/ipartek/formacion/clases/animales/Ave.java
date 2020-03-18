package com.ipartek.formacion.clases.animales;

public class Ave extends Animal {

	private boolean vuela; // algunas Aves no vuelan, ej: pinguino

	public Ave() {
		super();
		this.vuela = true;
	}

	public boolean isVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}

}
