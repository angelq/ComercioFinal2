package com.comercioFinal.dominio;

public class Atencion {
	
	private String observacion;
	private DiaAtencion dias;
	
	public Atencion() {
		// TODO Ap�ndice de constructor generado autom�ticamente
	}
	
	public Atencion(String observacion, DiaAtencion dias) {
		this.observacion = observacion;
		this.dias = dias;
	}

	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public DiaAtencion getDias() {
		return dias;
	}
	public void setDias(DiaAtencion dias) {
		this.dias = dias;
	}
	
	
}
