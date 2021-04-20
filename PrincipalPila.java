package pila_cola_exceptions;

public class PrincipalPila {

	public static void main(String[] args) {
		
		Pila<Integer> pila1 = new Pila<>();
		
//		Apilamos cuatro elementos:
		pila1.push(10);
		pila1.push(20);
		pila1.push(0);
		pila1.push(30);
			
			System.out.println(pila1); // Imprimo la pila
		
		try {
//			Buscamos conocer la el valor que contiene la posición 3:
			System.out.println("El valor de la posición 3 es: " + pila1.search(3));
			
		}catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
		System.out.println(); // Añado espacio
		
		try {
//			Busco una posición fuera del rango para mostrar error
			System.out.println("El valor de la posición 3 es: " + pila1.search(5));
			
		}catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
			
			System.out.println(); // Añado espacio
			
		try {
//			Extraigo eliminando la cima de la pila:
			System.out.println("El valor estraido es: " + pila1.pop());
		}catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
			
			System.out.println(); // Añado espacio
			
//			Muestro el que es ahora la cima de la pila:
		try {
			System.out.println("La cima de la pila es: " + pila1.peek());
		}catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
			System.out.println(); // Añado espacio
			
		try {
//			Elimino todos los elementos para ver el mensaje de vacía:
			pila1.pop();
			pila1.pop();
			pila1.pop();
			
			// Intento eliminar un elemento de la lista:
			System.out.println("La cima de la pila es: " + pila1.pop());
			
		}catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
	}

}
