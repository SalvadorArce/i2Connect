package com.cybolt.connect.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="ubicacion")
public class Ubicacion {

	 private static final long serialVersionUID = 1L;
	 
	 @Id
	 @Column(name="id_ubicacion")
	 @Basic(optional = false)
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id_ubicacion;
	 
	 //Colocar mapeo 
	 private int id_investigacion;
	 
	 @NotNull
	 @Column(name="latitud")
	 private String latitud;
	 
	 @NotNull
	 @Column(name="longitud")
	 private String longitud;
	 
	 @NotNull
	 @Column(name="pais")
	 private String pais;
	 
	 @NotNull
	 @Column(name="municipio")
	 private String municipio;
	 
	 public Ubicacion() {
		 
	 }
	 public Ubicacion(int id_ubicacion, String latitud, String longitud,
			 String pais, String municipio) {
		 
		 this.id_ubicacion=id_ubicacion;
		 //Falta colocar el This de la llave foranea
		 this.latitud=latitud;
		 this.longitud=longitud;
		 this.pais=pais;
		 this.municipio=municipio;
	 }
	 
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
