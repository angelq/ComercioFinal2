package com.comercioFinal.dominio;

public class RedSocial {
	
	private String empresa, direccion;
	
	public RedSocial() {
		// TODO Apéndice de constructor generado automáticamente
	}
	
	public RedSocial(String empresa, String direccion) {
		this.empresa = empresa;
		this.direccion = direccion;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
