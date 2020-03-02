package ejeficio.basico.principiantes;

import java.util.Scanner;

/**
 * 
 * Pedir al usuario la temperatura de los dias de la semana, comenzando por el
 * lunes<br>
 * Mostrar por pantalla la media de la semana, y la temperatura mas alta y baja
 * 
 * 
 * 
 *
 */
public class MediaNumerosFor {

	public static void main(String[] args) {

		final String[] DIAS_SEMANA = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };
		float temperaturaDia;
		float media = 0f;
		float minima = Float.MAX_VALUE;
		float maxima = Float.MIN_VALUE;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < DIAS_SEMANA.length; i++) {

			String dia = DIAS_SEMANA[i];
			System.out.println("Dime la tempeatura del " + dia);

			temperaturaDia = Float.parseFloat(sc.nextLine());
			media += temperaturaDia;

			if (minima > temperaturaDia) {
				minima = temperaturaDia;
			}

			if (maxima < temperaturaDia) {
				maxima = temperaturaDia;
			}

		} // for

		System.out.println("La media es " + (media / 7));
		System.out.println("minima " + minima + " ºC");
		System.out.println("maxima " + maxima + " ºC");

		sc.close();

	}

}
