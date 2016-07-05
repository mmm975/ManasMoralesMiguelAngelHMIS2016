package org.ual.hmis.ejercicio03;

public class Ejercicio03 {

	private static boolean compruebaLoginEnBD(String username, String password) {
		return true;
	}

	public boolean comprobarCadena(String username, String password) {
		return !username.isEmpty() & !password.isEmpty() &
				username.length() < 30 & password.length() < 30
				? compruebaLoginEnBD(username, password) : false;
	}

}
