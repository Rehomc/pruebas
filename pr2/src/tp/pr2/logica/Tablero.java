package tp.pr2.logica;

/**
 * Almacena la información de un tablero rectangular. 
 * El tamaño se fija en el momento de la construcción, 
 * y contiene métodos para acceder a la información
 * de cada celda y para colocar fichas.
 */

public class Tablero {

	/**
	 * Construye un tablero vacío.
	 * @param tx - Tamaño en la coordenada x (o número de columnas).
	 * @param ty - Tamaño en la coordenada y y (o número de filas).
	 */
	
	public Tablero(int tx,int ty) {
		
	}
	
	/**
	 * Método para obtener el alto del tablero.
	 * @return Número de filas del tablero.
	 */
	
	public int getAlto() {
		return 0;
	}
	
	/**
	 * Método para obtener el ancho del tablero.
	 * @return Número de columnas del tablero.
	 */
	
	public int getAncho() {
		return 0;
	}
	
	/**
	 * Método para acceder a la información de una casilla o celda concreta.
	 * @param x - Número de columna (1..ancho)
	 * @param y - Número de fila (1..alto)
	 * @return Información de la casilla. 
	 * 		   Si la casilla no es válida, devuelve Ficha.VACIA
	 */
	
	public Ficha getCasilla(int x,int y) {
		return null;
	}
	
	/**
	 * Permite especificar el nuevo contenido de una casilla. 
	 * También puede utilizarse para quitar una ficha.
	 * @param x - Número de columna (1..ancho)
	 * @param y - Número de fila (1..alto)
	 * @param color - Color de la casilla. Si se indica Ficha.VACIA,
	 * 				  la celda quedará sin ficha.
	 */
	
	public void setCasilla(int x,int y,Ficha color) {
		
	}
}
