package co.edu.ufps.ProyectoWeb.DAO;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


import co.edu.ufps.ProyectoWeb.model.Conexion;
import co.edu.ufps.ProyectoWeb.model.Producto;


public class ProductoDAO {
		private Conexion con;
		private String jdbcURL = "jdbc:mysql://localhost:3306/empresa?useSSL=false";
	    private String jdbcUsername = "root";
	    private String jdbcPassword = "";
	    private static final String INSERT_PRODUCTO_SQL = "INSERT INTO producto" + "  (id,referencia,nombre,descripcioncorta,detalle,valor,categoria_id,marca_id,imagen) VALUES " +
	            " (?, ?, ?, ?, ?, ?, ?, ?, ?);";

	    //private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
	    //private static final String SELECT_ALL_USERS = "select * from users";
	    //private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
	    //private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";
	    
	    public ProductoDAO() {	    	
	    	this.con=Conexion.getConexion();
	      }
	        	    
	    public void registrarProducto(Producto producto) throws SQLException {
			try {
				PreparedStatement preparedStatement = (PreparedStatement) con.setPreaparedStatement(INSERT_PRODUCTO_SQL);
					preparedStatement.setInt(1, producto.getId());
					preparedStatement.setString(2, producto.getReferencia());
					preparedStatement.setString(3, producto.getNombre());
					preparedStatement.setString(4, producto.getDescripcionCorta());
					preparedStatement.setString(5, producto.getDetalle());
					preparedStatement.setDouble(6, producto.getValor());
					preparedStatement.setInt(7, producto.getCategoria_id());
					preparedStatement.setInt(8, producto.getMarca_id());
					preparedStatement.setInt(9, producto.getImagen());
	            System.out.println(preparedStatement);
	            preparedStatement.executeUpdate();
	        }catch (SQLException e) {
	           
	        }	
	
}
	    
}
