package org.ual.hmis.ejercicio03;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio03Test {

	@Test
	public void testComprobarCadenaCorrecta() {
		Ejercicio03 ej = new Ejercicio03();
		assertTrue(ej.comprobarCadena("asfs", "asfds"));
	}
	
	@Test
	public void testComprobarCadenaIncorrecta() {
		Ejercicio03 ej = new Ejercicio03();
		assertFalse(ej.comprobarCadena("", ""));
	}
	
	@Test
	public void testComprobarCadenaMayor30() {
		Ejercicio03 ej = new Ejercicio03();
		assertFalse(ej.comprobarCadena("asdfghjjklñpoiuytrewqzxcvbnmkjhnhbj", "asdfghjjklñpoiuytrewqzxcvbnmkjhnhbj"));
	}

	

}
