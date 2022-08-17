package com.cybolt.connect.model;

public class Investigacion {
	
	private int id_investigacion;
	private int identificador;
	private String tipodelito;
	private String descripcion;
	private String direccion;
	private String estatus;
	
		public int getIdinvestigacion() {
			return id_investigacion;
		}
		public void setIdinvestigacion(int id_investigacion) {
			this.id_investigacion=id_investigacion;
		}
		public int getIdentificador() {
			return identificador;
		}
		public void setIdentificador(int identificador) {
			this.identificador=identificador;
		}
		public String getTipodelito() {
			return tipodelito;
		}
		public void setTipodelito(String tipodelito) {
			this.tipodelito=tipodelito;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion=descripcion;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion=direccion;
		}
		public String getEstatus() {
			return estatus;
		}
		public void setEstatus(String estatus) {
			this.estatus=estatus;
		}

}
