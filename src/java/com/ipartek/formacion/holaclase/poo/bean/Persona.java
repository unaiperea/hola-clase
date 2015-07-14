/**
 * 
 */
package com.ipartek.formacion.holaclase.poo.bean;

/**
 * Bean para modelar una persona f�sica
 * @author Unai
 *
 */
public class Persona {

	//Constantes
	public static final int EDAD_MINIMA = 18; //Al poner static se podr� acceder al atributo mediante la propia clase (Persona.EDAD_MINIMA)
	public static final int EDAD_MAXIMA = 99;
	
	//Atributos
	private String nombre = "An�nimo"; //As� se puede acceder desde fuera de la clase. Ya no est� encapsulado. Deber�a ser con un getter
	private String apellido;
	private int edad; //As� se puede acceder desde fuera de la clase. Ya no est� encapsulado. Deber�a ser con un getter
	private String email;
	private boolean aprobado;
	private long nota;

	
	//Constructores
	public Persona() {
		super();
		this.nombre   = "An�nimo";
		this.apellido = "Sin Determinar";
		this.edad     = EDAD_MINIMA;
		this.email    = "";
		this.aprobado = false;
		this.nota     = (long)0.0; //hay que castear el valor con el propio long
	}


	/**
	 * Constructor con par�metros
	 * @param nombre Nombre de la Persona
	 * @param edad de la Persona
	 */
	public Persona(String nombre, int edad) {
		//super(); quitamos la llamada al constructor por defecto y ponemos el nuestro
		this(); //Llamamos al constructor por defecto (Persona) con los atributos inicializados
		this.setNombre(nombre);
		this.setEdad(edad);
	}
	
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	
	public String setNombre(String nombre) {
		this.nombre = nombre;
		return this.nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}

	// Para que luego genere los comentarios como HTML
	/**
	 * Edad comprendida entre 18 y 99, casos:
	 * <ul>
	 *  <li>si es menor que 18 seteamos a 18 </li>
	 *  <li>si es mayor que 99 seteamos a 99 </li>
	 *  <li>Null no existe en un entero si es 0 seteamos a 18 </li>
	 * </ul>
	 * @param edad
	 */
	public int setEdad(int edad) {

		if ( edad < EDAD_MINIMA ){
			this.edad=EDAD_MINIMA;
		}else if ( edad > EDAD_MAXIMA ){
			this.edad = EDAD_MAXIMA;
		}else{
			this.edad = edad;
		}
		return this.edad;
	}

	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isAprobado() {
		return aprobado;
	}


	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}


	public long getNota() {
		return nota;
	}


	public void setNota(long nota) {
		this.nota = nota;
	}
	
	
	//M�todos y Utilidades
	
	@Override //Sobreescribe sobre el padre
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + ", email=" + email + ", aprobado="
				+ aprobado + ", nota=" + nota + "]";
	}
	

	
	
	
}
