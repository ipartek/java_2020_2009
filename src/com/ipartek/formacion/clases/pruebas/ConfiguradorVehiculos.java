package com.ipartek.formacion.clases.pruebas;

import com.ipartek.formacion.clases.Vehiculo;

public class ConfiguradorVehiculos {

	public static void main(String[] args) {

		// TODO preguntar por consola como quiere el Vehiculo
		// preguntar color
		String color = "rosa";
		// preguntar matricula
		String matricula = "1111 HJK";
		// TODO preguntar puertas y resto de atributos

		Vehiculo custom = new Vehiculo();

		// custom.numeroRuedas = -5;
		custom.setNumeroRuedas(-5);

		custom.setColor(color);
		custom.setMatricula(matricula);
		custom.setNumeroPuertas(5);
		custom.setNumeroRuedas(4);
		custom.setPotencia(150f);

		// mostrar uno a uno todos los atriibutos por consola
		System.out.println("Matricula: " + custom.getMatricula());
		System.out.println("Color: " + custom.getColor());
		System.out.println(custom);
		// TODO mostrar el resto de atributos

	}

}
