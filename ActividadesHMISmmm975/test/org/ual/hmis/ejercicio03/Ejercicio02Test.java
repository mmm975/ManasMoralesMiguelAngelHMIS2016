package org.ual.hmis.ejercicio03;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Ejercicio02Test {
	@Test
	public void testComprobarNumero() {
		// 1.
		Ejercicio02 ej = new Ejercicio02();
		// 2.
		assertTrue(ej.comprobarNumero(-1) == false);
		assertTrue(ej.comprobarNumero(-10) == false);
		assertTrue(ej.comprobarNumero(0) == true);
		assertTrue(ej.comprobarNumero(1) == true);
		assertTrue(ej.comprobarNumero(15) == true);

	}
}