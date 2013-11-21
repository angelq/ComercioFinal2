package com.comercioFinal.dominio;

public class Celular extends Telefono{
	
	private int prefijoCompania;

	public Celular() {
		super();
		// TODO Ap�ndice de constructor generado autom�ticamente
	}

	public Celular(int caracteristicaLocal, int numero, int prefijoCompania) {
		super(caracteristicaLocal, numero);
		this.prefijoCompania = prefijoCompania;
	}

	public int getPrefijoCompania() {
		return prefijoCompania;
	}

	public void setPrefijoCompania(int prefijoCompania) {
		this.prefijoCompania = prefijoCompania;
	}
	
	
}
