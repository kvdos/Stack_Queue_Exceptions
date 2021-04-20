package pila_cola_exceptions;

public class Cola<E> {
	
	private Nodo<E> inicio; // Inicio de la cola
	private Nodo<E> fin; // Final de la cola
	
	public Cola() {
		
		inicio = null;
		fin = null;
	}
	
	public boolean vacia() {
		return inicio == null;
	}
	
	public void encolar(E dato) {
		// Creamos puntero (nuevo) y nodo que recibe valor del nodo y apunta a null:
		Nodo<E> nuevo = new Nodo();
		nuevo.setDato(dato); // Recibe el valor el nuevo nodo
		nuevo.setSiguiente(null); // Apunta a null siguiente al ser el fin de cola
		
		// Dos casos, que la cola esté vacía o no:
		if(vacia()) { // Si la cola está vacía, inicio y fin apuntarán al nuevo nodo:
			inicio = nuevo;
		} else { // Si no, el puntero siguiente del que era el último nodo apuntará
			fin.setSiguiente(nuevo); // al que es ahora el nuevo y último nodo.
		}
		fin = nuevo; // En ambos casos, puntero fin apunta al nuevo nodo.
	}
	
	public E desencolar() throws ErrorLista {
		
		if (vacia()) {
			throw new ErrorLista("La cola está vacía.");
		} else { // Si no está vacía, guardamos en una variable local el valor
			E dato = inicio.getDato(); // del nodo del inicio para retornarlo.
			if (inicio == fin) { // Si solo hay un nodo, borramos las referencias
				inicio = null; // y se elimina.
				fin = null;
			} else { // Si son diferentes, hay 2 o más nodos, avanzamos el puntero
				inicio = inicio.getSiguiente(); // del inicio al siguiente nodo.
			}
			return dato; // Retornamos el valor del nodo extraído.
		}
	}
	
	public E inicioCola() throws ErrorLista {
		
		if (vacia()) {
			throw new ErrorLista("La cola está vacía.");
			} else {
				return inicio.getDato();
			}
	}
	
	public E finCola() throws ErrorLista {
		if (vacia()) {
			throw new ErrorLista("La cola está vacía.");
		} else {
			return fin.getDato();
		}
	}
	
	public String toString() {
		
		if (vacia()) {
			return "La cola está vacía.";
		} else {
			String resultado = "";
			Nodo<E> aux = inicio;
			while (aux != null) {
				resultado += aux.toString();
				aux = aux.getSiguiente();
			}
			return resultado;
		}
	}
	
	
	
	
	

}
