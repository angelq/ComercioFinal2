package com.comercioFinal.dominio;

public class Contacto {
	
	private String email, web;
	private Telefono telefono;
	private RedSocial redSocial;
	
	public Contacto() {
		// TODO Apéndice de constructor generado automáticamente
	}
		
	public Contacto(String email, String web, Telefono telefono,
			RedSocial redSocial) {
		this.email = email;
		this.web = web;
		this.telefono = telefono;
		this.redSocial = redSocial;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public Telefono getTelefono() {
		return telefono;
	}
	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}
	public RedSocial getRedSocial() {
		return redSocial;
	}
	public void setRedSocial(RedSocial redSocial) {
		this.redSocial = redSocial;
	}
	
	
}
