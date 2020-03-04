package com.ipartek.formacion;

/*
 * Todas las variables tiene ambito dentro de las llaves { } donde la declaras
 */
public class AmbitoYcalificadores {

	static int variableGlobal = 3;

	public static void main(String[] args) {

		int a = 9;

		for (int i = 0; i < variableGlobal; i++) {

			System.out.println("iteracion " + i);

		} // for

		System.out.println("la variable i no tiene amnbito, solo dentro del for ");
		System.out.println("sin embargo la variable a si se puede" + a);

		pintarMenu();

	}// main

	static void pintarMenu() {

		System.out.println("****************************");
		System.out.println(" 1. Listar pasises         *");
		System.out.println(" 2. Crear                  *");
		System.out.println(" " + variableGlobal + ". Eliminar               *");
		System.out.println("****************************");

	}

}
