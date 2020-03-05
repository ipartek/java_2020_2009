package com.ipartek.formacion.string;

/**
 * @see http://www.interior.gob.es/web/servicios-al-ciudadano/dni/calculo-del-digito-de-control-del-nif-nie
 * @author ur00
 *
 */
public class CalcularLetraDNI {

	public static void main(String[] args) {

		final char LETRA_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };
		String dniTexto = "12345678";
		int numeroDni = Integer.parseInt(dniTexto);

		int restoDivision = numeroDni % 23;

		System.out.println("La letra es " + LETRA_DNI[restoDivision]);

	}

}
