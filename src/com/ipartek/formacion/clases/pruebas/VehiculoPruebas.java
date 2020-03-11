package com.ipartek.formacion.clases.pruebas;

import com.ipartek.formacion.clases.Coche;
import com.ipartek.formacion.clases.Vehiculo;

public class VehiculoPruebas {

	public static void main(String[] args) {

		Vehiculo v1 = new Vehiculo();
		Vehiculo v2 = new Vehiculo("negro", "4444 GPS");
		Vehiculo v3 = new Vehiculo("blanco", "1111 XRS", 5);

		System.out.println("V1: " + v1.toString());
		System.out.println(v2); // No es necesario llamar a toString en un Syso
		System.out.println(v3);

		// vamos a pintar el coche v1
		v1.setColor("rojo");

		// vamos a matricularlo v1
		v1.setMatricula("1234 FGT");

		System.out.println("Despues de pintar y matricular V1");
		System.out.println("matricula: " + v1.getMatricula());
		System.out.println("color: " + v1.getColor());
		System.out.println("puertas: " + v1.getNumeroPuertas());
		System.out.println("ruedas: " + v1.getNumeroRuedas());
		System.out.println("potencia: " + v1.getPotencia() + " cv");

		Coche chincuchento = new Coche();
		chincuchento.setColor("blanco");

		System.out.println("chincuchento => " + chincuchento);

	}

}
