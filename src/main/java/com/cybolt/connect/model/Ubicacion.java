package com.cybolt.connect.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="ubicacion")
public class Ubicacion implements Serializable {

	 private static final long serialVersionUID = 1L;
	 
	 @Id
	 @Column(name="id_ubicacion")
	 @Basic(optional = false)
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id_ubicacion;
	 
	 @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	 @JoinColumn(name = "investigacion", referencedColumnName = "id_investigacion", nullable = false)
	 private Investigacion investigacion;
	 
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

	public Ubicacion(Integer id_ubicacion, Investigacion investigacion, String latitud, String longitud, String pais,
			String municipio) {
		
		this.id_ubicacion = id_ubicacion;
		this.investigacion = investigacion;
		this.latitud = latitud;
		this.longitud = longitud;
		this.pais = pais;
		this.municipio = municipio;
	}
	
	


	public Ubicacion(Integer id_ubicacion) {
		this.id_ubicacion = id_ubicacion;
	}

	public int getId_ubicacion() {
		return id_ubicacion;
	}

	public void setId_ubicacion(Integer id_ubicacion) {
		this.id_ubicacion = id_ubicacion;
	}

	public Investigacion getInvestigacion() {
		return investigacion;
	}

	public void setInvestigacion(Investigacion investigacion) {
		this.investigacion = investigacion;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	} 
	 
   }
