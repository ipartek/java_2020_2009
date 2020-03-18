package com.ipartek.formacion.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PruebaLeerFichero {

	public static void main(String[] args) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("src/com/ipartek/formacion/ficheros/personas.txt"));
			String linea;

			// TODO podeis declarar una variable tipo int para contar lineas, int contador =
			// 0;

			while ((linea = reader.readLine()) != null) {

				// TODO la primera linea son cabeceras, no son datos

				System.out.println("----------------------------------------------------------------");

				String[] campos = linea.split(";");

				// TODO resto de campos, cuidado porque todas las lineas no tienen 6 campos, hay
				// alguna con menos
				System.out.println("Esta linea tiene " + campos.length + " campos");
				System.out.println(linea);
				System.out.println("nombre: " + campos[0]);
				System.out.println("empresa: " + campos[1]);

				// TODO contador ++; incrementar la linea

			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
