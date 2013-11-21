package com.comercioFinal.dominio;

public class Comercio {
	
	private String nombre, ruta, descripcion, seccion;
	private Puntuacion puntuacion;
	private Imagen imagen;
	private Atencion atencionCliente;
	private Contacto contacto;
	
	public Comercio(){
		
	}
	//constructor de prueba
	public Comercio(String nombre, String seccion, String descripcion){
		this.seccion=seccion;
		this.descripcion=descripcion;
		this.nombre=nombre;
	}
	
	public Comercio(String nombre, String descripcion){
		this.descripcion=descripcion;
		this.nombre=nombre;
	}
	
	public Comercio(String nombre, String ruta, String descripcion,
			Puntuacion puntuacion, Imagen imagen, Atencion atencionCliente,
			Contacto contacto) {
		super();
		this.nombre = nombre;
		this.ruta = ruta;
		this.descripcion = descripcion;
		this.puntuacion = puntuacion;
		this.imagen = imagen;
		this.atencionCliente = atencionCliente;
		this.contacto = contacto;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Puntuacion getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(Puntuacion puntuacion) {
		this.puntuacion = puntuacion;
	}
	public Imagen getImagen() {
		return imagen;
	}
	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}
	public Atencion getAtencionCliente() {
		return atencionCliente;
	}
	public void setAtencionCliente(Atencion atencionCliente) {
		this.atencionCliente = atencionCliente;
	}
	public Contacto getContacto() {
		return contacto;
	}
	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	
	
}
