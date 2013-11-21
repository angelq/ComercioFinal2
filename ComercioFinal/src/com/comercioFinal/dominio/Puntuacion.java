package com.comercioFinal.dominio;

public class Puntuacion {

		private byte unaEstrella, dosEstrellas, tresEstrellas, cuatroEstrellas, cincoEstrellas;

		public Puntuacion() {
			// TODO Apéndice de constructor generado automáticamente
		}
		
		public Puntuacion(byte unaEstrella, byte dosEstrellas,
				byte tresEstrellas, byte cuatroEstrellas, byte cincoEstrellas) {
			this.unaEstrella = unaEstrella;
			this.dosEstrellas = dosEstrellas;
			this.tresEstrellas = tresEstrellas;
			this.cuatroEstrellas = cuatroEstrellas;
			this.cincoEstrellas = cincoEstrellas;
		}

		public byte getUnaEstrella() {
			return unaEstrella;
		}

		public void setUnaEstrella(byte unaEstrella) {
			this.unaEstrella = unaEstrella;
		}

		public byte getDosEstrellas() {
			return dosEstrellas;
		}

		public void setDosEstrellas(byte dosEstrellas) {
			this.dosEstrellas = dosEstrellas;
		}

		public byte getTresEstrellas() {
			return tresEstrellas;
		}

		public void setTresEstrellas(byte tresEstrellas) {
			this.tresEstrellas = tresEstrellas;
		}

		public byte getCuatroEstrellas() {
			return cuatroEstrellas;
		}

		public void setCuatroEstrellas(byte cuatroEstrellas) {
			this.cuatroEstrellas = cuatroEstrellas;
		}

		public byte getCincoEstrellas() {
			return cincoEstrellas;
		}

		public void setCincoEstrellas(byte cincoEstrellas) {
			this.cincoEstrellas = cincoEstrellas;
		}
		
		
}
