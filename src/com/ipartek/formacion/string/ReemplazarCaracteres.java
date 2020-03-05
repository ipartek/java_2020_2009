package com.ipartek.formacion.string;

public class ReemplazarCaracteres {

	public static void main(String[] args) {

		String textoCodificado = " h0l4 m1 n0mb3 3s m4n0l0 ";
		String desCodificado = " h0l4 m1 n0mb3 3s m4n0l0 ";

		desCodificado = desCodificado.replace('0', 'o');
		desCodificado = desCodificado.replace('4', 'a');
		desCodificado = desCodificado.replace('3', 'e');
		desCodificado = desCodificado.replace('1', 'i');

		System.out.println(textoCodificado);
		System.out.println(desCodificado);

	}

}
