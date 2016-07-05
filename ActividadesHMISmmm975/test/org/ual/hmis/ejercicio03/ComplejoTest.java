package org.ual.hmis.ejercicio03;

import junit.framework.TestCase;

public class ComplejoTest extends TestCase {
	private Complejo c1;
	private Complejo c2;

	public void setUp() {
		c1 = new Complejo(3, 5);
		c2 = new Complejo(1, -1);
	}

	public void testSumaComplejos() {
		Complejo resultado = c1.sumar(c2);
		assertTrue(resultado.getParteReal() == 4);
		assertTrue(resultado.getParteImaginaria() == 4);
	}

//	public void testDivisionComplejos() {
//		Complejo resultado = c1.dividir(c2);
//		assertTrue(resultado.getParteReal() == -1);
//		assertTrue(resultado.getParteImaginaria() == 4);
//	}

}