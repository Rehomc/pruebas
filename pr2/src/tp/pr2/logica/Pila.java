package tp.pr2.logica;

/**
 * Pila: Lista ordenada con m�todo LIFO de acceso.
 * Nos permite almacenar y recuperar datos. 
 * Cuenta con dos atributos, un top que nos permite acceder a la 
 * cima y un moves que acumula los movimientos que podemos llegar 
 * a deshacer.
 */

public class Pila {
	private int top;
	//-1 <= moves < 10
	private int[] pila; 
	//vector circular
	private int moves; 
	//0 <= moves < alto*ancho
	
	/**
	 * Crea una pila de 10 elementos, vac�a.
	 */
	
	public Pila() {
		pila = new int[10];
		reiniciar();
	}
	
	/**
	 * A�ade un elemento a la pila.
	 * Incrementa moves siempre que no sea mayor o igual que 9.
	 * Incrementa top, si es mayor o igual a 10 pasar� a valer 0.
	 * @param col - N�mero de columna a almacenar en la pila.
	 */
	
	public void push(int x) {
		if (top < 9) ++top;
		pila[moves%10] = x;
		++moves;
	}
	
	/**
	 * Se elimina el elemento de la cima de la pila.
	 * Decrementa moves siempre que no sea igual que -1.
	 * Decrementa top, siempre que sea menor que 0 pasar� a 
	 * valer 9.  
	 * @return Devuelve el elemento de la cima de la pila 
	 * siempre que no est� vac�a.
	 */
	
	public int pop() {
		int x;
		if (top <= -1) x = -1;
		else {
			--moves;
			x = pila[moves%10];
			--top;
		}
		return x;
	}
	
	/**
	 * Consultora de la cima de la pila.
	 * @return Devuelve la cima de la pila si no est� vac�a.
	 */
	
	public int getTop() {
		int x = -1; 
		//-1 indica que la pila est� vac�a.
		if (top >= 0) x = pila[(moves-1)%10];
		return x;
	}
	
	/** 
	 * Consultora del n�mero del atributo moves.
	 * @return Devuelve un entero igual a moves.
	 */
	public int getMoves() {
		return moves;
	}
	
	/**
	 * Pone los atributos moves y top a sus constantes iniciales.
	
	 * 
	 * 
	 * Moves indica pila vac�a y top indica al primer elemento.
	 */
	
	public void reiniciar() {
		top = -1;
		moves = 0;
	}

}

