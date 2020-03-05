package prueba;

public class Ejercicio2 {

	public static void main(String[] args) {

		String nombre = "Ander";
		String[] alumnos = { "Ariel", "JR", "JL", "Guillermo" };
		double[] notas = { 5.5, 6.6, 7.7, 8.9 };
		System.out.println("hola " + nombre);

		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("posicion " + i + " alumno " + alumnos[i] + " nota=" + notas[i]);

		} // for

	}// main

}// clase
