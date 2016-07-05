package org.ual.hmis.ejercicio03;

public class Complejo {
	private float _parteReal;
	private float _parteImaginaria;

	public Complejo(float parteReal, float parteImaginaria) {
		_parteReal = parteReal;
		_parteImaginaria = parteImaginaria;
	}

	public float getParteReal() {
		return _parteReal;
	}

	public float getParteImaginaria() {
		return _parteImaginaria;
	}

	public Complejo sumar(Complejo c) {
		return new Complejo(this.getParteReal() + c.getParteReal(), this.getParteImaginaria() + c.getParteImaginaria());
	}
}