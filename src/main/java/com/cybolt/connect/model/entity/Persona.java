package com.cybolt.connect.model.entity;

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
@Table(name = "personas")
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "identificador")
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identificador;

	@NotNull
	@Column(name = "nombre")
	private String nombre;

	@NotNull
	@Column(name = "apellido_paterno")
	private String apellidop;

	@NotNull
	@Column(name = "apellido_materno")
	private String apellidom;

	@NotNull
	@Column(name = "direccion")
	private String direccion;

	@NotNull
	@Column(name = "municipio")
	private String municipio;

	public Persona() {

	}

	public Persona(Integer identificador, String nombre, String apellidop, String apellidom, String direccion,
			String municipio) {

		this.identificador = identificador;
		this.nombre = nombre;
		this.apellidop = apellidop;
		this.apellidom = apellidom;
		this.direccion = direccion;
		this.municipio = municipio;
	}

	public Persona(Integer identificador) {

		this.identificador = identificador;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidop() {
		return apellidop;
	}

	public void setApellidop(String apellidop) {
		this.apellidop = apellidop;
	}

	public String getApellidom() {
		return apellidom;
	}

	public void setApellidom(String apellidom) {
		this.apellidom = apellidom;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

}
