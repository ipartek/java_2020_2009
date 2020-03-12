package com.ipartek.formacion.clases.pruebas;

import java.util.Scanner;

import com.ipartek.formacion.clases.Persona;
import com.ipartek.formacion.clases.Profesor;

public class PedirDatosProfesorConsola {

	public static void main(String[] args) {

		Profesor p = new Profesor();
		String nombre = "";
		String materia = "";
		float sueldo = 0;
		char genero = Persona.GENERO_INDEFINIDO;
		Scanner sc = new Scanner(System.in);

		// Pedir datos por consola
		System.out.println("Vamos a dar de alta un nuevo Profesor, necesito los siguientes datos");
		System.out.println("nombre:");
		nombre = sc.nextLine();

		System.out.println("materia que imparte:");
		materia = sc.nextLine();

		System.out.println("El sueldo anual en bruto:");
		sueldo = Float.parseFloat(sc.nextLine());

		System.out.println("Dime su genero, escribe solo una letra 'f' FEMENINO o 'm' MASCULINO ");
		genero = sc.nextLine().charAt(0);

		// rellenar el objeto
		p.setNombre(nombre);
		p.setMateria(materia);
		p.setSueldo(sueldo);
		p.setGenero(genero);

		// mostrar por pantalla
		System.out.println("Gracias por la informacion, hemos dado de alta el siguiente profesor");
		System.out.println(p);

		sc.close();

	}

}
