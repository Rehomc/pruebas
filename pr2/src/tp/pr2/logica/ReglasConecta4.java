package tp.pr2.logica;

import tp.pr2.logica.Ficha;
import tp.pr2.logica.Pila;
import tp.pr2.logica.Tablero;

/**
 * Implementación de las reglas del Conecta 4.
 * Se deben implementar todos los métodos del interfaz, además del constructor.
 */

public class ReglasConecta4 implements ReglasJuego {

	private Tablero tablero;
	private Ficha turno;
	private boolean terminada;
	private Ficha ganador;
	private Pila undoStack;
	
	/**
	 * Constructor de la clase, sin parámetros.
	 */
	
	public ReglasConecta4() {
		
	}

	@Override
	public Tablero iniciaTablero() {
		tablero = new Tablero(7, 6);
		turno = Ficha.VACIA;
		terminada = false;
		ganador = Ficha.VACIA;
		undoStack = new Pila();
		//reescribir el reset()
		//reset();
		return null;
	}

	@Override
	public Ficha jugadorInicial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ficha hayGanador(Movimiento ultimoMovimiento, Tablero t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean tablas(Ficha ultimoEnPoner, Tablero t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Ficha siguienteTurno(Ficha ultimoEnPoner, Tablero t) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
