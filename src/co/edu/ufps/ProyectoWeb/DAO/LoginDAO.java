package co.edu.ufps.ProyectoWeb.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.edu.ufps.ProyectoWeb.model.Conexion;
import co.edu.ufps.ProyectoWeb.model.Login;

public class LoginDAO {
	private Conexion con;
	public int resultado=0;
	
	public LoginDAO() {
		this.con=Conexion.getConexion();
		
	}
	
	
	public int validarLogin(Login login) {
		
		try {
		String sql="select * from administrador where usuario=? and contrasena=?";
		
		PreparedStatement preparedStatement = (PreparedStatement) con.setPreaparedStatement(sql);
		preparedStatement.setInt(1, login.getUsuario());
		preparedStatement.setInt(2, login.getContrase�a());
		ResultSet rs=con.query();
     	while(rs.next()) {
     		resultado=1;
			login.setUsuario(Integer.parseInt(rs.getString("usuario")));
			login.setContrase�a(Integer.parseInt(rs.getString("contrasena")));	
			
		}
     	if(resultado==1){
     		return 1;     		
     	}
     	else {
     		return 0;
     	    }
		}
		catch(Exception ex) {
			return 0;
		}
		
				
	}


	public int getResultado() {
		return resultado;
	}


	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	

}
