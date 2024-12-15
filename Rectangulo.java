import daw.com.Pantalla;
import daw.com.Teclado;

public class Rectangulo {

	private int color;
	private Punto centro;
	private double base;
	private double altura;
	
	public Rectangulo() {
		this.color = 0;
		this.base = 0.0;
		this.altura = 0.0;
		this.centro = new Punto();
	}	
	
	public Rectangulo(int color, Punto centro, double base, double altura) {
		this.color = color;
		this.centro = centro;
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(Rectangulo r) {
		this.color = r.color;
		this.base = r.base;
		this.altura = r.altura;
		this.centro = new Punto(r.centro);
	}


	public void mostrarDatos() {
		Pantalla.escribirString("Altura del rectángulo: ", String.valueOf(altura));
		Pantalla.escribirString("Base del rectángulo: ", String.valueOf(base));
		Pantalla.escribirString("Color del rectángulo: ", String.valueOf(color));	
		Pantalla.escribirString("");
		centro.mostrarDatos();
	}
	
	/*
	 * Código duplicado
	 * Control de errores
	 * No usa métodos, los redefine
	 * No se ha leído la documentación de Teclado
	 * 
	 * Crear funciones para evitar código duplicado
	 * Modificar leerDatos() para cumplir especificaciones
	 * Usar los métodos adecuados para cada tipo
	 * Buscar un método para realizar conversiones seguras
	 */

	
	public void cambiarDatos() {
		
		//---para verlo mejor---
		
		String alturaNueva = Teclado.leerString("Indica el nuevo valor de la altura: ");
		while (efectivamenteEsUnNumero(alturaNueva) == false && !alturaNueva.isEmpty()) {
			alturaNueva = Teclado.leerString("Introduce una altura correcta: ");
		}
		if (!alturaNueva.isEmpty()) {
			double altura = pasarADouble(alturaNueva);
			setAltura(altura);
		}
		

		String baseNueva = Teclado.leerString("Indica el nuevo valor de la base: ");
		while (efectivamenteEsUnNumero(baseNueva) == false && !baseNueva.isEmpty()) {
			baseNueva = Teclado.leerString("Introduce una base correcta: ");
		}
		if (!baseNueva.isEmpty()) {
			double base = pasarADouble(baseNueva);
			setBase(base);
		}
		
		String colorNuevo = Teclado.leerString("Indica el nuevo valor del color: ");
		while (efectivamenteEsUnNumero(colorNuevo) == false && !colorNuevo.isEmpty()) {
			colorNuevo = Teclado.leerString("Introduce un color correcto: ");
		}
		if (!colorNuevo.isEmpty()) {
			int color = pasarAInt(colorNuevo);
			setColor(color);
		}

		String xNueva = Teclado.leerString("Indica el nuevo valor de la X del punto : ");
		while (efectivamenteEsUnNumero(xNueva) == false && !xNueva.isEmpty()) {
			xNueva = Teclado.leerString("Introduce el valor de X correcto: ");
		}
		if (!xNueva.isEmpty()) {
			int x = pasarAInt(xNueva);
			this.centro.setX(x);
		}

			
		String yNueva = Teclado.leerString("Indica el nuevo valor de la Y del punto : ");
		while (efectivamenteEsUnNumero(yNueva) == false && !yNueva.isEmpty()) {
			yNueva = Teclado.leerString("Introduce el valor de Y correcta: ");
		}
		if (!yNueva.isEmpty()) {
			int y = pasarAInt(yNueva);
			this.centro.setY(y);
		}

		///----------ahorrando todo el espacio xd---------
		
		/**setAltura(pasarADouble(Teclado.leerString("Indica el nuevo valor de la altura: ")));
		
		setBase(pasarADouble(Teclado.leerString("Indica el nuevo valor de la base: ")));

		setColor(pasarAInt(Teclado.leerString("Indica el nuevo valor del color: ")));

		this.centro.setX(pasarAInt(Teclado.leerString("Indica el nuevo valor de la X del punto : ")));

		this.centro.setY(pasarAInt(Teclado.leerString("Indica el nuevo valor de la X del punto : ")));
		*/
		
		//Double.isNaN(Double.valueOf(alturaNueva));
		
		
	}
	
	private int pasarAInt(String numero) {
		
		if (efectivamenteEsUnNumero(numero)) {
			return Integer.parseInt(numero);
		}
		return 0;
	}
	
	private double pasarADouble(String numero) {
		
		if (efectivamenteEsUnNumero(numero) && !numero.isEmpty()) {
			return Double.parseDouble(numero);
		}
		return 0.0;
	}
	
	private boolean efectivamenteEsUnNumero(String numero) {
		
		if (numero != null) {
			try {
				Double.parseDouble(numero);
				return true;
			} catch (NumberFormatException e){
				return false;
			}
		}
		return false;
	}
	
	
	
	/**
	 * @return the color
	 */
	public int getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(int color) {
		this.color = color;
	}

	/**
	 * @return the centro
	 */
	public Punto getCentro() {
		return centro;
	}

	/**
	 * @param centro the centro to set
	 */
	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
