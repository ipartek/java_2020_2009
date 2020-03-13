package com.ipartek.formacion.clases.validaciones;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.ipartek.formacion.clases.Pais;

public class ValidacionesPais {

	public static void main(String[] args) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Pais paisOk = new Pais();

		Set<ConstraintViolation<Pais>> errores = validator.validate(paisOk);
		System.out.println("Tiene Errores " + errores.size());

	}

}
