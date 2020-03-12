package com.ipartek.formacion.clases.pruebas;

import com.ipartek.formacion.clases.Alumno;
import com.ipartek.formacion.clases.Persona;
import com.ipartek.formacion.clases.Profesor;

public class ProfesorALumnos {

	public static void main(String[] args) {

		Profesor profesor = new Profesor();
		profesor.setNombre("Einstein");
		profesor.setMateria("Fisica cuantica");

		// crear un array de Alumnos
		Alumno[] arrayAlumnos = new Alumno[3];

		Alumno jaimito = new Alumno();
		jaimito.setNombre("Jaimito");
		jaimito.setGenero(Persona.GENERO_MASCULINO);
		jaimito.setNota(4);

		Alumno jaimita = new Alumno();
		jaimita.setNombre("Jaimita");
		jaimita.setGenero(Persona.GENERO_FEMENINO);
		jaimita.setNota(9);

		Alumno hodei = new Alumno();
		hodei.setNombre("hodei");
		hodei.setGenero(Persona.GENERO_INDEFINIDO);
		hodei.setNota(7);

		arrayAlumnos[0] = jaimito;
		arrayAlumnos[1] = jaimita;
		arrayAlumnos[2] = hodei;

		System.out.println("El profesor " + profesor.getNombre() + " imparte la materia de: " + profesor.getMateria());
		System.out.println("Sus alumnos son:");

		for (Alumno alumno : arrayAlumnos) {
			System.out.println(alumno.getNombre() + " nota: " + alumno.getNota());
			// System.out.println(alumno.toString());
		}

		// conseguir nota media
		// buscar Alumno con mejor nota
		Alumno alumnoNotaMaxima = new Alumno();
		int notaMaxima = -1;
		float totalNotas = 0;
		for (int i = 0; i < arrayAlumnos.length; i++) {
			Alumno alumno = arrayAlumnos[i];
			totalNotas += alumno.getNota();

			if (notaMaxima < alumno.getNota()) {
				notaMaxima = alumno.getNota();
				alumnoNotaMaxima = alumno;
			}

		}

		System.out.println("La nota Total es: " + totalNotas);
		System.out.println("La nota Media es: " + (totalNotas / arrayAlumnos.length));
		System.out.println("Alumno con mejor nota: " + alumnoNotaMaxima);

	}

}
