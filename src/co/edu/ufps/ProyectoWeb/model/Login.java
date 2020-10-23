package co.edu.ufps.ProyectoWeb.model;

import java.io.Serializable;

public class Login implements Serializable{

	
	private Integer usuario;
	private Integer contraseña;
	
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Login(Integer usuario, Integer contraseña) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
	}


	public Integer getUsuario() {
		return usuario;
	}


	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}


	public Integer getContraseña() {
		return contraseña;
	}


	public void setContraseña(Integer contraseña) {
		this.contraseña = contraseña;
	}
	
	
}
