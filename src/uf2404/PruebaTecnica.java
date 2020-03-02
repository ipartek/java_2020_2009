package uf2404;

public class PruebaTecnica {

	public static void main(String[] args) {

		System.out.println("Prueba tecnica");

		System.out.println("** Empezamos bucle");
		for (int i = 0; i < 5; i++) {

			if (i == 0) {

				System.out.println("El cero no es PAR ni IMPAR");

			} else if (i % 2 == 0) {

				System.out.println(i + " Es Par");

			} else {

				System.out.println(i + " Es Impar");
			}

		} // for

		System.out.println("** Terminamos el bucle");

	}// main

}// clase
