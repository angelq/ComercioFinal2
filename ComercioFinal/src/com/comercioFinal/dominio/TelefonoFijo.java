package com.comercioFinal.dominio;

public class TelefonoFijo extends Telefono {
	
	private int prefijoNacional;
	
	public TelefonoFijo() {
		// TODO Apéndice de constructor generado automáticamente
	}
	
	public TelefonoFijo(int caracteristicaLocal, int numero, int prefijoNacional) {
		super(caracteristicaLocal, numero);
		this.prefijoNacional = prefijoNacional;
	}

	public TelefonoFijo(int caracteristicaLocal, int numero) {
		super(caracteristicaLocal, numero);
		// TODO Apéndice de constructor generado automáticamente
	}

	public int getPrefijoNacional() {
		return prefijoNacional;
	}

	public void setPrefijoNacional(int prefijoNacional) {
		this.prefijoNacional = prefijoNacional;
	}

	
	
	

}
