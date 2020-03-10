package com.ipartek.formacion.metodos;

public class EjemploDeUso {

	public static void main(String[] args) throws Exception {

		String manolo = "Manolo";

		Utilidades.saludar(manolo);

		Utilidades.saludar(manolo, Utilidades.IDIOMA_CASTELLANO);
		Utilidades.saludar(manolo, Utilidades.IDIOMA_EUSKERA);
		Utilidades.saludar(manolo, Utilidades.IDIOMA_INGLES);

		System.out.println(" 3 + 3 = " + Utilidades.suma(3, 3));

		try {
			System.out.println("La letra del dni 11111111 es " + Utilidades.calcularLetraDni("11111111"));
			System.out.println("La letra del dni 11111111 es " + Utilidades.calcularLetraDni(11111111));
			System.out.println("La letra del dni 1234 es " + Utilidades.calcularLetraDni(1234));

			System.out.println("La letra del dni 11111111 es " + Utilidades.calcularLetraDni(null));
			System.out.println("La letra del dni 11111111 es " + Utilidades.calcularLetraDni("mi dni"));
			System.out.println("La letra del dni 11111111 es " + Utilidades.calcularLetraDni("123"));
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

}
