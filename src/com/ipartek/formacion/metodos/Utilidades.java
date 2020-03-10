package com.ipartek.formacion.metodos;

public class Utilidades {

	public static final String IDIOMA_CASTELLANO = "es";
	public static final String IDIOMA_EUSKERA = "eu";
	public static final String IDIOMA_INGLES = "en";

	private static final char LETRA_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
			'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

	static void saludar(String nombre) {
		System.out.println("Hola  " + nombre);
	}

	/**
	 * Saluda al nombre pasado por parametro en el idioma seleccionado
	 * 
	 * @see idiomas definidos en esta clase, por ejemplo: public static final String
	 *      IDIOMA_CASTELLANO
	 * @param nombre
	 * @param idioma
	 */
	static void saludar(String nombre, String idioma) {
		System.out.println("Hola  " + nombre);
		// si es void el retorno, no hay return
	}

	static int suma(int a, int b) {
		return a + b;
	}

	static char calcularLetraDni(int dni) throws Exception {
		String sDni = String.valueOf(dni);
		return calcularLetraDni(sDni);
	}

	// DRY Dont Repeat Yourself
	// sobercarga, no es sobre-escritura @override
	// sobrecraga es el mismo nombre de metodo, mismo retorno, pero diferentes
	// parametros
	static char calcularLetraDni(String dni) throws Exception {
		char letra = ' ';
		int numeroDni = 0;
		if (dni != null && dni.length() == 8) {
			numeroDni = Integer.parseInt(dni);
			int restoDivision = numeroDni % 23;
			letra = LETRA_DNI[restoDivision];
		} else {
			throw new Exception("No es un DNI valido " + dni);
		}
		return letra;
	}

}
