package co.edu.ufps.ProyectoWeb.model;

import java.io.Serializable;

public class Login implements Serializable{

	
	private Integer usuario;
	private Integer contrase�a;
	
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Login(Integer usuario, Integer contrase�a) {
		super();
		this.usuario = usuario;
		this.contrase�a = contrase�a;
	}


	public Integer getUsuario() {
		return usuario;
	}


	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}


	public Integer getContrase�a() {
		return contrase�a;
	}


	public void setContrase�a(Integer contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	
}
