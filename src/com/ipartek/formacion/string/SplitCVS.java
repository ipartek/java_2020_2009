package com.ipartek.formacion.string;

public class SplitCVS {

	public static void main(String[] args) {

		String lineaCVS = "jose;froilan;16;35.000";
		String[] arrayCampos = lineaCVS.split(";");

		System.out.println("Nombre: " + arrayCampos[0] + " " + arrayCampos[1]);
		System.out.println("Edad: " + arrayCampos[2]);
		System.out.println("Sueldo: " + arrayCampos[3] + " €/mes");

	}

}
