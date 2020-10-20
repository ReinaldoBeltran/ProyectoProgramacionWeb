package co.edu.ufps.ProyectoWeb.model;

import java.io.Serializable;

public class Categoria implements Serializable{
	
	private Integer id;
	private String descripcion;
	private String estado;
	
	
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Categoria(Integer id, String descripcion, String estado) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.estado = estado;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
	

}
