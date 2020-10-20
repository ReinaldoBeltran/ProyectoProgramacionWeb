package co.edu.ufps.ProyectoWeb.model;

import java.io.Serializable;

public class Empresa implements Serializable {
	
	private Integer id;
	private String nombre;
	private String quienessomos;
	private String emailcontacto;
	private String direccion;
	private String telefonoContacto;
	private String facebook;
	private String twitter;
	private String instagram;
	
		
	
	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Empresa(Integer id, String nombre, String quienessomos, String emailcontacto, String direccion,
			String telefonoContacto, String facebook, String twitter, String instagram) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.quienessomos = quienessomos;
		this.emailcontacto = emailcontacto;
		this.direccion = direccion;
		this.telefonoContacto = telefonoContacto;
		this.facebook = facebook;
		this.twitter = twitter;
		this.instagram = instagram;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getQuienessomos() {
		return quienessomos;
	}
	public void setQuienessomos(String quienessomos) {
		this.quienessomos = quienessomos;
	}
	public String getEmailcontacto() {
		return emailcontacto;
	}
	public void setEmailcontacto(String emailcontacto) {
		this.emailcontacto = emailcontacto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefonoContacto() {
		return telefonoContacto;
	}
	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}	
	

}
