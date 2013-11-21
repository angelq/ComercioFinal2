package com.comercioFinal.dominio;

public class DiaAtencion {
	
	private String dia, horaInicio, horaFin;
	private boolean seAtiende;

	public DiaAtencion() {
		// TODO Apéndice de constructor generado automáticamente
	}

	public DiaAtencion(String dia, String horaInicio, String horaFin,
			boolean seAtiende) {
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.seAtiende = seAtiende;
	}	
	
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}
	public boolean isSeAtiende() {
		return seAtiende;
	}
	public void setSeAtiende(boolean seAtiende) {
		this.seAtiende = seAtiende;
	}
	
	
}
