package tp.pr2.logica;

import tp.pr2.logica.Ficha;
//import tp.pr2.logica.Tablero;

/**
 * Clase que implementa el movimiento para el juego del Conecta 4. 
 * Se deben implementar los métodos abstractos de la clase padre.
 */

public class MovimientoConecta4 extends Movimiento {

	private Ficha turno;
	private int col;	
	/**
	 * Constructor del objeto.
	 * @param donde - Columna en la que se colocará la ficha
	 * @param color - Color de la ficha que se pondrá (o jugador que pone).
	 */
	
	public MovimientoConecta4(int donde,Ficha color) {
		col = donde;
		turno = color;
	}

	@Override
	public Ficha getJugador() {
		/*
		turno = Ficha.VACIA;
		if (!isTerminada()) {
			if (undoStack.getMoves()%2 == 0) turno = Ficha.BLANCA;
			else turno = Ficha.NEGRA;
		}
		*/
		return turno;
		//¿¿??
		return super.getJugador();
	}

	@Override
	public boolean ejecutaMovimiento(Tablero tab) {
		boolean insertada = false;
		if (turno == getJugador() && col > 0 && 
			col <= tab.getAncho() && 
			undoStack.getMoves() < 
			tab.getAlto()*tab.getAncho()) {
			int y = tab.getAlto();
			//+1 por el primer decremento.
			while (y > 0 && !insertada) {
				if (tab.getCasilla(col, y) == Ficha.VACIA) {
					tab.setCasilla(col, y, turno);
					undoStack.push(col);
					insertada = true;
				
				} else --y;
			}
		}
		/*
		if (undoStack.getMoves() >= 
				tab.getAlto()*tab.getAncho())
			terminada = true;
		*/
		return insertada;
		return false;
	}

	@Override
	public void undo(Tablero tab) {
		boolean retro = false;
		int x = undoStack.pop();
		if (x != -1) {
			//x == -1 pila vacia
			int y = 0;
			while (!retro && y <= tab.getAlto()) {
				++y;
				if (tab.getCasilla(x, y) != Ficha.VACIA) {
					tab.setCasilla(x, y, Ficha.VACIA);
					retro = true;
				}
			}
		}
		//return retro;
	}
	
	
	
}
