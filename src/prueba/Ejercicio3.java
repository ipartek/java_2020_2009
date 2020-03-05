package prueba;

public class Ejercicio3 {

	public static void main(String[] args) {

		int[] temperaturas = new int[7];
		double total = 0;
		int maxima = -100;
		int minima = 100;

		temperaturas[0] = 15;
		temperaturas[1] = 12;
		temperaturas[2] = 15;
		temperaturas[3] = 15;
		temperaturas[4] = 14;
		temperaturas[5] = 25;
		temperaturas[6] = 17;

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println(temperaturas[i]);
			total += temperaturas[i];

			if (temperaturas[i] > maxima) {
				maxima = temperaturas[i];
			}

			if (temperaturas[i] < minima) {
				minima = temperaturas[i];
			}

		} // for

		double media = total / 7;
		System.out.println("Media " + media);
		System.out.println("Maxima " + maxima);
		System.out.println("Minima " + minima);

	}

}
