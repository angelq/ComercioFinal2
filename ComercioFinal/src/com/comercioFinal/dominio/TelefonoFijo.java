package com.comercioFinal.dominio;

public class TelefonoFijo extends Telefono {
	
	private int prefijoNacional;
	
	public TelefonoFijo() {
		// TODO Ap�ndice de constructor generado autom�ticamente
	}
	
	public TelefonoFijo(int caracteristicaLocal, int numero, int prefijoNacional) {
		super(caracteristicaLocal, numero);
		this.prefijoNacional = prefijoNacional;
	}

	public TelefonoFijo(int caracteristicaLocal, int numero) {
		super(caracteristicaLocal, numero);
		// TODO Ap�ndice de constructor generado autom�ticamente
	}

	public int getPrefijoNacional() {
		return prefijoNacional;
	}

	public void setPrefijoNacional(int prefijoNacional) {
		this.prefijoNacional = prefijoNacional;
	}

	
	
	

}
