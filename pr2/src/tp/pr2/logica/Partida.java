package tp.pr2.logica;

import tp.pr2.logica.Ficha;
import tp.pr2.logica.Pila;
import tp.pr2.logica.Tablero;

/**
 * Clase para representar la informaci�n de una partida. 
 * Se encarga de almacenar el estado del tablero,
 * a qui�n le toca, si ya hay un ganador, etc., 
 * as� como la lista de movimientos que se han ido realizando para poder deshacerlos. 
 * La partida guarda al menos los 10 �ltimos movimientos.
 */

public class Partida {

	private Tablero tablero;
	private Ficha turno;
	private boolean terminada;
	private Ficha ganador;
	private Pila undoStack;
	
	/**
	 * Construye una partida nueva.
	 * @param reglas - Reglas del juego que se utilizar�n durante la partida 
	 * (al menos hasta que se ejecute reset).
	 */
	//REVISAR
	public Partida(ReglasJuego reglas) {
		tablero = new Tablero(7, 6);
		turno = Ficha.VACIA;
		terminada = false;
		ganador = Ficha.VACIA;
		undoStack = new Pila();
		reset(reglas);
	}
	
	/**
	 * Reinicia la partida en curso. Esta operaci�n no puede deshacerse. 
	 * Gracias al par�metro, permite cambiar el tipo de juego al que se juega.
	 * @param reglas - Las reglas del juego a utilizar a partir de ahora.
	 */
	//REVISAR
	public void reset(ReglasJuego reglas) {
		//especificar segun las reglas que hace y qu� no
		undoStack.reiniciar();
		for (int x = 1; x <= tablero.getAncho(); x++)
			for (int y = 1; y <= tablero.getAlto(); y++)
				tablero.setCasilla(x, y, Ficha.VACIA);
	}
	
	/**
	 * Ejecuta el movimiento indicado.
	 * @param mov  - Movimiento a ejecutar. Se asume que el movimiento es compatible
	 * con las reglas de la partida que se est� jugando 
	 * (si se est� jugando a Conecta 4, el tipo de movimiento es Conecta 4, etc.). 
	 * En caso contrario, el comportamiento es indeterminado.
	 * @return true si se puede efectuar el movimiento. 
	 * Es un error intentar colocar una ficha del jugador que no tiene el turno, 
	 * cuando la partida est� terminada, columna llena, ...
	 */
	
	public boolean ejecutaMovimiento(Movimiento mov) {
		return true;
	}

	/**
	 * Deshace el �ltimo movimiento ejecutado.
	 * @return true si se pudo deshacer.
	 */
	
	public boolean undo() {
		return true;
	}
	
	/**
	 * Devuelve el color del jugador al que le toca poner.
	 * @return Color del jugador, o Ficha.VACIA si la partida ha terminado.
	 */
	
	public Ficha getTurno() {
		return null;
	}

	/**
	 * Devuelve el color del ganador. 
	 * S�lo v�lido si la partida ya ha terminado (isTerminada() == true).
	 * @return Color del ganador. Si la partida termin� en tablas, Ficha.VACIA. 
	 * Si la partida no ha terminado a�n, el resultado es indeterminado.
	 */
	
	public Ficha getGanador() {
		return null;
	}

	/**
	 * M�todo para saber si la partida ha conlu�do ya o no.
	 * @return true si la partida ha acabado.
	 */
	
	public boolean isTerminada() {
		return true;
	}
	
	/**
	 * M�todo de acceso al tablero. 
	 * Dependiendo de c�mo se haga la implementaci�n del resto de clases 
	 * (principalmente de la clase Controlador), 
	 * es posible que no se utilice para nada en la pr�ctica. 
	 * Sin embargo, es necesario implementarlo para poder ejecutar los test de unidad.
	 * @return Estado del tablero actual.
	 */
	
	public Tablero getTablero() {
		return null;
	}
	
}




