package tp.pr2.logica;

/**
 * Clase que implementa el movimiento para el juego del Complica. 
 * Se deben implementar los m�todos abstractos de la clase padre.
 */

public class MovimientoComplica extends Movimiento {

	/**
	 * Constructor del objeto.
	 * @param donde - Columna en la que se colocar� la ficha
	 * @param color - Color de la ficha que se pondr� (o jugador que pone).
	 */
	
	public MovimientoComplica(int donde,Ficha color) {
		
	}

	@Override
	public Ficha getJugador() {
		// TODO Auto-generated method stub
		return super.getJugador();
	}

	@Override
	public boolean ejecutaMovimiento(Tablero tab) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void undo(Tablero tab) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
