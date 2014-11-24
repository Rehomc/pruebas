package tp.pr2.logica;

/**
 * Clase que representa el movimiento de un jugador.
 * Tiene un m�todo para ejecutar el movimiento sobre la partida, 
 * y otro para deshacerlo. Es una clase abstracta; 
 * habr� una clase no abstracta por cada tipo de juego soportado.
 */

public abstract class Movimiento {

	/**
	 * Devuelve el color del jugador al que pertenece el movimiento. 
	 * (Puede hacerse abstracto)
	 * @return Color del jugador (coincide con el pasado al constructor).
	 */
	
	public Ficha getJugador() {
		return null;
	}
	
	/**
	 * Ejecuta el movimiento sobre el tablero que se recibe como par�metro. 
	 * Se puede dar por cierto que tablero recibido sigue las reglas del
	 * tipo de juego al que pertenece el movimiento. En caso contrario, 
	 * el comportamiento es indeterminado.
	 * @param tab - Tablero sobre el que ejecutar el movimiento
	 * @return true si todo fue bien. 
	 * Se devuelve false si el movimiento no puede ejecutarse sobre el tablero.
	 */
	
	public abstract boolean ejecutaMovimiento(Tablero tab);
	
	/**
	 * Deshace el movimiento en el tablero recibido como par�metro. 
	 * Se puede dar por cierto que el movimiento se ejecut� sobre ese tablero; 
	 * en caso contrario, el comportamiento es indeterminado. 
	 * Por lo tanto, es de suponer que el m�todo siempre funcionar� correctamente.
	 * @param tab - Tablero de donde deshacer el movimiento.
	 */
	
	public abstract void undo(Tablero tab);
	
}
