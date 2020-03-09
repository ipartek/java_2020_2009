package com.ipartek.formacion.metodos;

public class EjemploDeUso {

	public static void main(String[] args) {

		String manolo = "Manolo";

		Utilidades.saludar(manolo);

		Utilidades.saludar(manolo, Utilidades.IDIOMA_CASTELLANO);
		Utilidades.saludar(manolo, Utilidades.IDIOMA_EUSKERA);
		Utilidades.saludar(manolo, Utilidades.IDIOMA_INGLES);

		System.out.println(" 3 + 3 = " + Utilidades.suma(3, 3));

		System.out.println("La letra del dni 11111111 es " + Utilidades.calcularLetraDni("11111111"));
		System.out.println("La letra del dni 11111111 es " + Utilidades.calcularLetraDni(11111111));

	}

}
