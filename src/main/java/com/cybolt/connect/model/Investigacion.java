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
@Table (name ="investigacion")

public class Investigacion implements Serializable {
	
	private static final long serialVersionUID =1L;
	
	@Id
	@Column(name ="id_investigacion")
	@Basic(optional =false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_investigacion;
	
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "persona", referencedColumnName = "identificador", nullable = false)
	private Persona persona;
	
	
	@NotNull
	@Column(name ="tipo_de_delito")
	private String tipodelito;
	
	@NotNull
	@Column(name ="descripcion")
	private String descripcion;
	
	@NotNull
	@Column(name ="direccion")
	private String direccion;
	
	@NotNull
	@Column(name="estatus")
	private String estatus;
	
	public Investigacion() {
		
	}
	
	
	public Investigacion(Integer id_investigacion, Persona persona, String tipodelito, String descripcion, String direccion,
			String estatus) {
		
		this.id_investigacion = id_investigacion;
		this.persona = persona;
		this.tipodelito = tipodelito;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.estatus = estatus;
	}


	public Investigacion(Integer id_investigacion) {
		
		this.id_investigacion = id_investigacion;
	}


	public int getId_investigacion() {
		return id_investigacion;
	}
	public void setId_investigacion(Integer id_investigacion) {
		this.id_investigacion = id_investigacion;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public String getTipodelito() {
		return tipodelito;
	}
	public void setTipodelito(String tipodelito) {
		this.tipodelito = tipodelito;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
		
}
