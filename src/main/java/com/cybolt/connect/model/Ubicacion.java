package com.cybolt.connect.model;

public class Ubicacion {

	 private int id_ubicacion;
	 private int id_investigacion;
	 private String latitud;
	 private String longitud;
	 private String pais;
	 private String municipio;
	 
	 	public int getIdubicacion() {
	 		return id_ubicacion;
	 	}
	 	public void setIdubicacion(int id_ubicacion) {
	 		this.id_ubicacion=id_ubicacion;
	 	}
	 	public int getIdinvestigacion() {
	 		return id_investigacion;
	 	}
	 	public void setIdinvestigacion(int id_investigacion) {
	 		this.id_investigacion=id_investigacion;
	 	}
	 	public String getLatitud() {
	 		return latitud;
	 	}
	 	public void setLatitud(String latitud) {
	 		this.latitud=latitud;
	 	}
	 	public String getLongitud() {
	 		return longitud;
	 	}
	 	public void setLongitud(String longitud) {
	 		this.longitud=longitud;
	 	}
	 	public String getPais() {
	 		return pais;
	 	}
	 	public void setPais(String pais) {
	 		this.pais=pais;
	 	}
	 	public String getMunicipio() {
	 		return municipio;
	 	}
	 	public void setMunicipio(String municipio) {
	 		this.municipio=municipio;
	 	}
   }
