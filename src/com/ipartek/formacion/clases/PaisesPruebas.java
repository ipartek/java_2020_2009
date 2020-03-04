package com.ipartek.formacion.clases;

public class PaisesPruebas {

	public static void main(String[] args) {

		// declarar un Array con 3 paises inicializados con NULL
		Pais[] paises = new Pais[3];

		// crear dos objetos de tipo Pais
		Pais p = new Pais();
		p.setNombre("Egpaña");
		p.setInfectados(100);
		paises[0] = p;

		p = new Pais();
		p.setNombre("EH");
		p.setInfectados(0);
		paises[1] = p;

		// Francia con 300 casos
		p = new Pais();
		p.setNombre("Francia");
		p.setInfectados(300);
		paises[2] = p;

		// mostrar por consola los datos
		for (int i = 0; i < paises.length; i++) {

			Pais paisActual = paises[i];

			if (paisActual.isInfectado()) {
				System.out.println(paisActual.getNombre() + " tiene " + paisActual.getInfectados() + " casos");
			} else {
				System.out.println(paisActual.getNombre() + " de momento libra");
			}

		} // for

	}

}
