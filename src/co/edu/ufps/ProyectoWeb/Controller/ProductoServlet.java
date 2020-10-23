package co.edu.ufps.ProyectoWeb.Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.mysql.jdbc.Blob;

import co.edu.ufps.ProyectoWeb.DAO.LoginDAO;
import co.edu.ufps.ProyectoWeb.DAO.ProductoDAO;
import co.edu.ufps.ProyectoWeb.model.Login;
import co.edu.ufps.ProyectoWeb.model.Producto;


/**
 * Servlet implementation class ProductoServlet
 */
@WebServlet("/")
public class ProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductoDAO productoDao;
	private LoginDAO loginDao;
	private Login login1;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() {
    	productoDao = new ProductoDAO();
    	loginDao=new LoginDAO();
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		try {
		switch(action) {
		
		case"/new":
			mostrarFormulario(request,response);
		break;
		
		case "/actualizarProducto":
			//actualizarProducto(request,response);
			break;
			
		case "/admin":
			administrador(request,response);
			break;
		case"/guardarProducto":
		
			guardarProducto(request,response);
			break;
			
		case"/validar":
			validarLogin(request,response);
			
		
		default:
			//administrador(request,response);
		 break;		
			
		}
		}catch (SQLException ex) {
            throw new ServletException(ex);
        }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void administrador(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		        RequestDispatcher dispatcher = request.getRequestDispatcher("admin.jsp");
		        dispatcher.forward(request, response);
		    }
	private void validarLogin(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		
		Integer r;
		Integer usuario=Integer.parseInt(request.getParameter("userAdmin"));
		Integer contraseña=Integer.parseInt(request.getParameter("contraseñaAdmin"));
		this.login1=new Login(usuario,contraseña);
		r=loginDao.validarLogin(login1);
		System.out.println(r);
		
		if(r==1) {
		loginDao.setResultado(0);
		response.sendRedirect("test1.jsp");
		
		//request.getRequestDispatcher("test1.jsp").forward(request, response);			
	        }	
		else {
			response.sendRedirect("test2.jsp");
		}
		//else {
			//request.getRequestDispatcher("admin.jsp").forward(request, response);
		//}
		    }
	private void mostrarFormulario(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		        RequestDispatcher dispatcher = request.getRequestDispatcher("RegistrarProductos.jsp");
		        dispatcher.forward(request, response);
		    }
	//private void list(HttpServletRequest request, HttpServletResponse response)
	  //  throws ServletException, IOException {
		//        RequestDispatcher dispatcher = request.getRequestDispatcher("Principal.jsp");
		 //       dispatcher.forward(request, response);
		    //}
	private void guardarProducto(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, IOException {
		        Integer id = Integer.parseInt(request.getParameter("id"));
		        String referencia = request.getParameter("referencia");
		        String nombre = request.getParameter("nombre");
		        String descripcioncorta = request.getParameter("descripcionCorta");
		        String detalle = request.getParameter("detalle");
		        Double valor= Double.parseDouble(request.getParameter("valor"));
		        Integer categoria = Integer.parseInt(request.getParameter("categoria_id"));
		        Integer marca = Integer.parseInt(request.getParameter("marca_id"));
		        Integer imagen = Integer.parseInt(request.getParameter("imagen"));
		          		        
		        
		       
              Producto nuevoProducto = new Producto(id,referencia,nombre,descripcioncorta,detalle,valor,categoria,marca,imagen);
		      productoDao.registrarProducto(nuevoProducto);
		        response.sendRedirect("list");
		    }
	

}
