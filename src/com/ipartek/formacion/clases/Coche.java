package com.ipartek.formacion.clases;

/**
 * Ejmemplo para aprender Herencia
 * 
 * @see Vehiculo
 * @author ur00
 *
 */
public class Coche extends Vehiculo {

	private boolean radio;

	public Coche() {
		super();
		// this.numeroRuedas = 5; cambiar en Vehiculo a 'protected' para que sea visible
		setNumeroPuertas(5);
		setNumeroRuedas(4);
		this.radio = false;
	}

	public boolean isRadio() {
		return radio;
	}

	public void setRadio(boolean radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return super.toString() + " Coche [radio=" + radio + "]";
	}

}
