package tp.pr2.logica;

/**
 * Almacena la informaci�n de un tablero rectangular. 
 * El tama�o se fija en el momento de la construcci�n, 
 * y contiene m�todos para acceder a la informaci�n
 * de cada celda y para colocar fichas.
 */

public class Tablero {

	/**
	 * Construye un tablero vac�o.
	 * @param tx - Tama�o en la coordenada x (o n�mero de columnas).
	 * @param ty - Tama�o en la coordenada y y (o n�mero de filas).
	 */
	
	public Tablero(int tx,int ty) {
		
	}
	
	/**
	 * M�todo para obtener el alto del tablero.
	 * @return N�mero de filas del tablero.
	 */
	
	public int getAlto() {
		return 0;
	}
	
	/**
	 * M�todo para obtener el ancho del tablero.
	 * @return N�mero de columnas del tablero.
	 */
	
	public int getAncho() {
		return 0;
	}
	
	/**
	 * M�todo para acceder a la informaci�n de una casilla o celda concreta.
	 * @param x - N�mero de columna (1..ancho)
	 * @param y - N�mero de fila (1..alto)
	 * @return Informaci�n de la casilla. 
	 * 		   Si la casilla no es v�lida, devuelve Ficha.VACIA
	 */
	
	public Ficha getCasilla(int x,int y) {
		return null;
	}
	
	/**
	 * Permite especificar el nuevo contenido de una casilla. 
	 * Tambi�n puede utilizarse para quitar una ficha.
	 * @param x - N�mero de columna (1..ancho)
	 * @param y - N�mero de fila (1..alto)
	 * @param color - Color de la casilla. Si se indica Ficha.VACIA,
	 * 				  la celda quedar� sin ficha.
	 */
	
	public void setCasilla(int x,int y,Ficha color) {
		
	}
}
