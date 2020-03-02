package ejercicio.basico.principiantes;

import java.util.Scanner;

/**
 * 
 * Ejercicio para pedir 3 numeros por pantalla y sacar la media
 *
 */
public class MediaNumeros {

	public static void main(String[] args) {

		int num1, num2, num3;
		float media;
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el primer numero:");
		String linea = sc.nextLine();
		num1 = Integer.parseInt(linea);

		System.out.println("Dime el segundo numero:");
		num2 = Integer.parseInt(sc.nextLine());

		System.out.println("Dime el tercer numero:");
		num3 = Integer.parseInt(sc.nextLine());

		media = (num1 + num2 + num3) / (float) 3;

		System.out.println(media);

		sc.close();

	}

}
