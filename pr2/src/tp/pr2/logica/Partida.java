package tp.pr2.logica;

import tp.pr2.logica.Ficha;
import tp.pr2.logica.Pila;
import tp.pr2.logica.Tablero;

/**
 * Clase para representar la información de una partida. 
 * Se encarga de almacenar el estado del tablero,
 * a quién le toca, si ya hay un ganador, etc., 
 * así como la lista de movimientos que se han ido realizando para poder deshacerlos. 
 * La partida guarda al menos los 10 últimos movimientos.
 */

public class Partida {

	private Tablero tablero;
	private Ficha turno;
	private boolean terminada;
	private Ficha ganador;
	private Pila undoStack;
	
	/**
	 * Construye una partida nueva.
	 * @param reglas - Reglas del juego que se utilizarán durante la partida 
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
	 * Reinicia la partida en curso. Esta operación no puede deshacerse. 
	 * Gracias al parámetro, permite cambiar el tipo de juego al que se juega.
	 * @param reglas - Las reglas del juego a utilizar a partir de ahora.
	 */
	//REVISAR
	public void reset(ReglasJuego reglas) {
		//especificar segun las reglas que hace y qué no
		undoStack.reiniciar();
		for (int x = 1; x <= tablero.getAncho(); x++)
			for (int y = 1; y <= tablero.getAlto(); y++)
				tablero.setCasilla(x, y, Ficha.VACIA);
	}
	
	/**
	 * Ejecuta el movimiento indicado.
	 * @param mov  - Movimiento a ejecutar. Se asume que el movimiento es compatible
	 * con las reglas de la partida que se está jugando 
	 * (si se está jugando a Conecta 4, el tipo de movimiento es Conecta 4, etc.). 
	 * En caso contrario, el comportamiento es indeterminado.
	 * @return true si se puede efectuar el movimiento. 
	 * Es un error intentar colocar una ficha del jugador que no tiene el turno, 
	 * cuando la partida está terminada, columna llena, ...
	 */
	
	public boolean ejecutaMovimiento(Movimiento mov) {
		return true;
	}

	/**
	 * Deshace el último movimiento ejecutado.
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
	 * Sólo válido si la partida ya ha terminado (isTerminada() == true).
	 * @return Color del ganador. Si la partida terminó en tablas, Ficha.VACIA. 
	 * Si la partida no ha terminado aún, el resultado es indeterminado.
	 */
	
	public Ficha getGanador() {
		return null;
	}

	/**
	 * Método para saber si la partida ha conluído ya o no.
	 * @return true si la partida ha acabado.
	 */
	
	public boolean isTerminada() {
		return true;
	}
	
	/**
	 * Método de acceso al tablero. 
	 * Dependiendo de cómo se haga la implementación del resto de clases 
	 * (principalmente de la clase Controlador), 
	 * es posible que no se utilice para nada en la práctica. 
	 * Sin embargo, es necesario implementarlo para poder ejecutar los test de unidad.
	 * @return Estado del tablero actual.
	 */
	
	public Tablero getTablero() {
		return null;
	}
	
}




