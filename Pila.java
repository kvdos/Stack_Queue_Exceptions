package pila_cola_exceptions;

public class Pila<E> {
	
	private Nodo<E> cima;
	int size;
	
	public Pila() {
		cima = null;
		size = 0;
	}
	
	public boolean empty(){ // Consulta si la pila esta vacia.
		// true si el primer nodo (cima), no apunta a otro nodo.
		return cima == null;
	}

	public void push(E dato) { // Recibe el valor que tendrá el nuevo nodo
	
		Nodo<E> nuevo = new Nodo(); // Definimos el nuevo nodo y guarda el valor
		nuevo.setDato(dato);
		// Y pasamos a enlazar el nuevo nodo al principio o cima de la pila:
		if (empty()) { // Si está vacía,
			nuevo.setSiguiente(null); // Indicamos que no hay otro nodo después
			cima = nuevo; // Por lo que cima apuntará al nuevo nodo creado.
		} else { // De no estar vacía:
			nuevo.setSiguiente(cima); // El puntero siguiente del nuevo nodo apuntará al
			cima = nuevo; // al que era el nodo de encima, apuntando cima al nuevo nodo.
		}
		size++;
	}
	
	public E pop() throws ErrorLista {
	
		if(empty()) { // Si es nula la cima, significa que la pila está vacía.
			throw new ErrorLista("La pila está vacía."); // Imprimimos el mensaje de darse.
		} else { // De no ser nula la cima:
			E resultado = cima.getDato();
			 // Imprimimos el contenido del primer nodo
			cima = cima.getSiguiente(); // Y apuntamos al siguiente nodo como cima.
			size--;
			return resultado;
		}
	}
	
	public E peek() throws ErrorLista {
		if (empty()) {
			throw new ErrorLista("La pila está vacía.");
		} else {
			return cima.getDato();
		}
	}
	
	public E search(int posicion) throws ErrorLista { // El método recibe el valor que buscamos.
		if (empty()) { // Comprobamos si la pila está vacía.
			throw new ErrorLista("La pila está vacía");
			} else { //En caso de no estar vacía:
				if (posicion < 1 || posicion > size) {
					throw new ErrorLista("Posición incorrecta");
				} else {
					E resultado = null; // Creamos una variable local para almacenar el valor de los nodos.
					int position = 0;
					Nodo<E> aux = cima; // Hacemos 'copia' de la pila.
					// Mientras no sea el mismo valor ni hayamos recorrido toda la pila:
					while (position != posicion && aux != null) {
						// Damos el valor del nodo a resultado para seguir comparando:
						resultado = aux.getDato();
						aux = aux.getSiguiente(); // Apuntamos al siguiente nodo como cima.
						position++; // Sumamos una posición.
					}
					return resultado;
					
				}
			
			}
	}
	
	public String toString() {
		if(empty()) {
			return "La pila está vacía.";
		} else {
			String resultado="";
			Nodo<E> aux = cima;
			while(aux!=null) {
				resultado += aux.toString();
				aux = aux.getSiguiente();
			}
			return resultado;
		}
	}
	
		
	
}
