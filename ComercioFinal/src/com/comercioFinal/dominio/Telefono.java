package com.comercioFinal.dominio;

public class Telefono {
	
	private int caracteristicaLocal, numero;
	
	public Telefono(){
		
	}
	
	public Telefono(int caracteristicaLocal, int numero) {
		this.caracteristicaLocal = caracteristicaLocal;
		this.numero = numero;
	}

	public int getCaracteristicaLocal() {
		return caracteristicaLocal;
	}

	public void setCaracteristicaLocal(int caracteristicaLocal) {
		this.caracteristicaLocal = caracteristicaLocal;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	
	
}
