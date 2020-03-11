package com.ipartek.formacion.metodos;

public class Vueltas {

	public static final float[] BILLETES_MONEDAS = { 500f, 200f, 100f, 50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f,
			0.05f, 0.02f, 0.01f };

	public static int[] calcularVueltasOptimas(float importe, float entregado) throws Exception {

		int[] vueltas = new int[BILLETES_MONEDAS.length];

		// TODO vuestro marron

		return vueltas;

	}

	public static float calcularVueltas(float importe, float entregado) throws Exception {

		if (entregado < importe) {
			throw new Exception("La cantidad entregada es insuficiente");
		}
		return entregado - importe;
	}

}
