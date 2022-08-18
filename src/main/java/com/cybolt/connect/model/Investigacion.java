package com.cybolt.connect.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	//Llave foranea a colocar
	private int identificador;
	
	
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
	public Investigacion(int id_investigacion, String tipo_de_delito, String descripcion,
			String direccion, String estatus) {
		
		this.id_investigacion=id_investigacion;
		this.tipodelito=tipodelito;
		this.descripcion=descripcion;
		this.direccion=direccion;
		this.estatus=estatus;
	}
	
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
