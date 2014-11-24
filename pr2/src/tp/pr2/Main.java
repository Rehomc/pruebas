package tp.pr2;

import java.util.Scanner;

import tp.pr2.control.Controlador;
import tp.pr2.logica.Partida;

/**
 * Clase que contiene el punto de entrada a la aplicación.
 */

public class Main {

	/**
	 * Método principal de la aplicación.
	 * @param args - Argumentos pasados a la aplicación. No se utilizan.
	 */
	
	public static void main(java.lang.String[] args) {
			Scanner sc = new Scanner(System.in);
			Partida nueva = new Partida();
			Controlador controlador = new Controlador(nueva, sc);
			controlador.run();
			sc.close();
		
	}
}
