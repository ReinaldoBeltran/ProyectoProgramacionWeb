package co.edu.ufps.ProyectoWeb.DAO;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import co.edu.ufps.ProyectoWeb.model.Producto;


public class ProductoDAO {
	
		private String jdbcURL = "jdbc:mysql://localhost:3306/empresa?useSSL=false";
	    private String jdbcUsername = "root";
	    private String jdbcPassword = "";
	    private static final String INSERT_PRODUCTOS_SQL = "INSERT INTO producto" + "  (id,referencia,nombre,descripcioncorta,detalle,valor,categoria_id,marca_id,imagen) VALUES " +
	            " (?, ?, ?, ?, ?, ?, ?, ?, ?);";

	    //private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
	    //private static final String SELECT_ALL_USERS = "select * from users";
	    //private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
	    //private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";

	    public ProductoDAO() {}

	    protected Connection getConnection() {
	        Connection connection = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            connection = (Connection) DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        return connection;
	    }
	    
	    public void registrarProducto(Producto producto) throws SQLException {
	        System.out.println(INSERT_PRODUCTOS_SQL);
	        // try-with-resource statement will auto close the connection.
	        try (Connection connection = getConnection(); PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(INSERT_PRODUCTOS_SQL)) {
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
	        } catch (SQLException e) {
	           
	        }
	    }
	
}
