import daw.com.Pantalla;

public class Ejecutar {

	public static void main(String[] args) {
		
		Rectangulo prueba = new Rectangulo(4, new Punto(5,7), 5.0, 3.0);
		
		/** prueba.mostrarDatos();
		
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("-----------------------------------");
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea();
		
		Rectangulo copia = new Rectangulo(prueba);
		copia.mostrarDatos();
		prueba.getCentro().setX(2);
		
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("-----------------------------------");
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea(); */
		
		Rectangulo copia = new Rectangulo(prueba);
		copia.mostrarDatos();
		
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("-----------------------------------");
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea();
		
		copia.cambiarDatos();
		
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("-----------------------------------");
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea();
		
		copia.mostrarDatos();
		
		//Si se le introduce letras te lo pide de nuevo hasta que le introduzcas un numero o blanco
		//Si se le introduce un espacio en blanco se dejará el valor anterior sin modificarlo
		//Si se le introduce un numero cambia el valor
	}

}
