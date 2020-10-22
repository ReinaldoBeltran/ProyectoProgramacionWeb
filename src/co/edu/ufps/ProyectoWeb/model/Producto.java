package co.edu.ufps.ProyectoWeb.model;

import java.io.Serializable;

import com.mysql.jdbc.Blob;

public  class Producto implements Serializable{
	
	private Integer id;
	
	private String referencia;
	
	private String nombre;
	
	private String descripcionCorta;
	
	private String detalle;
	
	private Double valor;
	
	
	
	private Integer categoria_id;
	
	private Integer marca_id;
	
	private Integer imagen;

	
	
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto(Integer id, String referencia, String nombre, String descripcionCorta, String detalle, Double valor,
			 Integer categoria_id, Integer marca_id, Integer imagen) {
		super();
		this.id = id;
		this.referencia = referencia;
		this.nombre = nombre;
		this.descripcionCorta = descripcionCorta;
		this.detalle = detalle;
		this.valor = valor;
		this.categoria_id = categoria_id;
		this.marca_id = marca_id;
		this.imagen = imagen;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcionCorta() {
		return descripcionCorta;
	}

	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}



	public Integer getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(Integer categoria_id) {
		this.categoria_id = categoria_id;
	}

	public Integer getMarca_id() {
		return marca_id;
	}

	public void setMarca_id(Integer marca_id) {
		this.marca_id = marca_id;
	}

	public Integer getImagen() {
		return imagen;
	}

	public void setImagen(Integer imagen) {
		this.imagen = imagen;
	}
	
	public Boolean validarCategoria(Integer idCategoria) {

		
		return false;
	}
	
	
	
	
	

}
