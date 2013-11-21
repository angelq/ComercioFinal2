package com.comercioFinal.dominio;

public class Imagen {

		private String descripcion, ubicacion, imagen;
		
		public Imagen() {
			// TODO Apéndice de constructor generado automáticamente
		}
		
		public Imagen(String descripcion, String ubicacion, String imagen) {
			this.descripcion = descripcion;
			this.ubicacion = ubicacion;
			this.imagen = imagen;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getUbicacion() {
			return ubicacion;
		}

		public void setUbicacion(String ubicacion) {
			this.ubicacion = ubicacion;
		}

		public String getImagen() {
			return imagen;
		}

		public void setImagen(String imagen) {
			this.imagen = imagen;
		}
		
		
}
