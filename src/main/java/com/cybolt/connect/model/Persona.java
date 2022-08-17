package com.cybolt.connect.model;

public class Persona {
	 private int identificador;
	  private String nombre;
	  private String apellidop;
	  private String apellidom;
	  private String direccion;
	  private String municipio;
	  
	  	public int getIdentificador(){
	  		return identificador;
	    }
	    public void setIdentificador(int identificador){
	        this.identificador= identificador;
	    }
	    public String getNombre(){
	        return nombre;
	    }
	    public void setNombre(String nombre){
	        this.nombre =nombre;
	    }
	    public String getApellidop() {
	    	return apellidop;
	    }
	    public void setApellidop(String apellidop) {
	    	this.apellidop=apellidop;
	    }
	    public String getApellidom() {
	    	return apellidom;
	    }
	    public void setApellidom(String apellidom) {
	    	this.apellidom=apellidom;
	    }
	    public String getDireccion() {
	    	return direccion;
	    }
	    public void setDireccion(String direccion) {
	    	this.direccion=direccion;
	    }
	    public String getMunicipio() {
	    	return municipio;
	    }
	    public void setMunicipio(String municipio) {
	    	this.municipio=municipio;
	    }
}
