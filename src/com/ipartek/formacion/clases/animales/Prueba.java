package com.ipartek.formacion.clases.animales;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {

		// creamos una lista casteada a <Animal> asi podremos añadir cualquier objeto
		// que extienda de esta Clase
		ArrayList<Animal> arcaDeNoe = new ArrayList<Animal>();

		Pez pez = new Pez();
		pez.setRaza("Bakalao");

		Perro perro = new Perro();
		perro.setNombre("Lazy");
		perro.setRaza("Golden Retriever");

		Gato gato = new Gato();
		gato.setNombre("Garfiled");
		gato.setRaza("casero");

		Canario canario = new Canario();
		canario.setNombre("pitiklis");

		Ave ave = new Ave();
		ave.setRaza("Buitre");
		ave.setNombre("cometodo");

		// guardamos los animales en el ArrayList
		arcaDeNoe.add(pez);
		arcaDeNoe.add(perro);
		arcaDeNoe.add(gato);
		arcaDeNoe.add(canario);
		arcaDeNoe.add(ave);

		// podemos recorrer con un foreach todos los Animales de la lista
		// usando la palabra "instanceOf" podemos saber si la instancia o el objeto
		// pertenece a una clase

		for (Animal animal : arcaDeNoe) {

			// Ahora mismo todos los obejtos son de la clase Animal
			// no podemos acceder a los metodos de las clases hijas
			System.out.println(animal);

			// usar instanceof para saber si el objeto pertenece a una clase concreta
			if (animal instanceof Canario) {

				// casteamos el objeto a un objeto de la Clase Canario
				Canario c = (Canario) animal;

				// ya podemos usar sus metodos y atributos
				c.cantar();

			}

			// TODO podeis hacer mas instanceofs para preguntar por otras Clases

		}

	}

}
