package pila_cola_exceptions;

public class PrincipalCola {

	public static void main(String[] args) {
		
		Cola<String> cola1 = new Cola<>();
		
//		Añadimos cuatro elementos:
		cola1.encolar("primero");
		cola1.encolar("segundo");
		cola1.encolar("tercero");
		cola1.encolar("cuarto");
		
		System.out.println(cola1.toString()); // Imprimimos la cola.
		
//		Eliminamos el elemento del inicio:
		try {
			System.out.println("El valor extraído es: " + cola1.desencolar());
		} catch (ErrorLista e) {
			System.out.println("null");
			e.printStackTrace();
		}
		
		System.out.println(); // Añadimos espacio
		
//		Vemos cuál es el elemento del inicio de la cola:
		try {
		System.out.println("El inicio de la cola es: " + cola1.inicioCola());
		} catch (ErrorLista e) {
			System.out.println("null");
			e.printStackTrace();
		}
		
		System.out.println(); // Añadimos espacio.
		
//		Vemos cuál es el elemento del final de la cola:
		try {
			System.out.println("El final de la cola es: " + cola1.finCola());
			} catch (ErrorLista e) {
				System.out.println("null");
				e.printStackTrace();
			}
		
	}

}
